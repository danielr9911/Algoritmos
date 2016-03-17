import java.util.*;
public class Facebook
{
    public static void main(String[] args){
        GraphAM graph = new GraphAM(11);
        graph.addArc(1,2,1);
        graph.addArc(1,3,1);
        graph.addArc(1,4,1);
        graph.addArc(1,5,1);
        graph.addArc(1,6,1);
        graph.addArc(1,7,1);
        graph.addArc(1,8,1);
        graph.addArc(9,2,1);
        graph.addArc(9,3,1);
        graph.addArc(9,4,1);
        graph.addArc(9,5,1);
        graph.addArc(9,6,1);
        graph.addArc(10,8,1);
        graph.addArc(10,7,1);
        graph.addArc(10,6,1);
        graph.addArc(10,5,1);
        graph.addArc(10,4,1);
        graph.addArc(10,3,1);
        //graph.addArc(10,2,1);
        for(int j=0;j<graph.size();j++){
           ArrayList<Integer> recomendados = recomendar(graph,j);
           if(recomendados.size()!=0){
               System.out.println("======= Al: "+j+" ========");
           }
           for(int i=0;i<recomendados.size();i++){
               System.out.println("- Te recomendamos: "+recomendados.get(i));
           }
        }
    }
    private static ArrayList<Integer> recomendar(GraphAM graph, int p){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> friends = graph.getSuccessors(p);
        ArrayList<Integer> rec = new ArrayList<Integer>();
        for(int i=0;i<friends.size();i++){
            ArrayList<Integer> ada = graph.getSuccessors(friends.get(i));
            for(int j=0;j<ada.size();j++){
                if(ada.get(j)!=p && graph.isRelation(p,ada.get(j))==-1){
                    if(map.get(ada.get(j))==null){
                        map.put(ada.get(j),1);
                    }else{
                        Integer value = new Integer(map.get(ada.get(j)).intValue()+1);
                        map.put(ada.get(j), value);
                        if(value.intValue()== 5){
                            rec.add(ada.get(j));
                        }
                    }
                }
            }
        }
        return rec;
    }
}
