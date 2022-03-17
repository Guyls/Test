package isep.com;

import java.util.*;

class FactorialCalculator {
    public static void main(String args[]) {
        int i, fact = 1;
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Entrer un nombre");
        int number= sc.nextInt();


        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factoriel de " + number + " est: " + fact);
    }
}