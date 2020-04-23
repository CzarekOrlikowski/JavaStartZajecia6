package zadanie3;

public class EvenTest {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
                sum += i;
            } else sum += 0;
        }
        System.out.println();
        System.out.println("Suma liczb parzystych: " + sum);
    }
}
