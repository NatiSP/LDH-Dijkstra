package algoritmo.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import algoritmo.app.Dijkstra;

public class DijkstraTest {

	static Dijkstra D;
	static String result = "";
	
	@BeforeClass
	static public void antesDelTest() {
		D = new Dijkstra();
		D.Ejecutar();
		result = D.getGraph().resultado;
	}

	@Test
	public void testCamino() {
		System.out.println("El valor necesitado es a -> c(9) -> d(20) -> e(26)");
		assertTrue(result.equalsIgnoreCase("a -> c(9) -> d(20) -> e(26)"));
	}
	
	@Test
	public void existeCamino(){
		assertTrue(!result.isEmpty());
	}
	
	//Comprobar si en el grafo están los nodos previstos (de la A a la F)
	@Test
	public void existenNodos(){
		System.out.println("Nodos creados en la ejecución: ");
		for(int i = 0; i < D.getGraph().nodos.size(); i++){
			System.out.println(D.getGraph().nodos.get(i));
			assertTrue(D.getGraph().nodos.get(i).equalsIgnoreCase("a") || 
					D.getGraph().nodos.get(i).equalsIgnoreCase("b") || 
					D.getGraph().nodos.get(i).equalsIgnoreCase("c") || 
					D.getGraph().nodos.get(i).equalsIgnoreCase("d") || 
					D.getGraph().nodos.get(i).equalsIgnoreCase("e") || 
					D.getGraph().nodos.get(i).equalsIgnoreCase("f"));
		}
	}
}
