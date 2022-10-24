package estrutura_sequencial;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, D;
		
		System.out.println("Digite quatro valores inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		D = a * b - c * d;
		
		System.out.println("DIFERENÇA = " + D);
		
		
		sc.close();

	}

}
