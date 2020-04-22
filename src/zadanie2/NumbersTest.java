package zadanie2;

public class NumbersTest {
    public static void main(String[] args) {

        double lowerLimit = 0.0;
        double upperLimit = 3.0;
        double step = 0.1;

        NumbersMethods test = new NumbersMethods();
        test.loopWhile(lowerLimit, upperLimit, step);
        System.out.println();
        test.loopDoWhile(lowerLimit, upperLimit, step);
    }
}
