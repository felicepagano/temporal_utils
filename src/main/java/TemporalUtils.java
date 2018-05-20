import io.vavr.collection.Stream;

import java.time.LocalDate;

public interface TemporalUtils {

    Stream<LocalDate> generateLazyMonths(LocalDate seed, int number);
}
