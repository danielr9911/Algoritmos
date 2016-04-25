import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.nio.file.Paths;
import java.nio.file.Files;
/**
 * This class contains algorithms for digraphs
 * Adapted from: http://cs.fit.edu/~ryan/java/programs/graph/Dijkstra-java.html
 * @author Mauricio Toro
 * @version 1
 */
public class DigraphAlgorithms
{
        private static int minVertex (int [] dist, boolean [] v) {
        int x = Integer.MAX_VALUE;
        int y = -1;   // graph not connected, or no unvisited vertices
        for (int i=0; i<dist.length; i++) {
           if (!v[i] && dist[i]<x) {y=i; x=dist[i];}
        }
        return y;
     }
  
    
  static int [] dijsktra(Graph dg, int source)
  {
          final int [] dist = new int [dg.size()];  // shortest known distance from "s"
         final int [] pred = new int [dg.size()];  // preceeding node in path
         final boolean [] visited = new boolean [dg.size()]; // all false initially
   
         for (int i=0; i<dist.length; i++) {
           dist[i] = Integer.MAX_VALUE; //Infinity
       }
        dist[source] = 0;
  
        for (int i=0; i<dist.length; i++) {
           final int next = minVertex (dist, visited);
           visited[next] = true;
  
           // The shortest path to next is dist[next] and via pred[next].
  
           final ArrayList<Integer> n = dg.getSuccessors (next); 
           for (int j=0; j<n.size(); j++) {
              final int v = n.get(j);
              final int d = dist[next] + dg.getWeight(next,v);
              if (dist[v] > d) {
                 dist[v] = d;
                 pred[v] = next;
              }
           }
        }
        return pred;  // (ignore pred[s]==0!)
  }
  
  
       public static ArrayList getPath (int [] pred, int s, int e) {
        final java.util.ArrayList path = new java.util.ArrayList();
       int x = e;
        while (x!=s) {
           path.add (0, x);
           x = pred[x];
        }
        path.add (0, s);
        return path;
     }
 
     public static void dibujarGrafo(Graph g)
     {
        System.out.println("digraph HolaComoEstas {");
        System.out.println("node [color=cyan, style=filled];");
        int nv = g.size();
        for (int i = 0; i < nv; i++)
        {
           ArrayList<Integer> lista = g.getSuccessors(i);
           for (int j = 0; j < lista.size(); j++)
             System.out.println("\"" + i + "\" -> \"" + j + "\" [ label=\""+ g.getWeight(i,j) +"\"];");
        }
        System.out.println("}");
     }
     
     public static void(Graph g,int conductores){
         int[] respuesta = new int [conductores];
         
         boolean[] porAquiYaPase = new boolean[g.size()];
         int pesoTotal = 0;
         int[] respuesta = new int[g.size() + 1];
         int indiceRespuesta = 0;
         int actual = porDondeEmpezar;
         do {int elMasCerquita = -1;
             int elPesoAlMasCerquita = 1000000; //infinito
             porAquiYaPase[actual] = true;
             ArrayList<Integer> aDondePuedoLlegar = g.getSuccessors(actual);
             for (int i = 0; i < aDondePuedoLlegar.size(); i++)
              if (g.getWeight(actual,aDondePuedoLlegar.get(i)) < elPesoAlMasCerquita 
                && aDondePuedoLlegar.get(i) != actual 
                && !porAquiYaPase[aDondePuedoLlegar.get(i)] )
              {   elMasCerquita = aDondePuedoLlegar.get(i);
                elPesoAlMasCerquita = g.getWeight(actual,aDondePuedoLlegar.get(i));
              }
              
             respuesta[indiceRespuesta++] = actual;
             
             actual = elMasCerquita;
             if(actual!=-1)
             pesoTotal+=g.getWeight(respuesta[indiceRespuesta-1],actual);
        } while (indiceRespuesta < g.size());
        respuesta[indiceRespuesta] = porDondeEmpezar; 
        pesoTotal+=g.getWeight(respuesta[indiceRespuesta-1],porDondeEmpezar);
        System.out.println("El peso costo total es: "+ pesoTotal);
        return respuesta;
     }
     //Tomado de clase de estructuras de datos y algoritmos 2
	/**
	 * Este metodo produce todos los circuitos posibles en un grafo por fuerza bruta. No se puede
	 * repetir arco y si vertice.
	 * @param g es el grafo que vamos a analizar
	 * @param porDondeEmpezar es el nodo por donde debe ir al principio y volver
	 * @author Mauricio Toro & Juan Daniel Morales Daniel Rendon Cristyam Sepulveda
	 * @version 1
	 */
     public static int[] agenteViajero(Graph g, int porDondeEmpezar)
     {
         boolean[] porAquiYaPase = new boolean[g.size()];
         int pesoTotal = 0;
         int[] respuesta = new int[g.size() + 1];
         int indiceRespuesta = 0;
         int actual = porDondeEmpezar;
         do {int elMasCerquita = -1;
             int elPesoAlMasCerquita = 1000000; //infinito
             porAquiYaPase[actual] = true;
             ArrayList<Integer> aDondePuedoLlegar = g.getSuccessors(actual);
             for (int i = 0; i < aDondePuedoLlegar.size(); i++)
              if (g.getWeight(actual,aDondePuedoLlegar.get(i)) < elPesoAlMasCerquita 
                && aDondePuedoLlegar.get(i) != actual 
                && !porAquiYaPase[aDondePuedoLlegar.get(i)] )
              {   elMasCerquita = aDondePuedoLlegar.get(i);
                elPesoAlMasCerquita = g.getWeight(actual,aDondePuedoLlegar.get(i));
              }
              
             respuesta[indiceRespuesta++] = actual;
             
             actual = elMasCerquita;
             if(actual!=-1)
             pesoTotal+=g.getWeight(respuesta[indiceRespuesta-1],actual);
        } while (indiceRespuesta < g.size());
        respuesta[indiceRespuesta] = porDondeEmpezar; 
        pesoTotal+=g.getWeight(respuesta[indiceRespuesta-1],porDondeEmpezar);
        System.out.println("El peso costo total es: "+ pesoTotal);
        return respuesta;
     }
 
 
 public static void main(String[] args)
 {

     DigraphAL dgal2 = new DigraphAL(3);
     dgal2.addArc(0,0,0);
     dgal2.addArc(0,1,1);
     dgal2.addArc(1,0,1);
     dgal2.addArc(0,2,10);
     dgal2.addArc(2,0,2);
     dgal2.addArc(2,2,0);
     dgal2.addArc(2,1,1);
     dgal2.addArc(1,2,2);
     dgal2.addArc(1,1,0);
     
     DigraphAlgorithms.dibujarGrafo(dgal2);
     System.out.println("La ruta es: "Arrays.toString(DigraphAlgorithms.agenteViajero(dgal2, 0)));
    // System.out.println(Arrays.toString(DigraphAlgorithms.agenteViajero(dgal, 0)));

     
 }
}
