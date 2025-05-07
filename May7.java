public class May7 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = {1, 2, 3, 4, 5};
        for (int num : array2) {
            System.out.println("array2 element: " + num);
        }
        int len = array1.length;
        array1[4] = 2;
        System.out.println("array1[4]: " + array1[4]);
    }
}
