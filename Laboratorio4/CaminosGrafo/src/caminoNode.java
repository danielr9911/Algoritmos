import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class caminoNode {


    public static void main(String[] args) {

        Graph grafo = new GraphAM(6);


        grafo.addArc(0, 1, 10);
        grafo.addArc(1, 0, 10);

        grafo.addArc(0, 2, 10);
        grafo.addArc(2, 0, 10);

        grafo.addArc(1, 2, 15);
        grafo.addArc(2, 1, 15);

        grafo.addArc(2, 3, 7);
        grafo.addArc(3, 2, 7);

        grafo.addArc(2, 4, 12);
        grafo.addArc(4, 2, 12);

        grafo.addArc(3, 4, 20);
        grafo.addArc(4, 3, 20);

        grafo.addArc(0, 4, 14);
        grafo.addArc(4, 0, 14);

        grafo.addArc(1, 4, 8);
        grafo.addArc(4, 1, 8);


        findPath(grafo, 0);
    }

    public static void findPath(Graph g, int v){
        ParejaAI caminoResultado;

        ArrayList<ParejaII> arcosVisitados = new ArrayList<>();

        boolean[] nodosVisitados = new boolean[g.size()];

        caminoResultado = findPathAux(g,v,nodosVisitados,arcosVisitados,v);

        for (Integer node : caminoResultado.getCamino()){
            System.out.println("nodo:" + node);
        }

        System.out.println("peso:"+ caminoResultado.getPeso());

    }

    public static ParejaAI findPathAux(Graph g, int v, boolean[] visitados, ArrayList<ParejaII> arcosVisitados,int inicial){

        ArrayList<Integer> camino = new ArrayList<>();
        visitados[v] = true;

        if(todosVisitados(visitados)&&hayArco(g,v,inicial)){
            camino.add(v);
            camino.add(inicial);

            return new ParejaAI(camino,g.getWeight(v,inicial));

        }


        camino.add(v);
        ArrayList<Integer> camino2 = new ArrayList<>();
        int minimo = 19000;

        ArrayList<Integer> sucesores = g.getSuccessors(v);

        for(Integer i : sucesores){
            if(!arcosVisitados.contains(new ParejaII(v,i))){
                arcosVisitados.add(new ParejaII(v,i));
                ParejaAI resultado = findPathAux(g,i,visitados,arcosVisitados,inicial);
                if(resultado.getPeso() < minimo){
                    minimo = resultado.getPeso();
                    camino2 = resultado.getCamino();

                }
            }
        }

        if(camino2.size() == 0){
            minimo = 19000000;
        }else{
            minimo += g.getWeight(v,camino2.get(0));
        }

        camino.addAll(camino2);

        return new ParejaAI(camino,minimo);

    }

    public static boolean hayArco(Graph g, int a, int b){
        return g.getSuccessors(a).contains(b);

    }

    public static boolean todosVisitados(boolean[] visitados){
        for (boolean visitado : visitados) {
            if (!visitado) {
                return false;
            }

        }
        return true;
    }


    public ArrayList<Integer> puedeIr(Graph g, int v, boolean[] visitados){
        ArrayList<Integer> disponibles = new ArrayList<>();
        ArrayList<Integer> sucesores = g.getSuccessors(v);

        for (Integer element : sucesores){
            if(!visitados[element]){
                disponibles.add(element);
            }
        }

        return disponibles;

    }


}
