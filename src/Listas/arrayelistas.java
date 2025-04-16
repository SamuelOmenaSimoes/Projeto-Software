package Listas;

import java.util.ArrayList;

public class arrayelistas {

	public static void main(String[] args) {

		        
		        System.out.println("DESAFIO 1:");
		        String[] nomes = {"Ana", "Carlos", "Alice", "Bruna"};
		        char letra = 'A';
		        int contador = 0;

		        for (String nome : nomes) {
		            if (nome.startsWith(String.valueOf(letra))) {
		                System.out.println(nome);
		                contador++;
		            }
		        }
		        System.out.println("Total de nomes com '" + letra + "': " + contador);
		        System.out.println();

		        System.out.println("DESAFIO 2:");
		        int[] numeros = {10, 20, 30, 40};
		        int soma = 0;

		        for (int n : numeros) {
		            soma += n;
		        }

		        double media = (double) soma / numeros.length;
		        System.out.println("Soma: " + soma);
		        System.out.println("Média: " + media);
		        System.out.println();

		        System.out.println("DESAFIO 3:");
		        int[] lista = {10, 20, 5, 6, 9, 5};

		        for (int n : lista) {
		            if (n % 2 == 0) {
		                System.out.println("Par: " + n);
		            }
		        }
		        System.out.println();

		        System.out.println("DESAFIO 4:");
		        String[] palavras = {"Banana", "Maçã", "Abacate", "Manga"};
		        char letraProibida = 'a';

		        for (String palavra : palavras) {
		            if (!palavra.toLowerCase().contains(String.valueOf(letraProibida))) {
		                System.out.println(palavra);
		            }
		        }
		    }
		}
