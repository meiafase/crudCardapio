package Processa;


import java.io.File;
import java.util.List;
import java.util.Scanner;

import Saida.Relatorio;
import dominio.Pedido;

import java.io.IOException;

public class ProcessaVinho {
	public static void ProcessaPedidoVinho(List<Pedido> listaDePedido) throws IOException {
		
		int contador = 1;
  

  	File arquivo = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt");
		Scanner leitorDois = new Scanner(arquivo);
    leitorDois.nextLine();

		Scanner ler = new Scanner(System.in);
		
		String observacao = null;
  
	  System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("--- Página de fazer pedido (Vinhos) ---");
    System.out.println("");
	  System.out.println("---------------------------");  
    int contar = 1;
      while(leitorDois.hasNext()){
        String linhaTeste = leitorDois.nextLine();
        String[] separa = linhaTeste.split("\t");

        System.out.println("Pedido " + contar + ". " + separa[0] + " / R$" + separa[1]);
        System.out.println(" ");
        contar += 1;
        }
    System.out.println("Não quer vinho? Pressione 0 (zero).");
	  System.out.println("Escolha o vinho-(Digite o numero do Pedido): ");
	  int vinho = ler.nextInt();

    File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt");
    Scanner leitorTres = new Scanner(arquivoDois);
    String linha = leitorTres.nextLine();

    while(leitorTres.hasNext()){
    	  
          linha = leitorTres.nextLine();
          String[] separaTres = linha.split("\t");
            if(vinho == contador){
              Pedido pedido = new Pedido();
              
              pedido.setPrecoBebida(Double.parseDouble(separaTres[1].replaceAll(",", ".")));
		          pedido.setBebida(separaTres[0]);

              listaDePedido.add(pedido);
            }
            contador += 1;
        }
    	System.out.println("Deseja adicionar uma observação no pedido? (SIM = 1 / NÂO = 0)");
    	int decisao = ler.nextInt();
    	if(decisao == 1) {
    		System.out.println("Digite aqui:");
    		observacao = ler.nextLine();
    		observacao = ler.nextLine();
    	}

	  	Relatorio relatorio = new Relatorio();
	  	relatorio.gerarRelatorio(listaDePedido, observacao);


	}

}