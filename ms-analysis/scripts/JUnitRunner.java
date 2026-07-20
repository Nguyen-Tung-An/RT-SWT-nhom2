/**
 * Chay mot lop test JUnit 5 va in ket qua may-doc-duoc.
 *
 * Vi sao tu viet: may khong co junit-platform-console-standalone. Nhung da co day du
 * launcher + engine + api trong ~/.m2, nen goi thang Launcher API la du va nhanh hon
 * nhieu so voi goi `mvn test` cho tung mutant (mutation can chay lai test hang chuc lan
 * moi ham).
 *
 * In ra dung mot dong:  RESULT <tong> <thanh_cong> <that_bai>
 * Ma tra ve: 0 neu tat ca pass, 1 neu co test that bai — de goi tu Python nhu mot lenh.
 */
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder.request;

public class JUnitRunner {

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

        LauncherDiscoveryRequest req = request().selectors(selectClass(testClass)).build();
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        try {
            launcher.execute(req);
        } catch (Throwable t) {
            System.out.println("RESULT 0 0 0");
            System.exit(2);
            return;
        }

        TestExecutionSummary s = listener.getSummary();
        long ok = s.getTestsSucceededCount();
        long bad = s.getTestsFailedCount();
        long total = s.getTestsStartedCount();
        System.out.println("RESULT " + total + " " + ok + " " + bad);
        System.exit(bad > 0 ? 1 : 0);
    }
}
