package ex_08_10;
//4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos
//		indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo
//		(1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, se a pessoa
//		era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler
//		os dados de 150 pessoas, calcule e mostre:
//		�	o n�mero de pessoas calmas; 
//		�	o n�mero de mulheres nervosas; 
//		�	o n�mero de homens agressivos; 
//		�	o n�mero de outros calmos;
//		�	o n�mero de pessoas nervosas com mais de 40 anos; 
//		�	o n�mero de pessoas calmas com menos de 18 anos.


import java.util.Scanner;

public class ex4 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int numParticipantes = 2;
		long[] participantes = new long[numParticipantes];
		long[] idParticipantes = new long[numParticipantes];
		int i = 0, genParticipante, persParticipante, calma = 0, mulheresNervosa =0, homensAgressivo = 0, outrosCalmo=0, nervosasMais40 = 0, calmasMenor18 = 0;
		
		while(i < numParticipantes) {
			System.out.println("Qual sua idade: ");
			idParticipantes[i] = read.nextLong();
				while(idParticipantes[i] < 1 || idParticipantes[i] > 130) {
					System.out.println("Qual sua idade: ");
					idParticipantes[i] = read.nextLong();
				}
			
			System.out.println("Qual seu g�nero: digite: \n 1-feminino \n 2-masculino \n 3-N�o-bin�rio ");
			genParticipante = read.nextInt();
				while(genParticipante < 1 || genParticipante > 3) {
					System.out.println("Qual seu g�nero: digite: \n 1-feminino \n 2-masculino \n 3-N�o-bin�rio ");
					genParticipante = read.nextInt();
				}
				
			System.out.println("Sobre sua personalidade escolha uma das op��es: \n 1- se a pessoa era calma \n 2- se voc� � uma pessoa nervosa \n 3- se considera uma pessoa agressiva ");
			persParticipante = read.nextInt();
				while(persParticipante < 1 || persParticipante > 3) {
					System.out.println("Sobre sua personalidade escolha uma das op��es: \n 1- se a pessoa era calma \n 2- se voc� � uma pessoa nervosa \n 3- se considera uma pessoa agressiva ");
					persParticipante = read.nextInt();
				}
			
			switch (persParticipante) {
			case 1:
				if (genParticipante == 3) outrosCalmo++;
				if (idParticipantes[i] < 18) calmasMenor18++;
				calma++;
				break;
			case 2:
				if (genParticipante == 1) mulheresNervosa++;
				if (idParticipantes[i] > 40) nervosasMais40++;
				break;
			case 3:
				if(genParticipante == 2) homensAgressivo++;
				break;
			
			default:
				System.out.println("Algo de errado n�o est� certo! "  );
			}
			
			i++;
		}
		
		System.out.println("Pessoas Calmas: " + calma  );
		System.out.println("Mulheres nervosas: " +  mulheresNervosa );
		System.out.println("Homens agressivos: " +  homensAgressivo );
		System.out.println("N�o-bin�rio calmes: "+ outrosCalmo);
		System.out.println("Pessoas nervosas com mais de 40: " + nervosasMais40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + calmasMenor18);
		
		
	}
}
