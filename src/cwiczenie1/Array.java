package cwiczenie1;

public class Array {
    public static void main(String[] args) {

        int[][] array = new int[4][];
        array[0] = new int[]{1};
        array[1] = new int[]{1, 2};
        array[2] = new int[]{6, 7, 8, 9};
        array[3] = new int[]{10};

        int sum = array[0][0] + array[1][0] + array[2][0] + array[3][0];
        System.out.println("Suma: " + sum);

    }
}
