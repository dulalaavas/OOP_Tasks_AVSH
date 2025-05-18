import java.util.Scanner;

public class Dog {
    String name;
    int age;
    String color;

    public void bark() {
        System.out.println(name + " can bark.");
    }

    public void wag() {
        System.out.println(name + " can wag its tail.");
    }

    public void details() {
        System.out.print("Name: " + name + " Age: " + age + " Color: " + color);
    }

    public int getAge() {
        System.out.print("Age: ");
        return age;
    }

    public String getName() {
        System.out.print("Name: ");
        return name;
    }

    public String getColor() {
        System.out.print("Color: ");
        return color;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog dn = new Dog();
        
        System.out.print("Enter dog's name: ");
        dn.name = sc.nextLine();

        System.out.print("Enter dog's age: ");
        dn.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter dog's color: ");
        dn.color = sc.nextLine();

        dn.bark();
        dn.wag();
        dn.details();

        System.out.println(dn.getName());
        System.out.println(dn.getAge());
        System.out.println(dn.getColor());

        sc.close();
    }
}
