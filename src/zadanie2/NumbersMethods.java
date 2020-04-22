package zadanie2;

public class NumbersMethods {

    public void loopWhile(double lowerLimit, double upperLimit, double step) {
        while (lowerLimit <= upperLimit + step) {
            System.out.printf("%.2f ", lowerLimit);
            lowerLimit += step;
        }
    }

    public void loopDoWhile(double lowerLimit, double upperLimit, double step) {
        do {
            System.out.printf("%.2f ", lowerLimit);
            lowerLimit += step;
        } while (lowerLimit <= upperLimit + step);
    }
}
