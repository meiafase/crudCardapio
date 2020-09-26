package Processa;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import dominio.Pedido;

public class ProcessaBebida {
	public static void ProcessaPedidoBebida(List<Pedido> listaDePedido) throws IOException {
		
		
        
		  int contador = 1;

		  	File arquivo = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt");
			Scanner leitor = new Scanner(arquivo);
		    leitor.nextLine();

		    Scanner ler = new Scanner(System.in);
		  
		  
			System.out.println("");
		    System.out.println("");
		    System.out.println("");
		    System.out.println("");
		    System.out.println("--- Página de fazer pedido (Bebidas) ---");
		    System.out.println("");
			System.out.println("---------------------------");  
		    int contar = 1;
		      while(leitor.hasNext()){
		        String linhaTeste = leitor.nextLine();
		        String[] separa = linhaTeste.split("\t");

		        System.out.println("Pedido " + contar + ". " + separa[1] + " / R$" + separa[0]);
		        System.out.println(" ");
		        contar += 1;
		        }
		    System.out.println("Não quer bebida? Pressione 0 (zero)."); 
			System.out.println("Escolha a bebida-(Digite o numero do Pedido): ");
			int bebida = ler.nextInt();

		    File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt");
		    Scanner leitorDois = new Scanner(arquivoDois);
		    String linha = leitorDois.nextLine();

		    while(leitorDois.hasNext()){
		          linha = leitorDois.nextLine();
		          String[] separaTres = linha.split("\t");
		            if(bebida == contador){
		              Pedido pedido = new Pedido();
		              
		              pedido.setPrecoBebida(Double.parseDouble(separaTres[0].replaceAll(",", ".")));
				      pedido.setBebida(separaTres[1]);

		              listaDePedido.add(pedido);
		            }
		            contador += 1;
		        }

		    	ProcessaPrato.ProcessaPedidoPrato(listaDePedido);
	}
}
