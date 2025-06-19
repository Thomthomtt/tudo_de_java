package aula03;

import java.util.Scanner;
import java.util.Arrays;

public class Atividade08 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double notas[] = new double[5];
			double media=0, soma=0;
			for (int i=0; i<notas.length;i++) {
				System.out.println("Digite as notas: ");
				notas[i]=input.nextDouble();
				soma+=notas[i];
			}
			System.out.println(Arrays.toString(notas));
			media=soma/5;
			System.out.println(media);
			input.close();
			
	}

}
