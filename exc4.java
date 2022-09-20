/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
package exercicio;
import java.util.Locale;
import java.util.Scanner;

public class exc4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num;
		double salario, horasTrabalhadas, salarioHora;
		
		System.out.println("Digite seu número de funcionário: ");
		num = sc.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.println("Digite o valor recebido por hora: ");
		salarioHora = sc.nextDouble();
		
		salario = horasTrabalhadas * salarioHora;
		
		System.out.printf("Funcionário nº %d, seu salário é: %.2f%n ", num, salario);
		
		sc.close();
	}

}
