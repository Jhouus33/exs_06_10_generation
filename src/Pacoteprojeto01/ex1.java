package Pacoteprojeto01;

import java.util.Calendar;

import java.util.Scanner;

//Fa�a um sistema que leia a idade de uma pessoa expressa
//em anos, meses e dias e mostre-a expressa apenas em dias. 

public class ex1 {
	public static void main (String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int anos, meses, dias;
		int idadeEmDias;
		
		System.out.println("Digite quantos anos voc� tem: ");
		anos = leitor.nextInt();
		System.out.println("Digite qual m�s voc� nasceu: ");
		meses = leitor.nextInt();
		System.out.println("Digite qual dia voc� nasceu: ");
		dias = leitor.nextInt();
		
		idadeEmDias = anos*365 + meses*30 + dias;
		System.out.println("Idade em dias = " + idadeEmDias);
		
		
		
	}
}
