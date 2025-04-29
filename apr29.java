import java.util.Scanner;
public class apr29 {
    public static void prime(int a){
        for (int i=1; i<=a/2; i++) {
            if (a % i == 0) {
                System.out.println(a + " is not a prime number.");
                break;
            } else {
                System.out.println(a + " is a prime number.");
            }
        }
    }

    public static void even(int a){
        if (a % 2 == 0) {
            System.out.println(a + " is an even number.");
        } else {
            System.out.println(a + " is an odd number.");
        }
    }

    public static void table(int a){
        for (int i=1; i<=10; i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }

    public static void si(int pr, int ti, int ra){
        int simple_i = (pr*ti*ra)/100;
        System.out.println("Simple interest: "+ simple_i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter Principle: ");
        int pi = sc.nextInt();
        System.out.print("Enter time: ");
        int ti = sc.nextInt();
        System.out.print("Enter rate: ");
        int ra = sc.nextInt();

        // prime(a);
        // even(a);
        // table(a);
        si(pi, ti, ra);

        sc.close();
    }
}
