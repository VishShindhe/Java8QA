package demo;

import java.util.function.Function;

public class FunctionInterface {
    private static Function<Integer,Integer> add5 = i -> i+5;
    private static Function<Integer,Integer> mult5 = i -> i*5;

    public static void main(String[] args) {
        System.out.println(add5.apply(5));
        System.out.println(mult5.apply(20));
        System.out.println(add5.andThen(mult5).apply(5));
        System.out.println(add5.compose(mult5).apply(5));
    }
}
