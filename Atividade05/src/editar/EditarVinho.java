package editar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import dominio.Pedido;
import sistema.Programa;

public class EditarVinho {

	public static void EditarVinho(List<Pedido> listaDePedido) throws IOException {
		int contador = 1;
		  

	  	File arquivo = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
	    leitor.nextLine();

	    Scanner ler = new Scanner(System.in);
	  
	  
		System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("--- Página de fazer pedido (Vinhos) ---");
	    System.out.println("");
		System.out.println("---------------------------");
		int contar = 1;
	    while(leitor.hasNext()){
	        String linhaTeste = leitor.nextLine();
	        String[] separa = linhaTeste.split("\t");

	        System.out.println(contar + ". " + separa[0] + " / R$" + separa[1]);
	        System.out.println(" ");
	        
	        contar += 1;
	    }
	      
			System.out.println("Escolha o vinho a ser editado - (Digite o numero do Pedido): ");
			int vinho = ler.nextInt();
			
		    File arquivoDois = new File("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt");
		    Scanner leitorDois = new Scanner(arquivoDois);
		    String linha = leitorDois.nextLine();
		    
		    FileWriter arquivoTres = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt");
		    PrintWriter gravador = new PrintWriter(arquivoTres);
		    
		    String nomeVinhoEditado = null;
		    String precoVinhoEditado = null;
		    gravador.print("PRECO\tVINHO \n");
		    while(leitorDois.hasNext()){
		        linha = leitorDois.nextLine();
		        String[] separaDois = linha.split("\t");

		        if(contador == vinho) {
		        	System.out.println("Digite o novo nome do vinho: ");
		        	nomeVinhoEditado = ler.nextLine();
		        	nomeVinhoEditado = ler.nextLine();
		        	System.out.println("Digite o novo preço do vinho: ");
		        	precoVinhoEditado = ler.nextLine();
		        	gravador.print(nomeVinhoEditado + "\t"+ precoVinhoEditado +"\n");
		        	
		        }
		        if(contador != vinho) {
		        	gravador.print(separaDois[0] + "\t"+ separaDois[1] +"\n");
		        }
	            contador += 1;
		    }
		    gravador.close();
		    Programa.main(null);
	}
}
