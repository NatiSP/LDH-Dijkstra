package algoritmo.app;

	import java.io.*;
	import java.util.*;
	 
	public class Dijkstra {
	   private static final Graph.Edge[] GRAPH = {
	      new Graph.Edge("a", "b", 7),
	      new Graph.Edge("a", "c", 9),
	      new Graph.Edge("a", "f", 14),
	      new Graph.Edge("b", "c", 10),
	      new Graph.Edge("b", "d", 15),
	      new Graph.Edge("c", "d", 11),
	      new Graph.Edge("c", "f", 2),
	      new Graph.Edge("d", "e", 6),
	      new Graph.Edge("e", "f", 9),
	   };
	   private static final String START = "a";
	   private static final String END = "e";
	   public static Graph g = new Graph(GRAPH);
	 
	   public static void main(String[] args) {

	      Ejecutar();
	   }
	   public static void Ejecutar(){
		  g.dijkstra(START);
		  g.printPath(END);
		  //g.printAllPaths();
	   }
	   
	   public Graph getGraph(){
		   return g;
	   }
	}
	
	/*************************************************************************/
	 
	