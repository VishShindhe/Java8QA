package demo;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        //Conventional Way
        IPrintable obj1 = new PrintImpl();

        //Using Anonymous Inner Class
        IPrintable obj2 = new IPrintable() {
            @Override
            public void print() {
                System.out.println("From Anonymous inner class");
            }
        };

        /**
         *  Using lambda expression or Functional programming. 3 conditions have to be met
         *  1. parameters in abstract method should match with Lambda expression
         *  2. return type should match
         *  3. There should be only one abstract method in the abstract class, but it can have any number of concrete/default methods
         *
         *  You can use @FunctionalInterface to the abstract class to inform that it is functional interface & you cannot add more than one abstract methods.
         */

        IPrintable obj3 = () -> System.out.println("From Lambda expression");  //Simplest LE without param and without return type

        IPrintable2 obj4 = (firstName,lastName) -> firstName + " " +lastName;

        obj3.print();
        obj1.print();
        obj2.print();
        System.out.println(obj4.print("Vishwa", "Shindhe"));
    }
}
