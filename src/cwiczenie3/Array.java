package cwiczenie3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj ilość liczb : ");
        int quantityOfNumbers = scan.nextInt();
        int i = 1;
        int sumOfPowers = 0;
        int number;
        for (i = 1; i <= quantityOfNumbers; i++) {
            System.out.print("Liczba " + i  + " :");
            number = scan.nextInt();
            sumOfPowers += number * number;
        }
        System.out.println("Suma kwadratów podanych liczb to: " + sumOfPowers);
    }
}

//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rozmiar tablicy:");
//                int size = scanner.nextInt();
//                double[] array = new double[size];
//
//                for (int i = 0; i < array.length; i++) {
//        System.out.println("Podaj kolejną liczbę");
//        array[i] = scanner.nextDouble();
//        }
//
//        double sum = 0;
//        for (double v : array) {
//        sum += Math.pow(v, 2);
//        }
//
//        System.out.println("Suma kwadratów to: " + sum);