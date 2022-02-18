package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
			
		int n, max, adc;
		n = 4;
		max = 10;
		adc = 1;
		
		System.out.println("Programa que exibe a tabuada de um numero");
		
		while (adc <= max) {
			System.out.println(n + " x " + adc + " = " + (n * adc));
			adc++;
		}

	}

}
