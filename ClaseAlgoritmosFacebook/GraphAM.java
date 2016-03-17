import java.util.ArrayList;
/**
 * Esta clase es una implementación de un grafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class GraphAM
{
    private int[][] vertices;
    private int size;
    public GraphAM(int size)
    {
        this.size=size;
        vertices = new int[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                vertices[i][j] = -1;
        }
    }

    public int[][] getEdges()
    {
        return vertices;
    }

    /**
     * Obtiene el peso entre los dos nodos
     * @param source
     * @param destination
     * @return weight
     */
    public int getWeight(int source, int destination)
    {
        return vertices[source][destination];
    }

    public  int size() {
        return size;
    }
    
    public int isRelation(int p, int q){
        return vertices[p][q];
    }
    
    /**
     * Agrega un arco de source hacia destination con un peso weight
     * @param source
     * @param destination
     * @param weight
     */
    public void addArc(int source, int destination, int weight)
    {
        vertices[source][destination] = weight;
        vertices[destination][source] = weight;
    }

    /**
     * Obtiene los sucesores de un vertice
     * @param vertex
     * @return Lista de successors
     */
    public ArrayList<Integer> getSuccessors(int vertex)
    {
        ArrayList<Integer> successors = new ArrayList<Integer>();
        for (int j = 0; j < size; j++)
        {
            if (vertices[vertex][j] != -1)
                successors.add(j);
        }
        return successors;

    }
}
