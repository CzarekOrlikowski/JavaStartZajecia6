package zadanie1;

import java.util.Scanner;

public class ArrayOfNames {

    public String[] addNames(int numberOfNames) {
        Scanner scanNames = new Scanner(System.in);
        String[] tableOfNames = new String[numberOfNames];
        int i;
        for (i = 1; i <= tableOfNames.length; i++) {
            System.out.print("Podaj imię nr " + i + " : ");
            tableOfNames[i-1] = scanNames.nextLine();
        }
        scanNames.close();
        return tableOfNames;
    }

    public void printNames(String[] table) {
        int i;
        for (i = table.length - 1; i >= 0; i--) {
            System.out.println("Witaj " + table[i] + "!");
        }
    }
}
