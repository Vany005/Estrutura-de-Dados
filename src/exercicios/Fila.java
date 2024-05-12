package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import cores.Cores;

public class Fila {

	public static void main(String[] args) {
		 Queue<String> fila = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {System.out.println(Cores.TEXT_BLUE+Cores.ANSI_BLACK_BACKGROUND);
	            System.out.println("                Menu:                        ");
	            System.out.println("       1 - Adicionar cliente na fila         ");
	            System.out.println("       2 - Listar todos os clientes na fila  ");
	            System.out.println("       3 - Chamar cliente da fila            ");
	            System.out.println("       0 - Sair                              ");
	            System.out.println(" Escolha uma opção:                          ");
	            System.out.println("                                             "+ Cores.TEXT_RESET);
	            opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do cliente: ");
	                    String nomeCliente = scanner.nextLine();
	                    fila.add(nomeCliente);
	                    System.out.println("Cliente adicionado!\n\n");
	                    
	                    break;
	                case 2:
	                    if (fila.isEmpty()) {
	                        System.out.println("A fila está vazia.\n\n");
	                        
	                    } else {
	                        System.out.println("Clientes na fila: " + fila);
	                       
	                    }
	                    break;
	                case 3:
	                    if (fila.isEmpty()) {
	                        System.out.println("A fila está vazia, não há clientes para chamar.\n\n");
	                        
	                    } else {
	                        System.out.println(fila.poll());
	                        System.out.println("O Cliente foi chamado ");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    break;
	               
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	

	}


