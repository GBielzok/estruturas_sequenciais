/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
package exercicio;
import java.util.Locale;
import java.util.Scanner;

public class exc3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int val1, val2, val3, val4, dif;
		
		System.out.println("Digite mais um valor ");
		val1 = sc.nextInt();
		
		System.out.println("Digite mais um valor ");
		val2 = sc.nextInt();
		
		System.out.println("Digite mais um valor ");
		val3 = sc.nextInt();
		
		System.out.println("Digite mais um valor ");
		val4 = sc.nextInt();
		
		dif = val1*val2 - val3*val4;
		
		System.out.printf("A diferença entre os dois primeiros e os dois últimos é: " +dif);
		
		sc.close();
	}

}
