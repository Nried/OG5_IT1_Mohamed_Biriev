package primzahlen;

import java.util.Scanner;

public class Primzahlen {

	
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Zahl bitte!");
	    long zahl = sc.nextLong();

	    if (zahl > 1) {

	        boolean primzahl = true;

	        for (long i = 2; i <= zahl / 2; i++) {

	            if (zahl % i == 0) {
	                primzahl = false;
	                break;
	            }
	        }

	        if (primzahl) {
	            System.out.println(zahl + " ist eine Primzahl");
	        } else {
	            System.out.println(zahl + " ist keine Primzahl");
	        }

	    } 
	}
}