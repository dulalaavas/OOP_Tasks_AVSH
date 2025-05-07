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

    static double SimpleInterest(double pi, double ti, double ra){
        double si = (pi*ti*ra)/100;

        System.out.print(si);

        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Vote(age);

        System.out.print("Enter Principle: ");
        double pi = sc.nextDouble();
        System.out.print("Enter Time: ");
        double ti = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double ra = sc.nextDouble();

        SimpleInterest(pi, ti, ra);

        sc.close();
    }
}