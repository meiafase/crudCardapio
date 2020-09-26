package sistema;


import java.util.Scanner;

import Adiciona.AdicionaBebida;
import Adiciona.AdicionaPrato;
import Adiciona.AdicionaVinho;
import Excluir.ExcluirBebida;
import Excluir.ExcluirPrato;
import Excluir.ExcluirVinho;
import Processa.ProcessaBebida;
import SobrePedido.MenuPedido;
import dominio.Pedido;
import editar.EditarBebida;
import editar.EditarPrato;
import editar.EditarVinho;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa {
  public static void main(String[] args) throws IOException{
    Scanner ler = new Scanner(System.in);
    
    List<Pedido> listaDePedido = new ArrayList<>();

    int escolha = 0;
    do{
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("++ Bem Vindo! ++");
      System.out.println(" ");
      System.out.println("1. Fazer pedido.");
      System.out.println("2. Incluir item.");
      System.out.println("3. Editar item.");
      System.out.println("4. Excluir item.");
      System.out.println("5. Sobre o Pedido.");
      System.out.println(" ");

      System.out.println("Escolha: ");
      escolha = ler.nextInt();

    }while(escolha < 1  || escolha > 5);


       if(escolha == 1) {
    	   ProcessaBebida.ProcessaPedidoBebida(listaDePedido);
           
       }else if(escolha == 2) {
    	   System.out.println("Selecione a categoria para inserir item");
           System.out.println("1. Adicionar Bebida");
           System.out.println("2. Adicionar Prato");
           System.out.println("3. Adicionar Vinho");

           System.out.println("Escolha uma opção: ");
           int decisao = ler.nextInt();

           if(decisao == 1){
             AdicionaBebida.AdicionarBebida();
           }else if(decisao == 2){
             AdicionaPrato.AdicionarPrato();
           }else if(decisao == 3){
             AdicionaVinho.AdicionarVinho();   
           }
       }else if(escolha == 3) {
    	   System.out.println("Selecione a categoria para Editar");
           System.out.println("1. Editar Bebida");
           System.out.println("2. Editar Prato");
           System.out.println("3. Editar Vinho");

           System.out.println("Escolha uma opção: ");
           int decisaoDois = ler.nextInt();
           
           if(decisaoDois == 1){
	           EditarBebida.EditarBebida(listaDePedido);
	       }else if(decisaoDois == 2){
	           EditarPrato.EditarPrato(listaDePedido);
	       }else if(decisaoDois == 3){
	           EditarVinho.EditarVinho(listaDePedido);   
	       }
    	   
       }else if(escolha == 4) {
    	   System.out.println("Selecione a categoria para Excluir");
           System.out.println("1. Excluir Bebida");
           System.out.println("2. Excluir Prato");
           System.out.println("3. Excluir Vinho");

           System.out.println("Escolha uma opção: ");
           int decisao = ler.nextInt();
           
           if(decisao == 1){
        	   ExcluirBebida.ExcluirBebida(listaDePedido);
	       }else if(decisao == 2){
	    	   ExcluirPrato.ExcluirPrato(listaDePedido);
	       }else if(decisao == 3){
	    	   ExcluirVinho.ExcluirVinho(listaDePedido);
	       }
    	   
       }else if(escolha == 5) {
    	   MenuPedido.MenuPedido(listaDePedido);
       }
        
  }
}