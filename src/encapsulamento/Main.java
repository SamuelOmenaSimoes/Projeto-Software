package encapsulamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        ArrayList<Classes> roupas = new ArrayList<>();

        while (true) {
            System.out.println("1 - Registrar nova roupa");
            System.out.println("2 - Adicionar peças ao estoque");
            System.out.println("3 - Remover peças do estoque");
            System.out.println("4 - Exibir todas as roupas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();
                    System.out.print("Tamanho (P/M/G): ");
                    String tamanho = sc.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int qtd = sc.nextInt();
                    System.out.print("Valor unitário: ");
                    double valor = sc.nextDouble();

                    roupas.add(new Classes(marca, tipo, tamanho, qtd, valor));
                    System.out.println("Roupa registrada com sucesso!");
                    break;

                case 2:
                    if (roupas.isEmpty()) {
                        System.out.println("Nenhuma roupa cadastrada.");
                        break;
                    }
                    System.out.print("Digite o índice da roupa para adicionar estoque (0 a " + (roupas.size()-1) + "): ");
                    int indiceAdd = sc.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int addQtd = sc.nextInt();
                    roupas.get(indiceAdd).adicionarEstoque(addQtd);
                    roupas.get(indiceAdd).exibirInfo();
                    break;

                case 3:
                    if (roupas.isEmpty()) {
                        System.out.println("Nenhuma roupa cadastrada.");
                        break;
                    }
                    System.out.print("Digite o índice da roupa para remover estoque (0 a " + (roupas.size()-1) + "): ");
                    int indiceRemove = sc.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int removeQtd = sc.nextInt();
                    roupas.get(indiceRemove).removerEstoque(removeQtd);
                    roupas.get(indiceRemove).exibirInfo();
                    break;

                case 4:
                    if (roupas.isEmpty()) {
                        System.out.println("Nenhuma roupa cadastrada.");
                    } else {
                        for (int i = 0; i < roupas.size(); i++) {
                            System.out.println("Índice: " + i);
                            roupas.get(i).exibirInfo();
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}