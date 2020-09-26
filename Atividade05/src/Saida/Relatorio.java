package Saida;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dominio.Pedido;
import sistema.Programa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Relatorio {
	public void gerarRelatorio(List<Pedido> listaDePedido, String observacao) throws IOException{
		
		FileWriter arquivoTres = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\pedido.txt");
	    PrintWriter gravador = new PrintWriter(arquivoTres);
	    Random gerador = new Random();
    double soma = 0;
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
		System.out.println("------- Resultado do Pedido -------");
		System.out.println("Pedido n�mero: " + gerador.nextInt(100));
		gravador.println("Pedido n�mero: " + gerador.nextInt(100));
		for(Pedido pedido : listaDePedido) {
			
			System.out.println("Pedido: " + pedido.getBebida());
			System.out.println("Pre�o: R$" + pedido.getPrecoBebida());
			System.out.println("-------  -------");
      
			gravador.println("Pedido: " + pedido.getBebida());
			gravador.println("Pre�o: R$" + pedido.getPrecoBebida());
			gravador.println("-------  -------");
			soma += pedido.getPrecoBebida();

			}
      if(observacao == null){
        observacao = "Nenhuma.";
      }
      System.out.println("Total: R$" + soma);
      System.out.println("Observa��o: " + observacao);
      System.out.println(" ");
      System.out.println(" ");
      gravador.println("Total: R$" + soma);
      gravador.println("Observa��o: " + observacao);
      gravador.println("-------  -------");
      gravador.close();
      

      Scanner ler = new Scanner(System.in); 
      System.out.println("Deseja voltar ao menu principal? (SIM = 1 / N�O = 0)");
      int menu = ler.nextInt();
      
      if(menu == 1){
        Programa.main(null);
      }
	  ler.close();
      
  }	
	}

