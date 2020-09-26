package Excluir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import dominio.Pedido;
import sistema.Programa;

public class ExcluirBebida {

	public static void ExcluirBebida(List<Pedido> listaDePedido) throws IOException {
		int contador = 1;
		  

	  	File arquivo = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt");
		Scanner leitor = new Scanner(arquivo);
	    leitor.nextLine();

	    Scanner ler = new Scanner(System.in);
	  
	  
		System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("--- Página de remover (Bebidas) ---");
	    System.out.println("");
		System.out.println("---------------------------");  
	    int contar = 1;
	      while(leitor.hasNext()){
	        String linhaTeste = leitor.nextLine();
	        String[] separa = linhaTeste.split("\t");

	        System.out.println(contar + ". " + separa[1] + " / R$" + separa[0]);
	        System.out.println(" ");
	        contar += 1;
	        }
	      
			System.out.println("Escolha a bebida a ser editada -(Digite o numero do Pedido): ");
			int bebida = ler.nextInt();
			
		    File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt");
		    Scanner leitorDois = new Scanner(arquivoDois);
		    String linha = leitorDois.nextLine();
		    
		    FileWriter arquivoTres = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt");
		    PrintWriter gravador = new PrintWriter(arquivoTres);

		    gravador.print("PRECO\tBEBIDA \n");
		    while(leitorDois.hasNext()){
		        linha = leitorDois.nextLine();
		        String[] separaDois = linha.split("\t");

		        if(contador != bebida) {
		        	gravador.print(separaDois[0] + "\t"+ separaDois[1] +"\n");
		        }
	            contador += 1;
		    }
		    gravador.close();
		    Programa.main(null);
	}



}
