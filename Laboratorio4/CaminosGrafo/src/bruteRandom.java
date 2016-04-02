import java.util.ArrayList;
import java.util.Random;

public class bruteRandom {

    public static void main(String[] args) {
        Graph grafo = new GraphAM(4);
        Graph grafo2 = new GraphAM(5);

        ArrayList<ArrayList<Integer>> listaCaminos = caminos(grafo);

        ArrayList<ArrayList<Integer>> listaCaminos2 = caminos(grafo2);


        for (int i = 0; i < listaCaminos.size(); i++) {
            System.out.println(listaCaminos.get(i));
        }

        System.out.println("==============");

        for (int i = 0; i < listaCaminos2.size(); i++) {
            System.out.println(listaCaminos2.get(i));
        }

        //ArrayList<Integer> prueba = new ArrayList<>();
        //prueba.add(2);
        //prueba.add(5);
        //System.out.prin tln(prueba);
    }

    public static ArrayList<ArrayList<Integer>> caminos(Graph g) {
        ArrayList<ArrayList<Integer>> listaCaminos = new ArrayList<ArrayList<Integer>>();

        Random rand = new Random();

        int a = factorial(g.size());
        for (int i = 0; i < a; i++) {

            boolean notCamino = true;

            while(notCamino) {
                ArrayList<Integer> camino = new ArrayList<Integer>();
                for (int x = 0; x < g.size(); x++) {
                    boolean cont = true;
                    while (cont) {
                        int n = rand.nextInt(g.size());
                        if (!inList(camino, n)) {
                            camino.add(n);
                            cont = false;
                        }
                    }
                }
                if(!checkCamino(listaCaminos, camino)) {
                    listaCaminos.add(camino);
                    notCamino = false;
                }
            }
        }
        return listaCaminos;
    }


    public static Boolean inList(ArrayList<Integer> list, int num){
        for(int i=0; i<list.size(); i++){
            if(num==list.get(i)){
                return true;
            }
        }
        return false;
    }

    public static Boolean checkCamino(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> camino){
        for(int i=0; i<list.size(); i++){
            ArrayList<Integer> comp = list.get(i);

            boolean equal = true;

            for(int x=0; x<comp.size(); x++){
                if(camino.get(x) != comp.get(x)){
                    equal = false;
                    break;
                }
            }

            if(equal){
                return true;
            }
        }
        return false;
    }



    public static int factorial (int numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }

}
