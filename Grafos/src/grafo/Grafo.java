package grafo;

import java.util.LinkedList;

public class Grafo {
	
	 LinkedList<Integer>[] linked;
	 public Grafo(int n) {
		 this.linked = new LinkedList[n+1];
		 for(int i = 1; i <= n; i++) {
	    	  linked[i] = new LinkedList<Integer>();
	      }
	 }
	 
	 public void criaAdj(int a, int b) {
		 linked[a].add(b);
	 }
	 
    
     
     public String listar(){
    	 String linkedString = "";
    	 for(int i = 1; i < this.linked.length; i++) {
    		linkedString += i + " -> " + linked[i] + "\n";
    	 }
		return linkedString;
     }
}
