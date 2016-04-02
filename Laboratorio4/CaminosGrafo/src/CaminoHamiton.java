/**
 * Created by Daniel on 02/04/2016.
 */
public class CaminoHamiton {
    public static void main(String[] args){
        GraphAM grafo = new GraphAM(3);
        grafo.addArc(0, 0, 1);
        grafo.addArc(0, 1, 1);
        grafo.addArc(0, 2, 1);
        grafo.addArc(1, 0, 1);
        grafo.addArc(1, 1, 1);
        grafo.addArc(1, 2, 1);
        grafo.addArc(2, 0, 1);
        grafo.addArc(2, 1, 1);
        grafo.addArc(2, 2, 1);
        int [][] matriz = grafo.getEdges();
        HamiltonPath ham = new HamiltonPath();
        ham.allHamiltonPath(matriz);
    }
    public static void cuatroNodos() {
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
    }

    public static void cincoNodos(){
        GraphAM grafo = new GraphAM(4);
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
    }
}
