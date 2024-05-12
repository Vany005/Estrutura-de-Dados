package exercicios;

import java.util.Scanner;
import java.util.Stack;

import cores.Cores;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		Scanner leia = new Scanner(System.in);

		do{	
			System.out.println(Cores.TEXT_GREEN+Cores.ANSI_BLACK_BACKGROUND);
			
			System.out.println(  " **********************************     "   );
			System.out.println( "  1 - Adicionar livro na pilha          "   );
			System.out.println( "  2 - Listar todos os livros            "   );
			System.out.println( "  3 - Retirar livro da pilha            "   );
			System.out.println( "  0 - Sair                              "   );
			System.out.println( " **********************************     "   );
			System.out.println( "  Entre com a opção desejada:           "   );
			System.out.println("                                        "+Cores.TEXT_RESET);
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro:");
				String livro = scanner.nextLine();
				pilha.add(livro);
				System.out.println(" Livro adicionado! \n");
				break;

			case 2:
				if(pilha.isEmpty()) {
					System.out.print("A pilha esta vazia\n");
				}else {
					System.out.print(pilha);
					
				}
				break;

			case 3:
				if(pilha.isEmpty()) {
					System.out.print("Um Livro foi retirado da Pilha!");
					opcao = leia.nextInt();
				}else {
					System.out.print(pilha.pop());
				}

				break;
			case 0:
				System.out.print("Programa Finalizado!");
				break;
			 } 
		}while(opcao != 0);
				
		

		scanner.close();
	}

	}


