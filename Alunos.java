package array;

import java.util.Scanner;

public class Alunos {

    public static void main(String[] args) {

        int[] notas = new int[4];

        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            // Menu de opções
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir notas");
            System.out.println("2. Calcular a média");
            System.out.println("3. Encontrar a maior nota");
            System.out.println("4. Encontrar a menor nota");
            System.out.println("5. Exibir todas as notas");
            System.out.println("0. Sair");
            escolha = scanner.nextInt();

            switch(escolha) {
                case 1:
                    System.out.println("Inserir notas:");
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print("Nota " + (i + 1) + ": ");
                        notas[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    int soma = 0;
                    for (int nota : notas) {
                        soma += nota;
                    }
                    int media = soma / notas.length;
                    System.out.println("A média das notas é: " + media);
                    break;
                case 3:
                    int maiorNota = notas[0];
                    for (int nota : notas) {
                        if (nota > maiorNota) {
                            maiorNota = nota;
                        }
                    }
                    System.out.println("A maior nota é: " + maiorNota);
                    break;
                case 4:
                    int menorNota = notas[0];
                    for (int nota : notas) {
                        if (nota < menorNota) {
                            menorNota = nota;
                        }
                    }
                    System.out.println("A menor nota é: " + menorNota);
                    break;
                case 5:
                    System.out.println("Notas dos alunos:");
                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Nota " + (i + 1) + ": " + notas[i]);
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }
}
