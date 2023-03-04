import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(4, 7, 5, 2, 9, 11)).stream();
        findMinMax(
                stream,
                (x, y) -> x.compareTo(0),
                (x, y) -> System.out.println(String.format("min: %s, max: %s", x, y))
        );
        stream.close();

        findEvenNumbers();
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (!list.isEmpty()) {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));

        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    public static void findEvenNumbers() {
        Stream<Integer> stream1 = new ArrayList<>(Arrays.asList(8, 6, 3, 1, 4, 5)).stream();
        int numbers = (int)(stream1.filter((n) -> (n % 2)==0)).count();
        System.out.println("Чётных чисел: " + numbers);
        stream1.close();
    }
}