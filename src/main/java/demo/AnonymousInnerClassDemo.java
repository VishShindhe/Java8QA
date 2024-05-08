package demo;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        IPrintable obj1 = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Anonymous Inner Class 1");
            }
        };
        IPrintable obj2 = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Anonymous Inner Class 2");
            }
        };
        obj1.print();
        obj2.print();
    }
}
