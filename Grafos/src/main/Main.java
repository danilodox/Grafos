package main;

import java.util.LinkedList;
import java.util.Scanner;

import grafo.Grafo;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			     
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
