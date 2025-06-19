package aula03;

public class Atividade06 {

	public static void main(String[] args) {
		int soma_tres=0, soma_cinco=0, somatotal=0;
		for(int i=1;i<=20;i++) {
				if (i%5==0) {
					soma_cinco=soma_cinco+i;}
				if (i%3==0) {
					soma_tres=soma_tres+i;}
		}
		somatotal=soma_tres+soma_cinco;
		System.out.println(soma_cinco + " + " + soma_tres + " = " + somatotal );}
}
