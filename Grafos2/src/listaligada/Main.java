package listaligada;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			      //crio o vetor com 11 posicoes porque vou desprezar a posicao 0
			      LinkedList<Integer>[] linked = new LinkedList[11];
			      
			      int n = scan.nextInt();
			      int m = scan.nextInt();
			      Grafo g = new Grafo(n);
			      
			      for(int i = 0; i < m; i++) {
			    	  int a = scan.nextInt();
			    	  int b = scan.nextInt();
			    	  g.criaAdj(a, b);
			    	  
			      }
			     System.out.println(g.listar());
			     scan.close();
			   }

	

}
