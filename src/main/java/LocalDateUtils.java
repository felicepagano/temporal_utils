import io.vavr.Function1;
import io.vavr.collection.Stream;
import io.vavr.control.Try;

import java.time.LocalDate;

public class LocalDateUtils implements TemporalUtils {

    @Override
    public Stream<LocalDate> generateLazyMonths(LocalDate seed, int number) {
        return Try.of(
                () -> Stream.iterate(seed.withDayOfMonth(1), (l) -> l.plusMonths(1)).take(number)
        ).getOrElse(Stream.empty());
    }

    public static void main(String[] args) {
        LocalDateUtils l = new LocalDateUtils();
        l.generateLazyMonths(null, 5).forEach(System.out::println);
    }
}
