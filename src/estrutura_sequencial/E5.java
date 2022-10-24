package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código da peça 1: ");
		sc.nextInt();
		System.out.print("Quantidade de peças: ");
		int q1 = sc.nextInt();
		System.out.print("Valor unitário de cada peça 1: ");
		double v1 = sc.nextDouble();
		
		System.out.print("Código da peça 2: ");
		sc.nextInt();
		System.out.print("Quantidade de peças: ");
		double q2 = sc.nextDouble();
		System.out.print("Valor unitário de cada peça 2: ");
		double v2 = sc.nextDouble();
		
		double vFinal = (double)(q1 * v1) + (q2 * v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", vFinal);
		
		
		sc.close();

	}

}
