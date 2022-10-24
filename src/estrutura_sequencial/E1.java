package estrutura_sequencial;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, soma;

		System.out.println("Digite dois valores inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();

		soma = x + y;

		System.out.printf("SOMA = %d", soma);

		sc.close();

	}

}
