package exercicios;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		int num = 1;
		int c = 1;
		
		System.out.println("Digite um n�mero: ");
		
		num = new Scanner(System.in).nextInt();
		System.out.println("A Tabuada do n�mero " + num + " � : ");
		
		for(c = 1; c <= 10; c++) 
			System.out.println(num + " * " + c + " = " + (num * c));

	}

}
