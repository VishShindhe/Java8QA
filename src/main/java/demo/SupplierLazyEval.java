package demo;

import java.util.function.Supplier;

public class SupplierLazyEval {
    public static void main(String[] args) {
        System.out.println(compute(()->isDivBy2(5), ()->isDivBy10(15)));
    }

    //Lazy evaluation ie, if first condition ie isDivBy2 returns false next condition is not evaluated
    private static boolean compute(Supplier<Boolean> num1, Supplier<Boolean> num2) {
        return num1.get()&&num2.get();
    }

    private static boolean isDivBy2(int i) {
        System.out.println("In Div by 2");
        return i%2==0;
    }

    private static boolean isDivBy10(int i) {
        System.out.println("In Div by 10");
        return i%10==0;
    }
}
