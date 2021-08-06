package edu.upb.algoritmos.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //We import Scanner library so that we can receive keyboard input
	Scanner sc = new Scanner(System.in);
	int numA=0;
	int numB=0;
	Boolean verificationPrime;
	Boolean BisGreater=false;
	//We ask the user to give initial and final range of the prime numbers
    //But also we verify that B is greater that A.
    while(true){
            System.out.println("\nBienvenido al programa de números primos!");
            System.out.println("\nPor favor ingresa el numero inicial del rango:");
            numA=sc.nextInt();
            System.out.println("\nPor favor ingresa el numero final del rango:");
            numB=sc.nextInt();
            if(numA>numB){
                System.out.println("\nEl rango esta mal puesto, por favor vuelve a intentarlo:");
            }
            else{
                break;
            }
    }
        System.out.println("\nEl rango de numeros primos es:");
	for(int i = numA;i<= numB;i++){
	    if(i ==1 || i ==0){
	        continue;
        }
	    else
        {
            verificationPrime=true;
            for(int x=2;x <=i/2;++x){
                if(i%x==0){
                    verificationPrime=false;
                    break;
                }
            }
            if(verificationPrime==true){
                System.out.println(i);
            }
        }
    }
    }
}
//Developed by Pedro Felipe Gómez Bonilla - ID:000396221