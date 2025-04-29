
import java.util.Scanner;

/* 1
public class hello{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("\n\nThis is my first program.\nI am on module STW4003CEM");
        System.out.println("\n\n\nA \"quoted\" String is \'much\' better if you learn the rules of \"escape sequences\". Also, \'\' represents an empty String.\nDon't forget: use \" instead of \"! is not the same as\"");
    }
}
*/

/* 2
public class hello{
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        }
}
*/

/* 3
public class hello{
    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        }
}
*/

/* 4 
public class hello{
    public static void main(String[] args) {
        System.out.println("A well-formed Java program has a main method with { and } braces.\n");
        
        System.out.println("A System.out.println statement has ( and ) and usually a String that starts and ends with a \" character.");
        System.out.println("(But we type \\\" instead!)");
        System.out.println("What is the difference between ");
        System.out.println("a ' and a \"?  Or between a \" and a \\\"?\n");

        System.out.println("One is what we see when we're typing our program. The other is what appears on the \"console.\"");
    }
}
*/

/* 5
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your gpa: ");
        double gpa = sc.nextDouble();

        char variableName = 'A';
        char char1 = sc.next().charAt(0);

        sc.close();
    }
}
*/

/* 6
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "You can vote" : "You can't vote";
        System.out.println(result);

        sc.close();
    }
}
*/

public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double principle = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}