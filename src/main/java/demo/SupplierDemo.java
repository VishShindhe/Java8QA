package demo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> supplier = ()-> Math.random() * 100;
        System.out.println("Random number is : "+supplier.get());

    }
}
