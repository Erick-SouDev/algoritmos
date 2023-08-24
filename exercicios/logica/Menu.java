package exercicios.logica;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("--------------------------------- ");
		System.out.println("   OLA SEJA BEM VINDO AO MENU ");
		System.out.println("--------------------------------- ");
		System.out.println("ESCOLHA UMA OPCAO NO MENU ");
		String[] opacoes = { "SAIR", "PAGAR CONTA ", "ACESSAR SUA CONTA" };

		for (int index = 0; index < opacoes.length; index++) {
			System.out.println("\n" + opacoes[index] + " = " + index);
		}

		int opcao = 0;

		while (opcao == 0) {
			Scanner in = new Scanner(System.in);
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				imprimirConta();
				break;

			case 2:
				imprimirPagamento();
				break;

			default:
				System.out.println("ERRO VALOR INVALIDO");
				break;
			}

		}

	}

	public static void imprimirConta() {
		System.out.println("SUA CONTA");
	}

	public static void imprimirPagamento() {
		System.out.println("SEU PAGAMENTO");
	}

}
