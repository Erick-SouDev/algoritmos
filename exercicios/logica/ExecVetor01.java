package exercicios.logica;

import java.util.Scanner;

public class ExecVetor01 {
	public static void main(String[] args) {

		int vetorNumber[] = new int[5];
		int maiorValor = 0, menorValor = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("prencha o vetor");

		for (int index = 0; index < 5; index++) {
			vetorNumber[index] = input.nextInt();
		}

		maiorValor = vetorNumber[0];

		for (int i = 0; i < vetorNumber.length; i++) {
			if (vetorNumber[i] > maiorValor) {
				maiorValor = vetorNumber[i];
			}

		}

		System.out.println(" Maior Valor no vetor" + maiorValor);
		// System.out.println(menorValor);

	}
}
