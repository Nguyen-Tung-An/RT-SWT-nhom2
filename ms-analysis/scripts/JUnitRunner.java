/**
 * Chay mot lop test JUnit va in ket qua may-doc-duoc.
 *
 * Vi sao tu viet: may khong co junit-platform-console-standalone. Nhung da co day du
 * launcher + engine + api trong ~/.m2, nen goi thang Launcher API la du va nhanh hon
 * nhieu so voi goi `mvn test` cho tung mutant (mutation can chay lai test hang chuc lan
 * moi ham).
 *
 * Cach goi:
 *   JUnitRunner <FQCN>              chay CA lop
 *   JUnitRunner <FQCN> m1 m2 ...    chi chay cac method duoc liet ke
 *
 * In ra:
 *   GREEN <tenMethod>               mot dong cho MOI test PASS  (chi khi chay ca lop)
 *   RESULT <tong> <thanh_cong> <that_bai>
 *
 * Ma tra ve: 0 neu khong co test that bai, 1 neu co — de goi tu Python nhu mot lenh.
 *
 * Vi sao can dong GREEN: dinh nghia T2 da dang ky truoc la "co IT NHAT MOT test xanh",
 * va phia Python da loc theo tung test (`greencheck.py`). Ban Java cu chan ca suite khi
 * chi mot test do — hai ngon ngu do hai thu khac nhau duoi cung mot ten. Danh sach GREEN
 * cho phep phia goi loc dung nhu Python.
 */
import java.util.ArrayList;
import java.util.List;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.support.descriptor.MethodSource;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.engine.DiscoverySelector;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectMethod;
import static org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder.request;

public class JUnitRunner {

    /** Ghi lai ket qua tung test, khong chi tong so nhu SummaryGeneratingListener. */
    static final class Tally implements TestExecutionListener {
        long started = 0, ok = 0, bad = 0;
        final List<String> green = new ArrayList<>();

        @Override
        public void executionStarted(TestIdentifier id) {
            if (id.isTest()) started++;
        }

        @Override
        public void executionFinished(TestIdentifier id, TestExecutionResult r) {
            if (!id.isTest()) return;
            if (r.getStatus() == TestExecutionResult.Status.SUCCESSFUL) {
                ok++;
                if (id.getSource().orElse(null) instanceof MethodSource) {
                    green.add(((MethodSource) id.getSource().get()).getMethodName());
                }
            } else {
                bad++;
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("RESULT 0 0 0");
            System.exit(2);
        }
        Class<?> testClass;
        try {
            testClass = Class.forName(args[0]);
        } catch (Throwable t) {
            // khong nap duoc lop test -> coi nhu khong co test nao chay
            System.out.println("RESULT 0 0 0");
            System.exit(2);
            return;
        }

        // Khong co ten method -> chay ca lop. Co ten -> chi chay dung nhung method do.
        List<DiscoverySelector> sel = new ArrayList<>();
        if (args.length == 1) {
            sel.add(selectClass(testClass));
        } else {
            for (int i = 1; i < args.length; i++) sel.add(selectMethod(testClass, args[i]));
        }

        Launcher launcher = LauncherFactory.create();
        Tally tally = new Tally();
        launcher.registerTestExecutionListeners(tally);
        try {
            LauncherDiscoveryRequest req =
                    request().selectors(sel.toArray(new DiscoverySelector[0])).build();
            launcher.execute(req);
        } catch (Throwable t) {
            System.out.println("RESULT 0 0 0");
            System.exit(2);
            return;
        }

        if (args.length == 1) {
            for (String g : tally.green) System.out.println("GREEN " + g);
        }
        System.out.println("RESULT " + tally.started + " " + tally.ok + " " + tally.bad);
        System.exit(tally.bad > 0 ? 1 : 0);
    }
}
