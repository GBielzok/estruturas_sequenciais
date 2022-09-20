/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
package exercicio;
import java.util.Scanner;

public class exc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int val1, val2, res;
		
		System.out.println("Digite um número:");
		val1 = sc.nextInt();
		
		System.out.println("Digite mais um número:");
		val2 = sc.nextInt();
		
		res = val1 + val2;
		
		System.out.println("A soma dos números digitados é: " +res);
		
		sc.close();
	}

}
