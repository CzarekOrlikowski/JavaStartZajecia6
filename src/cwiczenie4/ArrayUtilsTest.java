package cwiczenie4;

public class ArrayUtilsTest {
    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();
        int[][] array = new int[11][11];
        array = arrayUtils.arrayCreation();
        arrayUtils.arrayCalculation(array);
    }
}
