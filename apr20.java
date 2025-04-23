

/* 1. Write a JAVA program to find the maximum between three numbers.
public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("Largest number is: " + num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("Largest number is: " + num2);
        } else {
            System.out.println("Largest number is: " + num3);
        }

        sc.close();
    }
}
*/

/* 2. Write a JAVA program to check whether a number is negative, positive, or zero.
public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
*/

/* 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }

        sc.close();
    }
}
*/

/* 4. Write a JAVA program to check whether a number is even or odd.
public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        sc.close();
    }
}
*/

/* 5. Write a JAVA program to check whether a year is a leap year or not.
Hint: if year%4==0; if year%100!==0 ; year%400==0;

public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
*/

/* 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
            letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a consonant.");
        }

        sc.close();
    }
}
*/

//Some switch case programs
/* 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value.
public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the grade (A, B, C, D, F): ");

        char grade = sc.next().charAt(0);
        double gpa;

        switch (grade) {
            case 'A':
                gpa = 4.0;
                System.out.println("GPA: " + gpa);
                break;
            case 'B':
                gpa = 3.0;
                System.out.println("GPA: " + gpa);
                break;
            case 'C':
                gpa = 2.0;
                System.out.println("GPA: " + gpa);
                break;
            case 'D':
                gpa = 1.0;
                System.out.println("GPA: " + gpa);
                break;
            case 'F':
                gpa = 0.0;
                System.out.println("GPA: " + gpa);
                break;
            default:
                System.out.println("Invalid grade entered.");
                break;
        }

    }
}
*/

/* 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
public class apr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
                break;
        }
        sc.close();
    }
}
*/

