package aula03;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos usuarios tem na sala? ");
		int alunos = input.nextInt();
		int i=0;
		double soma_nota=0;
		while(i<alunos) {
			i++;
			System.out.printf("Digite a nota do aluno %d", i+1);
			double nota = input.nextDouble();
			soma_nota = soma_nota + nota;
		}
		double media= soma_nota/alunos;
		System.out.println(media==7?"A turma está na média: " + media:media>7?"A turma está acima da média: " + media:"A turma está abaixo da média: " +media);
	
	}

}
