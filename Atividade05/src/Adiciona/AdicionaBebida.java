package Adiciona;

import java.io.File;
import java.util.Scanner;

import sistema.Programa;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AdicionaBebida {
  public static void AdicionarBebida() throws FileNotFoundException, IOException{

    FileWriter arquivo = new FileWriter("C:\\Faculdade\\DesnvolvimentoDeSoftware\\Cardapio\\bebida.txt", true);
    PrintWriter gravador = new PrintWriter(arquivo);
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o nome da bebida a ser adicionada:");
    String bebida = ler.nextLine();

    System.out.println("Informe preco da bebida:");
    double preco = ler.nextDouble();

    gravador.append(preco + "\t" + bebida + "\n");
    gravador.close();

    Scanner leitor = new Scanner(System.in); 
    System.out.println("Deseja voltar ao menu principal? (SIM = 1 / N�O = 0)");
      int menu = leitor.nextInt();
      
      if(menu == 1){
        Programa.main(null);
      }

  }
}
