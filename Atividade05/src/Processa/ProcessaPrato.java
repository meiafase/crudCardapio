package Processa;


import java.io.File;
import java.util.List;
import java.util.Scanner;

import dominio.Pedido;

import java.io.IOException;

public class ProcessaPrato {
	public static void ProcessaPedidoPrato(List<Pedido> listaDePedido) throws IOException {
		
  int contador = 1;
  

  	File arquivo = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\arquivo-pratos.txt");
	Scanner leitor = new Scanner(arquivo);
    leitor.nextLine();

		Scanner ler = new Scanner(System.in);
  
  
	  System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("--- Página de fazer pedido (Pratos) ---");
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
    System.out.println("Não quer comida? Pressione 0 (zero)."); 
	  System.out.println("Escolha o prato-(Digite o numero do Pedido): ");
	  int prato = ler.nextInt();

    File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\arquivo-pratos.txt");
    Scanner leitorDois = new Scanner(arquivoDois);
    String linha = leitorDois.nextLine();
    
    if(prato == 0) {
    	Pedido pedido = new Pedido();
    	
    	pedido.setPrecoBebida(0);
      	pedido.setBebida("Vazio");
      	
      	listaDePedido.add(pedido);
    }

    while(leitorDois.hasNext()){
          linha = leitorDois.nextLine();
          String[] separaTres = linha.split("\t");
            if(prato == contador){
              Pedido pedido = new Pedido();
              
              pedido.setPrecoBebida(Double.parseDouble(separaTres[0].replaceAll(",", ".")));
		      pedido.setBebida(separaTres[1]);
		      
              listaDePedido.add(pedido);
            }
            contador += 1;
        }

    	ProcessaVinho.ProcessaPedidoVinho(listaDePedido);
		

	}

}