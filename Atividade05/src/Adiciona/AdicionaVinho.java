package Adiciona;

import java.io.File;
import java.util.Scanner;

import sistema.Programa;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AdicionaVinho {
  @SuppressWarnings("null")
public static void AdicionarVinho() throws FileNotFoundException, IOException{

    FileWriter arquivo = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\vinhos-tabulados.txt", true);
    PrintWriter gravador = new PrintWriter(arquivo);
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o nome do vinho a ser adicionado:");
    String vinho = ler.nextLine();

    System.out.println("Informe o preco do vinho:");
    double preco = ler.nextDouble();

    gravador.append(vinho + "\t" + preco + "\n");
    gravador.close();

    Scanner leitor = new Scanner(System.in); 
    System.out.println("Deseja voltar ao menu principal? (SIM = 1 / NÂO = 0)");
      int menu = leitor.nextInt();
      
      if(menu == 1){
        Programa.main(null);
      }

  }
}