/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
package exercicio;
import java.util.Locale;
import java.util.Scanner;

public class exc5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, numPecas;
		double valPeca,  valTotal;
		
		System.out.println("1) Digite o código da peça: ");
		codigo = sc.nextInt();
		
		System.out.println("1) Digite o número de peças: ");
		numPecas = sc.nextInt();
		
		System.out.println("1) Digite o valor unitário da peça: ");
		valPeca = sc.nextDouble();
		
		System.out.println("2) Digite o código da peça: ");
		codigo = sc.nextInt();
		
		System.out.println("2) Digite o número de peças: ");
		numPecas += sc.nextInt();
		
		System.out.println("2) Digite o valor unitário da peça: ");
		valPeca += sc.nextDouble();
		
		valTotal = numPecas* valPeca;
		
		System.out.printf("O valor a ser pago é de R$%.2f" ,valTotal);
		
		sc.close();
	}

}
