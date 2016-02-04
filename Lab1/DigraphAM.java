import java.util.ArrayList;

/**
<<<<<<< HEAD
 * Esta clase es una implementacion de un digrafo usando matrices de adyacencia
 *
 * @author Mauricio Toro
 * @author Daniel Rendon Montano
=======
 * Esta clase es una implementaci�n de un digrafo usando matrices de adyacencia
 *
 * @author Mauricio Toro
 * @author Daniel Rend�n Monta�o
>>>>>>> origin/master
 * @author Juan Daniel Morales Arias
 * @author Cristyam Sepulveda Vasquez
 * @version 04/02/2016
 */
public class DigraphAM extends Graph {
    private int[][] mat;
    private ArrayList<Integer> successors;

    /**
     * Constructor de la clase DiagphAM
     */
    public DigraphAM(int size) {
        super(size);
        mat = new int[size][size];
    }

    /**
<<<<<<< HEAD
     * Obtiene el peso entre el source y el destination
     *
     * @param source
     * @param destination
     * @return
=======
     *
>>>>>>> origin/master
     */
    public int getWeight(int source, int destination) {
        return mat[source][destination];
    }

<<<<<<< HEAD
    /**
     * Agrega un arco entre el source y el destination
     *
     * @param source
     * @param destination
     * @param weight
     */
=======
>>>>>>> origin/master
    public void addArc(int source, int destination, int weight) {
        mat[source][destination] = weight;
    }

<<<<<<< HEAD
    /**
     * Retorna el sucesor del verticie
     * @param vertex
     * @return
     */
=======
>>>>>>> origin/master
    public ArrayList<Integer> getSuccessors(int vertex) {
        successors = new ArrayList<Integer>();
        for (int i = 0; i < size(); i++) {
            if (mat[vertex][i] != 0) {
                successors.add(i);

            }
        }

        return successors;
    }
}
