package Pacoteprojeto01;

import java.util.Scanner;

public class ex4 {
	
	public static void main (String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int A, B, C;
		int calculo;
		
		System.out.println("Digite o primeiro numero: ");
		A = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		B = leitor.nextInt();
		System.out.println("Digite o terceiro número: ");
		C = leitor.nextInt();
		
		calculo = ((A*A) + (B*B)) + ((B*B) + (C*C));
		System.out.println("Calculo = " + calculo/2);
		
		
		
	}

}
