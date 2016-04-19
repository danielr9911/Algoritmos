import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class DigraphAM extends Graph
{
   private int[][] vertices;
   
   public DigraphAM(int size)
   {
       super(size);
       vertices = new int[size][size];
       for (int i = 0; i < size; i++)
       {
              for (int j = 0; j < size; j++)
                vertices[i][j] = -1;
       }
   }
   
   public int getWeight(int source, int destination)
   {
       return vertices[source][destination];
    }
   
   public void addArc(int source, int destination, int weight)
   {
       vertices[source][destination] = weight;
   }
  
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
