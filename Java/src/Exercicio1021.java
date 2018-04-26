import java.util.Scanner;

public class Exercicio1021 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n100, n50, n20, n10, n5, n2, m1, m50, m25, m10, m5, m01;
		double n;
		n = input.nextDouble();
		
		double moedas = (n*100)%100;
		
		n100 = n/100;
		n %= 100;
		n50 = n/50;
		n %= 50;
		n20 = n/20;
		n %= 20;
		n10 = n/10;
		n %= 10;
		n5 = n/5;
		n %= 5;
		n2 = n/2;
		n%= 2;
		
		m1 = n;
		m50 = moedas/50;
		moedas %= 50;
		m25 = moedas/25;
		moedas %= 25;
		m10 = moedas/10;
		moedas %= 10;
		m5 = moedas/5;
		moedas %= 5;
		m01 = moedas;
		
		System.out.println("NOTAS:");
		System.out.println((int)n100 + " nota(s) de R$ 100.00");
		System.out.println((int)n50 + " nota(s) de R$ 50.00");
		System.out.println((int)n20 + " nota(s) de R$ 20.00");
		System.out.println((int)n10 + " nota(s) de R$ 10.00");
		System.out.println((int)n5 + " nota(s) de R$ 5.00");
		System.out.println((int)n2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println((int)m1 + " moeda(s) de R$ 1.00");
		System.out.println((int)m50 + " moeda(s) de R$ 0.50");
		System.out.println((int)m25 + " moeda(s) de R$ 0.25");
		System.out.println((int)m10 + " moeda(s) de R$ 0.10");
		System.out.println((int)m5 + " moeda(s) de R$ 0.05");
		System.out.println((int)m01 + " moeda(s) de R$ 0.01");
	}

}
