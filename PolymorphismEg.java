// polymorphism: having many forms
// objects fo different classes to be treated as objects of same superclass
// 1. Method Overloading
// 2. Method Overriding
public class PolymorphismEg {
    // 1. Method overloading
    // same method name but different length or datatype of parameters
    public void add(int a, int b) {
        System.out.println("two params");
        System.out.println(a+b);
    }
    
    public void add(int a, int b, int c) {
        System.out.println("Three params");
        System.out.println(a+b+c);
    }
    
    public void add(int a, int b, String name) {
        System.out.println("two int and a string param");
        System.out.println(a+b);
        System.out.println("Name: " + name); // Added name printing
    }
}
class Parent {
    //2. method Overriding
    // has same method name and parameters
    // requires inheritance
    public void greet() {
        System.out.println("parent says hello");
    }
    public void name (String name){
        System.out.println("Parent has name: "+name);
    }

}
class Child extends Parent {

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        super.greet();
    }

    @Override
    public void name(String name) {
        System.out.println("Child has name: "+name);
    }
    
}

class Impl1{
    public static void main(String[] args) {
        PolymorphismEg poly = new PolymorphismEg();
        poly.add(1,2);
        poly.add(1,2,3);
        poly.add(1,2,"Max");
    }
}