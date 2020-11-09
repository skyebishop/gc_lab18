package lab18;

import java.util.*;

import java.util.Scanner;

public class PrimeNumbers {
	
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {

    System.out.printf("This program calculates the nth Prime number\n");
    System.out.printf("Please enter the nth prime number you want to find:");
    int n = scnr.nextInt();
    
    System.out.println(findPrime(n));
    
	}
	
	public static int findPrime(int n) {
	
		int i = 2; 
		int x = 2;
	for(i = 2, x = 2; n > 0; i++) {
        for(x = 2; x < i; x++) {
            if(i % x == 0) {
                break;
            }
        }
        if(x == i) {
            n--;
        }
    }
    return x;
    
	}
}
		
