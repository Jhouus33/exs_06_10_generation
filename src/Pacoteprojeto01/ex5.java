package Pacoteprojeto01;
// Faça um sistema que leia as 3 notas de um aluno e calcule
// a média final deste aluno. Considerar que a média é ponderada
// e que o peso das notas é: 2,3 e 5, respectivamente. 

import java.util.Scanner;

public class ex5 {
	public static void main (String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int A = 2, B = 3, C= 5;
		int calculo;
		
		
		calculo = A + B + C;
		System.out.println("Calculo = " + calculo/3);
	}
}
