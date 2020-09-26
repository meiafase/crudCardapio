package SobrePedido;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import Processa.ProcessaVinho;
import dominio.Pedido;
import sistema.Programa;

public class MenuPedido {
	
	public static void MenuPedido(List<Pedido> listaDePedido) throws IOException {
		
		Scanner ler = new Scanner(System.in); 
		File arquivo = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\pedido.txt");
		Scanner leitor = new Scanner(arquivo);
		int contador = 1;
		System.out.println("--- SEU PEDIDO ---");
		while(leitor.hasNext()){
	        String linhaTeste = leitor.nextLine();

	        System.out.println(linhaTeste);
	        contador += 1;
	    }
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. Adicionar");
		System.out.println("2. Excluir");
		System.out.println("3. Voltar ao menu principal");
		System.out.println(" ");
		System.out.println("Escolha:");
		int escolha = ler.nextInt();
		
		if(escolha == 1) {
			System.out.println("1. Adicionar bebida");
			System.out.println("2. Adicionar prato");
			System.out.println("3. Adicionar vinho");
			
			System.out.println("Escolha:");
			int escolhaDois = ler.nextInt();
			
			if(escolhaDois == 1) {
				File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt");
				Scanner leitorDois = new Scanner(arquivoDois);
				leitorDois.nextLine();
				int contar = 1;
			      while(leitorDois.hasNext()){
			        String linhaTeste = leitorDois.nextLine();
			        String[] separa = linhaTeste.split("\t");

			        System.out.println("Pedido " + contar + ". " + separa[1] + " / R$" + separa[0]);
			        System.out.println(" ");
			        contar += 1;
			        }
				System.out.println("Escolha a bebida-(Digite o numero do Pedido): ");
				int bebida = ler.nextInt();
				
				File arquivoTres = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt");
			    Scanner leitorTres = new Scanner(arquivoTres);
			    String linha = leitorTres.nextLine();
			    int contadorDois = 1;
			    while(leitorTres.hasNext()){
			          linha = leitorTres.nextLine();
			          String[] separaTres = linha.split("\t");
			            if(bebida == contadorDois){
			            	FileWriter arquivoQuatro = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\pedido.txt", true);
						    PrintWriter gravador = new PrintWriter(arquivoQuatro);
			            	gravador.println("Bebida adicional");
			            	gravador.println("Preço: R$" + separaTres[0]);
			            	gravador.println("Bebida: " + separaTres[1]);
			            	gravador.println("-------  -------");
			            	gravador.close();
			            }
			            contadorDois += 1;
			     }
			    MenuPedido.MenuPedido(null);
			    
			}else if(escolhaDois == 2) {
				File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\arquivo-pratos.txt");
				Scanner leitorDois = new Scanner(arquivoDois);
				leitorDois.nextLine();
				int contar = 1;
			      while(leitorDois.hasNext()){
			        String linhaTeste = leitorDois.nextLine();
			        String[] separa = linhaTeste.split("\t");

			        System.out.println("Pedido " + contar + ". " + separa[1] + " / R$" + separa[0]);
			        System.out.println(" ");
			        contar += 1;
			        }
				System.out.println("Escolha a prato-(Digite o numero do Pedido): ");
				int prato = ler.nextInt();
				
				File arquivoQuatro = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\arquivo-pratos.txt");
			    Scanner leitorTres = new Scanner(arquivoQuatro);
			    String linha = leitorTres.nextLine();
			    
			    int contadorTres = 1;
			    while(leitorTres.hasNext()){
			          linha = leitorTres.nextLine();
			          String[] separaTres = linha.split("\t");
			            if(prato == contadorTres){
			            	
			            	FileWriter arquivoCinco = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\pedido.txt", true);
						    PrintWriter gravadorDois = new PrintWriter(arquivoCinco);
						    gravadorDois.println("Prato adicional");
						    gravadorDois.println("Preço: R$" + separaTres[0]);
						    gravadorDois.println("Prato: " + separaTres[1]);
						    gravadorDois.println("-------  -------");
						    gravadorDois.close();
			            }
			            contadorTres += 1;
			     }
			    MenuPedido.MenuPedido(null);
			}else if(escolhaDois == 3) {
				File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt");
				Scanner leitorDois = new Scanner(arquivoDois);
				leitorDois.nextLine();
				int contar = 1;
			      while(leitorDois.hasNext()){
			        String linhaTeste = leitorDois.nextLine();
			        String[] separa = linhaTeste.split("\t");

			        System.out.println("Pedido " + contar + ". " + separa[0] + " / R$" + separa[1]);
			        System.out.println(" ");
			        contar += 1;
			        }
				System.out.println("Escolha a prato-(Digite o numero do Pedido): ");
				int vinho = ler.nextInt();
				
				File arquivoQuatro = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt");
			    Scanner leitorTres = new Scanner(arquivoQuatro);
			    String linha = leitorTres.nextLine();
			    
			    int contadorTres = 1;
			    while(leitorTres.hasNext()){
			          linha = leitorTres.nextLine();
			          String[] separaTres = linha.split("\t");
			            if(vinho == contadorTres){
			            	
			            	FileWriter arquivoCinco = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\pedido.txt", true);
						    PrintWriter gravadorDois = new PrintWriter(arquivoCinco);
						    gravadorDois.println("Vinho adicional");
						    gravadorDois.println("Preço: R$" + separaTres[1]);
						    gravadorDois.println("Vinho: " + separaTres[0]);
						    gravadorDois.println("-------  -------");
						    gravadorDois.close();
			            }
			            contadorTres += 1;
			     }
			    MenuPedido.MenuPedido(null);
			}
		}else if(escolha == 2) {
		            	
        	FileWriter arquivoCinco = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\pedido.txt");
		    PrintWriter gravadorDois = new PrintWriter(arquivoCinco);

		    gravadorDois.println("Pedido vazio ;(");
		    gravadorDois.close();
		    
		    System.out.println("Deseja voltar ao menu principal? (SIM = 1 / NÂO = 0)");
		    int voltarMenu = ler.nextInt();
		    if(voltarMenu == 1) {
		    	Programa.main(null);
		    }  
		    
		            
		}else if(escolha == 3) {
			Programa.main(null);
		}
	}




}
