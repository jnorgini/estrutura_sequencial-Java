package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número do funcionário: ");
		int n = sc.nextInt();
		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.print("Valor por hora: ");
		double valor = sc.nextDouble();
		
		double soma = (double)horas * valor;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", n, soma);
		

		sc.close();

	}

}
