package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		int a[]= new int[4], b[]= new int[4], c[]= new int[4], d[]= new int[4];
		Scanner input = new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			System.out.printf("Digite o %d valor para a: ", i);
			a[i]= input.nextInt();
			System.out.printf("Digite o %d valor para b: ", i);
			b[i]= input.nextInt();
			System.out.printf("Digite o %d valor para c: ", i);
			c[i]= input.nextInt();
			System.out.printf("Digite o %d valor para d: ", i);
			d[i]= input.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
}}
