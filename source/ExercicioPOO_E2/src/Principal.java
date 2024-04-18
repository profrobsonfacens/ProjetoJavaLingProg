/*
 * Prof. Robson Martins
 * ADS/GTI Facens
 * Exercicios POO / Exercicio 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao, numeroCracha, qtdeHoras, tipo;
        String nome, setor, funcao;
        double salario, valorHora;
        Funcionario funcionario = new Funcionario();
        do {
            System.out.println();
            System.out.println("Lista POO - Exercicio 2");
            System.out.println("---------------------");
            System.out.println("Menu:");
            System.out.println("1. Inserir Funcionario");
            System.out.println("2. Exibir Funcionarios");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao < 1 || opcao > 3) {
                continue;
            }
            if (opcao == 3) {
                break;
            }
            switch (opcao) {
                case 1:
                    System.out.print("Digite o numero do cracha: ");
                    numeroCracha = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite o setor: ");
                    setor = scanner.nextLine();
                    System.out.print("Digite a funcao: ");
                    funcao = scanner.nextLine();
                    do {
                        System.out.println("Selecione o tipo:");
                        System.out.println("1. Mensalista");
                        System.out.println("2. Horista");
                        tipo = scanner.nextInt();
                        scanner.nextLine();
                    } while (tipo != 1 && tipo != 2);
                    switch (tipo) {
                        case 1:
                            System.out.print("Digite o salario: ");
                            salario = scanner.nextDouble();
                            scanner.nextLine();
                            funcionario = new FuncionarioMensalista(
                                    numeroCracha, nome, setor, funcao, salario);
                            break;
                        case 2:
                            System.out.print("Digite a quantidade de horas: ");
                            qtdeHoras = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Digite o valor hora: ");
                            valorHora = scanner.nextDouble();
                            scanner.nextLine();
                            funcionario = new FuncionarioHorista(
                                    numeroCracha, nome, setor, funcao,
                                    qtdeHoras, valorHora);
                            break;
                    }
                    funcionarios.add(funcionario);
                    System.out.println("\nFuncionario cadastrado com sucesso.\n");
                    break;
                case 2:
                    if (funcionarios.isEmpty()) {
                        System.out.println("\nNenhum funcionario cadastrado.\n");
                    } else {
                        for (int i = 0; i < funcionarios.size(); i++) {
                            funcionario = funcionarios.get(i);
                            if (funcionario instanceof FuncionarioMensalista){
                                System.out.println("\n" + 
                                        ((FuncionarioMensalista)funcionario).imprimir() + "\n");
                            }
                            if (funcionario instanceof FuncionarioHorista){
                                System.out.println("\n" + 
                                        ((FuncionarioHorista)funcionario).imprimir() + "\n");
                            }
                        }
                    }
                    break;
            }
        } while (opcao != 3);

    }
    
}
