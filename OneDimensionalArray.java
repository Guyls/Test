package isep.com;


import java.util.Random;
import java.util.Scanner;


public class OneDimensionalArray {

    public static void main(String[] args ) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Entrer un nombre ");
        int x = sc.nextInt();


        Scanner sca= new Scanner(System.in);
        System.out.print("Entrer un nombre ");
        int y= sca.nextInt();


        int max = 0;
        int min = 100;
        int a;
        double sum = 0;
        double average;


        Random rand = new Random();
        int[][] tableau = new int [x][y];
        for (int i = 0; i<x; i++ ) {
            tableau[i][i] = rand.nextInt(100);


            for (int j = 0; j<y; j++) {
                tableau[i][j] = rand.nextInt(100);
                sum = sum + tableau[i][j];


                System.out.print(tableau[i][j]+" ");


                a = tableau[i][j];
                if (a > max){
                    max = a;
                }
                if (a<min){
                    min = a;
                }

            }
            System.out.println();


        }
        System.out.println("Le maximum est " + max);
        System.out.println("Le minimum est " + min);
        average = sum/(x*y);
        System.out.println("La moyenne est " + average);
    }
}


