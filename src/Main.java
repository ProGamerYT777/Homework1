import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                if (num > 0) {
                    return true;
                }
                return false;
            }
        };
        System.out.println(predicate.test(2));
        System.out.println(predicate.test(-1));

        Predicate<Integer> check = t -> t > 0;
        System.out.println(check.test(4));
        System.out.println(check.test(-3));

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello " + name + "!");
            }
        };
        consumer.accept("Ivan");
        consumer.accept("Petr");

        Consumer<String> greetings = t -> System.out.println("Hello " + t + "!");
        greetings.accept("Elena");
        greetings.accept("Anna");

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double number) {
                return Math.round(number);
            }
        };
        System.out.println(function.apply(20.2));
        System.out.println(function.apply(1.9));

        Function<Double, Long> changingNumber = t -> Math.round(t);
        System.out.println(changingNumber.apply(5.7));
        System.out.println(changingNumber.apply(75.4));

        Supplier<Integer> randomNumber = new Supplier<Integer>() {
            @Override
            public Integer get() {
                int t = (int) Math.round(Math.random()*100);
                return t;
            }
        };
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());

        Supplier<Integer> random = () -> (int) (Math.round(Math.random() * 100));
        System.out.println(random.get());
        System.out.println(random.get());

        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> result = ternaryOperator(condition, ifTrue, ifFalse);

        System.out.println(result);
        }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
