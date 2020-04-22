package cwiczenie2;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        while (i <= 5) {
            System.out.println("Podaj liczbę " + i);
            int nextNumber = scan.nextInt();
            sum = sum + nextNumber;
            i++;
        }
        scan.close();
        System.out.println("Suma podanych liczb to: " + sum);

    }

}
