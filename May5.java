import java.util.Scanner;

public class May5{
    static int Vote(int age) {
        if (age > 18){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        return age;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Vote(age);

        sc.close();
    }
}