//programa que ler o númerp de um funcionário, seu número de horas trabalhadas, o valor de receber porhora
//e calcula o sálario desse funcionário. número e salário do funcionário ,com duas casas decimais.

//import java.util.Locale;

import java.util.Scanner;
import java.util.Locale;

public class exercicios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;

		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();

		salario = valorHora * horas;

		System.out.println("NÚMERO= " + numero);
		System.out.printf("SALÁRIO = R$ %.2f%n", salario);

		sc.close();
	}

}
