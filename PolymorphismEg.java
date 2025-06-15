// polymorphism: having many forms
// objects fo different classes to be treated as objects of same superclass
// 1. Method Overloading
// 2. Method Overriding
public class PolymorphismEg {
    public static void add(int a, int b) {
        System.out.println("two params");
        System.out.println(a+b);
    }
    public void add (int a, int b, int c) {
        System.out.println("Three params");
        System.out.println(a+b+c);
    }
    public void add (int a, int b, String name) {
        System.out.println("Three params");
        System.out.println(a+b);
    }
}