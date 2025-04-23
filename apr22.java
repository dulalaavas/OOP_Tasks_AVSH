/* 1. Write a program to input a sentence and count the number of uppercase and lowercase letters using a for loop.

    public class apr22 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            int upperCount = 0;
            int lowerCount = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upperCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowerCount++;
                }
            }

            System.out.println("Number of uppercase letters: " + upperCount);
            System.out.println("Number of lowercase letters: " + lowerCount);

            sc.close();
        }
}
*/

/* 2.Write a program that takes a sentence and replaces all vowels with * using a for loop and if-else. */
