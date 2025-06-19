package fundamentos03;

public class Aula01 {

	public static void main(String[] args) {
		String texto = new  String();
		String str = ("Shararara roro");
		texto = str.replace("ra", "le");
		System.out.println(texto);
		texto = str.substring(3);
		System.out.println(texto);
		texto = str.substring(5,7);
		System.out.println(3+4  + texto.toUpperCase());
		}

}
