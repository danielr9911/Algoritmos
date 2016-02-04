import java.util.ArrayList;

/**
 * Esta clase es una implementaci�n de un digrafo usando listas de adyacencia
 *
 * @author Mauricio Toro
 * @author Daniel Rend�n Monta�o
 * @author Juan Daniel Morales Arias
 * @author Cristyam Sepulveda Vasquez
 * @version 04/02/2016
 */
public class DigraphAL extends Graph {
    private ArrayList<ArrayList<Integer>> list;
    private ArrayList<Integer> successors;


    /**
     * Constructor de la clase DiagraphAL
     * @param size
     */
    public DigraphAL(int size) {
        super(size);
        list = new ArrayList<ArrayList<Integer>>();

    }

    /**
     * Añade un nuevo arco entre el source y el
     * destination con el correspondiente weight.
     * @param source
     * @param destination
     * @param weight
     */
    public void addArc(int source, int destination, int weight) {
        ArrayList<Integer> arc = new ArrayList<Integer>();

        int i = 0;
        if (list.size() != 0) {
            while (list.get(i) != null) {
                int num = list.get(i).get(0);
                if (num == source) {
                    list.get(i).add(destination);
                    list.get(i).add(weight);
                    return;
                }

                i++;
                if (i == list.size()) {
                    break;
                }

            }
        }
        arc.add(source);
        arc.add(destination);
        arc.add(weight);
        list.add(arc);
        return;

    }

    /**
     * Obtiene el peso entre source y destination.
     * @param source
     * @param destination
     * @return
     */
    public int getWeight(int source, int destination) {
        int i = 0;
        while (list.get(i) != null) {

            ArrayList<Integer> subList = list.get(i);

            if (subList.get(0) == source) {
                int size = subList.size();
                for (int j = 1; j < size; j++) {
                    if (subList.get(j) == destination) {
                        return subList.get(j + 1);
                    }

                }

            }
            i++;

        }
        return 0;

    }

    /**
     * Obtiene los sucesores del vertice
     * @param vertice
     * @return
     */
    public ArrayList<Integer> getSuccessors(int vertice) {
        successors = new ArrayList<Integer>();

        int i = 0;
        while (list.get(i) != null) {

            ArrayList<Integer> subList = list.get(i);

            if (subList.get(0) == vertice) {
                int size = subList.size();
                for (int j = 1; j <= size - 2; j += 2) {
                    successors.add(subList.get(j));

                }
                return successors;

            }
            i++;

        }

        return successors;

    }
}