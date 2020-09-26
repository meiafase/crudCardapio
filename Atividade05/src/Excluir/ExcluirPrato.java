package Excluir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import dominio.Pedido;
import sistema.Programa;

public class ExcluirPrato {

	public static void ExcluirPrato(List<Pedido> listaDePedido) throws IOException {
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

	        System.out.println(contar + ". " + separa[1] + " / R$" + separa[0]);
	        System.out.println(" ");
	        contar += 1;
	        }
	      
			System.out.println("Escolha o prato a ser editado - (Digite o numero do Pedido): ");
			int prato = ler.nextInt();
			
		    File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\arquivo-pratos.txt");
		    Scanner leitorDois = new Scanner(arquivoDois);
		    String linha = leitorDois.nextLine();
		    
		    FileWriter arquivoTres = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\arquivo-pratos.txt");
		    PrintWriter gravador = new PrintWriter(arquivoTres);
		    
		    String nomePratoEditado = null;
		    String precoPratoEditado = null;
		    gravador.print("PRECO\tPRATO \n");
		    while(leitorDois.hasNext()){
		        linha = leitorDois.nextLine();
		        String[] separaDois = linha.split("\t");

		        if(contador != prato) {
		        	gravador.print(separaDois[0] + "\t"+ separaDois[1] +"\n");
		        }
	            contador += 1;
		    }
		    gravador.close();
		    Programa.main(null);
	}

}
