package exercicios;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		
		int n = 0;
		int resto = 0;
		
		Scanner LerTeclado = new Scanner(System.in);
		System.out.println("Verifica se um n�mero � par ou impar");
		System.out.println("Informe um n�mero: ");
		n = Integer.parseInt(LerTeclado.nextLine());
		resto = n % 2;
		//==, >=, <=, !=
		
		if (resto == 0) {
			System.out.println("O n�mero � par");
			
		}else {
			System.out.println("O n�mero � impar");
		}
		
				

	}

}
