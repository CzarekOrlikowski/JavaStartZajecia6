package zadanie1;

import java.util.Scanner;

public class ArrayOfNamesTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj ilość imion: ");
        int numberOfNames = scan.nextInt();
        String [] tableOfNames = new String[numberOfNames];
        ArrayOfNames test = new ArrayOfNames();
        tableOfNames = test.addNames(numberOfNames);
        test.printNames(tableOfNames);
    }
}
