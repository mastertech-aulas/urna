package urna;

import java.util.Scanner;

public class IO {

	public static void print(String mensagem) {
		System.out.println(mensagem);
	}
	public static void printCandidato(Candidato candidato) {
		System.out.println(candidato);
	}
	
	public static Scanner scan() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}
	
	public static int menu() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Digite 1 para votar");
		modelo.append("\n");
		modelo.append("Digite 2 para sair");
		System.out.println(modelo.toString());
		int menu = IO.scan().nextInt();
		return menu;
	}

	public static int pegarVoto() {
		System.out.println("Qual o numero do seu Candidato?");
		int codigo = scan().nextInt();
		return codigo;
	}
}
