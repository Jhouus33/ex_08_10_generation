package ex_08_10;
//5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final,
//		mostre a soma dos n�meros digitados.(DO...WHILE)

import java.util.Scanner;

public class ex5 {
	public static void main (String args[]) {
		Scanner read = new Scanner(System.in);
		int numero, soma = 0;
		
		
		do {
		System.out.println("Digite um n�mero: ");
		numero = read.nextInt();
		soma = soma + numero;
			
		}while(numero != 0);
	System.out.println("Soma de todos n�meros digitados = " + soma);
	}
}
