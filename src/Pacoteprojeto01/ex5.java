package Pacoteprojeto01;
// Fa�a um sistema que leia as 3 notas de um aluno e calcule
// a m�dia final deste aluno. Considerar que a m�dia � ponderada
// e que o peso das notas �: 2,3 e 5, respectivamente. 

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
