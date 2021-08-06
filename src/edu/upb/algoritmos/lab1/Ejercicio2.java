package edu.upb.algoritmos.lab1;

import java.util.Scanner;

public class Ejercicio2 {
    //We create two functions , one for a homemade gauss formula and also a difference algorithm for the same use
    public static int diyGauss(int n){
        int gauss=(n*(n+1))/2;
        return gauss;
    }
    public static int differenceGauss(int houses,int counter){
        int difference=(((houses*(houses+1))/2)-counter);
        return difference;
    }
    public static void main(String[] args)
    {
        //We create a int variable so that we can store the result according to the conditions made in the exercise.
        int result=-1;
        Scanner sc = new Scanner(System.in);
        //We ask the houses so that we can calculate the condition.
        System.out.println("\nHi! Welcome to the Street Houses program!");
        System.out.println("\nPlease, enter the number of houses that there are in the street:");
        int houses = sc.nextInt();
        for(int i=1;i<=houses;i++){
            //We start with n always being i-1 , because everytime a house passes we need to substract 1
            int n=(i-1);
            //We get the two values
            int gauss=diyGauss(n);
            int difGauss=differenceGauss(houses,i);
            //If the difference is the same result as Gauss , we return the number of houses, if not we return -1
            if(difGauss-gauss==gauss){
                result=i;
                break;
            }
        }
        System.out.println("\nThe number of houses for "+houses+" houses is:");
        System.out.println(result);
        System.out.println("\nIf the answer is '-1' it means that it doesn't satisfy the condition.");
        System.out.println("\nThanks for using the Street Houses Program!");


    }
}
//Developed by Pedro Felipe Gómez Bonilla - ID:000396221