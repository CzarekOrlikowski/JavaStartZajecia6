package cwiczenie4;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class ArrayUtils {

    public int[][] arrayCreation() {
        int[][] array = new int[11][11];
        int i = 0;
        int j = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                array[i][j] = (int) power((i + j), 2);
                System.out.println(array[i][j]);
            }
        }
        return array;
    }

    public void arrayCalculation(int[][] array) {
        int i = 0;
        int j = 0;
        int sumOfCrosses = 0;
        for (i = 0; i < array.length; i++) {
            j = i;
            sumOfCrosses += array[i][j];
        }
        for (i = 0; i < array.length; i++) {
            j = array.length - i - 1;
            sumOfCrosses += array[i][j];
        }
        System.out.println(("Suma przekątnych to: ") + sumOfCrosses);
    }
}


