        public long next(final long instant, int standardOffset, int saveMillis) {
            Chronology chrono = ISOChronology.getInstanceUTC();

            final int wallOffset = standardOffset + saveMillis;
            long testInstant = instant;

            int year;
            if (instant == Long.MIN_VALUE) {
                year = Integer.MIN_VALUE;
            } else {
                year = chrono.year().get(instant + wallOffset);
            }

            if (year < iFromYear) {
                // First advance instant to start of from year.
                testInstant = chrono.year().set(0, iFromYear) - wallOffset;
                // Back off one millisecond to account for next recurrence
                // being exactly at the beginning of the year.
                testInstant -= 1;
            }

            long next = iRecurrence.next(testInstant, standardOffset, saveMillis);

            if (next > instant) {
                year = chrono.year().get(next + wallOffset);
                if (year > iToYear) {
                    // Out of range, return original value.
                    next = instant;
                }
            }

            return next;
        }
