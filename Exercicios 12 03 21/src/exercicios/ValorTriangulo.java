package exercicios;

import java.util.Scanner;

public class ValorTriangulo {

	public static void main(String[] args) {
		
		int la = 0;
		int lb = 0;
		int lc = 0;
		
		String texto = ("Os valores não representam os lados de um triângulo");
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Verifica se os valores representam os lados de um triângulo");
		
		System.out.println("Lado A: ");
		la = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Lado B: ");
		lb = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Lado C: ");
		lc = Integer.parseInt(entrada.nextLine());
		
		if (la < (lb + lc) && lb < (la + lc) && (lc < la + lb)) {
			texto = "Os valores representam os lados de um triângulo";
		}
		
		System.out.println(texto);
		

	}

}
