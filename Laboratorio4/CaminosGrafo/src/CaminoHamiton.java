/**
 * Created by Daniel on 02/04/2016.
 */
public class CaminoHamiton {
    /**
     * Se ejecuta el programa con un grafo de 4 y 5 nodos.
     */
    public static void main(String[] args){
        int [][] matriz4 = cuatroNodos().getEdges();
        int [][] matriz5 = cincoNodos().getEdges();
        HamiltonPath ham = new HamiltonPath();
        System.out.println("=================");
        System.out.println("Caminos para 4 nodos");
        System.out.println("=================");
        ham.allHamiltonPath(matriz4);
        System.out.println("=================");
        System.out.println("Caminos para 5 nodos");
        System.out.println("=================");
        ham.allHamiltonPath(matriz5);
    }

    /**
     * Se crea un grafo de 4 nodos donde todos estan conectados con todos.
     * @return GraphAM Peor grafo de 4 nodos
     */
    public static GraphAM cuatroNodos() {
        GraphAM grafo = new GraphAM(4);
        grafo.addArc(0, 0, 1);
        grafo.addArc(0, 1, 1);
        grafo.addArc(0, 2, 1);
        grafo.addArc(0, 3, 1);
        grafo.addArc(1, 0, 1);
        grafo.addArc(1, 1, 1);
        grafo.addArc(1, 2, 1);
        grafo.addArc(1, 3, 1);
        grafo.addArc(2, 0, 1);
        grafo.addArc(2, 1, 1);
        grafo.addArc(2, 2, 1);
        grafo.addArc(2, 3, 1);
        grafo.addArc(3, 0, 1);
        grafo.addArc(3, 1, 1);
        grafo.addArc(3, 2, 1);
        grafo.addArc(3, 3, 1);
        return grafo;
    }

    /**
     * Se crea un grafo de 5 nodos donde todos estan conectados con todos.
     * @return GraphAM Peor grafo de 5 nodos
     */
    public static GraphAM cincoNodos(){
        GraphAM grafo = new GraphAM(5);
        grafo.addArc(0, 0, 1);
        grafo.addArc(0, 1, 1);
        grafo.addArc(0, 2, 1);
        grafo.addArc(0, 3, 1);
        grafo.addArc(0, 4, 1);
        grafo.addArc(1, 0, 1);
        grafo.addArc(1, 1, 1);
        grafo.addArc(1, 2, 1);
        grafo.addArc(1, 3, 1);
        grafo.addArc(1, 4, 1);
        grafo.addArc(2, 0, 1);
        grafo.addArc(2, 1, 1);
        grafo.addArc(2, 2, 1);
        grafo.addArc(2, 3, 1);
        grafo.addArc(2, 4, 1);
        grafo.addArc(3, 0, 1);
        grafo.addArc(3, 1, 1);
        grafo.addArc(3, 2, 1);
        grafo.addArc(3, 3, 1);
        grafo.addArc(3, 4, 1);
        grafo.addArc(4, 0, 1);
        grafo.addArc(4, 1, 1);
        grafo.addArc(4, 2, 1);
        grafo.addArc(4, 3, 1);
        grafo.addArc(4, 4, 1);
        return grafo;
    }
}
