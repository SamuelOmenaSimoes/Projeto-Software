package variaveis;

import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu nome:");
		nome = sc.next();
		System.out.println("seu nome é " + nome);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println(idade);
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		System.out.println(altura);
		
		sc.close();
	}

}
