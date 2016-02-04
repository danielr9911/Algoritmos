import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class DigraphAM extends Graph
{
	private int [][] mat;
	private ArrayList<Integer> successors;
   
   public DigraphAM(int size)
   {
	   super(size);
       mat = new int [size][size];   
   }
   
   public int getWeight(int source, int destination)
   {
	   return mat[source][destination];
    }
   
   public void addArc(int source, int destination, int weight)
   {
	   mat[source][destination] = weight;
   }
  
   public ArrayList<Integer> getSuccessors(int vertex)
   {
	   successors = new ArrayList<Integer>();
	   for(int i=0;i<size();i++){
		   if(mat[vertex][i]!=0){
			   successors.add(i);
			   
		   }		   
	   }
	   
	   return successors;
   }
}
