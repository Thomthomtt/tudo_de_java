package aula03;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma=0, media=0;
		System.out.println("Quantos alunos tem na sala");
		int alunos=input.nextInt();
		for (int i=0;i<alunos;i++) {
			System.out.printf("Digite a nota do aluno %d%n", i+1);
			soma+=input.nextDouble();
		}
		media=soma/alunos;
		System.out.println(media>=7?"A turma está aprovada, a média da turma é: "+media:"A turma não está aprovada, a média da turma é: "+media);
		
	}

}
