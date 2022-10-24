package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, t1, c1, t2, q1, r1;
		double pi = 3.14159;
		
		System.out.println("Digite três valores com ponto flutuante:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		t1 = a * c / 2;
		c1 = pi * Math.pow(c, 2);
		t2 = (a + b) * c / 2;
		q1 = Math.pow(b, 2);
		r1 = a * b;
		
		System.out.printf("TRIÂNGULO: %.3f%n", t1);
		System.out.printf("CÍRCULO: %.3f%n", c1);
		System.out.printf("TRAPÉZIO: %.3f%n", t2);
		System.out.printf("QUADRADO: %.3f%n", q1);
		System.out.printf("RETÂNGULO: %.3f", r1);
		
		
		sc.close();

	}

}
