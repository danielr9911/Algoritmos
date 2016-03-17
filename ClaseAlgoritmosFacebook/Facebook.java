import java.util.*;
public class Facebook
{
    public static void main(String[] args){
        GraphAM graph = new GraphAM(10);
        graph.addArc(1,2,1);
        graph.addArc(1,3,1);
        graph.addArc(1,4,1);
        graph.addArc(1,5,1);
        graph.addArc(1,6,1);
        graph.addArc(1,7,1);
        graph.addArc(1,8,1);
        graph.addArc(1,9,1);
        graph.addArc(10,2,1);
        graph.addArc(10,3,1);
        graph.addArc(10,4,1);
        graph.addArc(10,5,1);
        graph.addArc(10,6,1);

        ArrayList<Integer> recomendaciones = recomendar(graph,1);
    }

    private static ArrayList<Integer> recomendar(GraphAM graph, int p){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> friends = graph.getSuccessors(p);
        for(int i=0;i<friends.size();i++){
            ArrayList<Integer> ada = graph.getSuccessors(friends.get(i));
            for(int j=0;j<ada.size();j++){
                if(graph.isRelation(p,ada.get(i))==0){
                    if()
                    map.put(ada.get(i),1);
                }
            }
        }

    }
}
