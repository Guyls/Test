package isep.com;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args ) {


        Scanner sc= new Scanner(System.in); //
        System.out.print("entrer un nombre ");
        int x = sc.nextInt();


        Scanner sca= new Scanner(System.in); 
        System.out.print("entrer a number ");
        int y= sca.nextInt();


        int max = 0;
        int min = 100;
        int a;
        double sum = 0;
        double average;


        Random rand = new Random();
        int[][] tableau = new int [x][y];
        for (int j = 0; j<x; j++ ) {
            tableau[j][j] = rand.nextInt(100);


            for (int i = 0; i<y; i++) {
                tableau[i][i] = rand.nextInt(100);
                sum = sum + tableau[i][j];


                System.out.print(tableau[j][i]+" ");
            }
            System.out.println();
            average = sum/(y);
            sum = 0;
            System.out.println("La moyenne est " + average);
        }

    }
}
