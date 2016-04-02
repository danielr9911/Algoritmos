import java.util.ArrayList;

/**
 * Created by Daniel on 02/04/2016.
 */
public class CaminosGrafo {

    public static void main(String[] args) {
        Graph grafo = new GraphAM(3);
        //grafo.addArc(0, 0, 1);
        grafo.addArc(0, 1, 1);
        grafo.addArc(0, 2, 1);
        grafo.addArc(1, 0, 1);
        //grafo.addArc(1, 1, 1);
        grafo.addArc(1, 2, 1);
        grafo.addArc(2, 0, 1);
        grafo.addArc(2, 1, 1);
        //grafo.addArc(2, 2, 1);
        ArrayList<ArrayList<Integer>> listaCaminos = caminos(grafo);
        for (int i = 0; i < listaCaminos.size(); i++) {
            System.out.println(listaCaminos.get(i));
        }

        //ArrayList<Integer> prueba = new ArrayList<>();
        //prueba.add(2);
        //prueba.add(5);
        //System.out.prin tln(prueba);
    }

    public static ArrayList<ArrayList<Integer>> caminos(Graph g) {
//        ArrayList<ArrayList<Integer>> listaCaminos = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> camino1 = new ArrayList<>();
//        ArrayList<Integer> camino2 = new ArrayList<>();
//        camino1.add(0);
//        camino1.add(1);
//        camino1.add(2);
//        camino2.add(1);
//        camino2.add(3);
//        listaCaminos.add(camino1);
//        listaCaminos.add(camino2);
//        return listaCaminos;
        ArrayList<ArrayList<Integer>> listaCaminos = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < g.size(); i++) {
            boolean[] visitados = new boolean[g.size()];
            for (int j = 0; j < g.size(); j++) {
                if(i!=j) {

                    ArrayList<Integer> cam = caminosAux(g, i, j, visitados);
                    listaCaminos.add(cam);
                }
            }
        }
        return listaCaminos;
    }

    public static ArrayList<Integer> caminosAux(Graph g, int p, int q, boolean[] visitados) {
        visitados[p] = true;
        ArrayList<Integer> sucesores = g.getSuccessors(p);
        ArrayList<Integer> output = new ArrayList<>();
        output.add(p);
        for (int i = 0; i < sucesores.size(); i++) {
            if (!visitados[sucesores.get(i)]) {
                if (sucesores.get(i) == q) {
                    output.add(sucesores.get(i));
                    return output;
                }
                ArrayList<Integer> temp = caminosAux(g, sucesores.get(i), q, visitados);
                if (temp.size() != 0) {
                    output.addAll(temp);
                    return output;
                }
            }
        }
        output = new ArrayList<Integer>();
        return output;
    }

}
