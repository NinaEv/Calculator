package javacore.task_1_1;

public class Calculator {

    public interface Supplier<T> {
        T get();
    }

    static Supplier<Calculator> instance = Calculator::new;

    public interface BinaryOperator<T> {
        T apply(T t1, T t2);
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            if (y == 0)
                throw new ArithmeticException("Exception: divide by zero.");
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    };

    public interface UnaryOperator<T> {
        T apply(T t);
    }

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public interface Predicate<T> {
        boolean test(T t);
    }

    Predicate<Integer> isPositive = x -> x > 0;

    public interface Consumer<T> {
        void accept(T t);
    }

    Consumer<Integer> println = System.out::println;
}
