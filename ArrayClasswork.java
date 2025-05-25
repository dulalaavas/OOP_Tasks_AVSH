//May21

public class ArrayClasswork {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        double average = getAverage(numbers);

        System.out.println("Average: " + average);
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    public static void specialCheck(String[] array){

    }
}

