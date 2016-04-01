/**
 * Laboratorio 3 - NxN Reinas
 * BruteForce
 * @author drendon9
 * @author bsepulv3
 * @author jmoral33
 */
public class BruteForce {
    private static int cont =0;

    public static int main(String[] args) {
        long startTime = System.currentTimeMillis();
        reinas(8);
        System.out.println(cont);
        System.out.println(System.currentTimeMillis() - startTime);
        return cont;
    }
    
    /**
     * Ejecuta el algoritmo con nReinas
     * @param nReinas Numero de reinas
     * @return Numero de soluciones posibles 
     */
    public static int play(int nReinas){
        reinas(nReinas);
        int contador=cont;
        cont=0;
        return contador;
    }
    
    /**
     * Verifica si existen dos reinas que se ataquen
     * @param tablero tablero con reinas
     * @return boolean atacan
     */
    public static boolean atacan (int [] tablero){
        for (int i = 0; i < tablero.length; i++) {
            
            for (int j = 1; j < tablero.length; j++) {
                
                if(i!=j&&tablero[i]==tablero[j]){                    
                        return true;                     
                }
                    if((i+j<tablero.length)&&tablero[i]==(tablero[i+j]-j)){
                        return true;
                    }
                    if((i+j<tablero.length)&&tablero[i]==(tablero[i+j]+j)){
                        return true;
                    }               
                }
                
            }           
        
        
        return false;      
        
    }

    /**
     * Crea el primer tablero con n reinas
     * @param n reinas
     */
    public static void reinas (int n){
        int [] tablero = new int[n];
        reinasAux(tablero,0);
        
        
    }

    /**
     * Metodo auxiliar para reinas
     * @param tablero tablero con reinas
     * @param index indice
     */
    public static void reinasAux(int[] tablero, int index){
        
        if (index==tablero.length){
            if(!atacan(tablero)){
                //imprimir(tablero);
                cont++;
                //System.out.println("");
            }
            
        }
        else{
            for (int i = 0; i < tablero.length; i++) {
                
                    tablero[index]=i;
                    reinasAux(tablero,index+1);
                
            }
        }
    }

    /**
     * Imprime el tablero
     * @param tablero tablero a imprimir
     */
    public static void imprimir(int[]tablero){
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[j]==i){
                    System.out.print("X");
                }else{
                    System.out.print("O");
                }
            }
            System.out.println("");            
        }
    }
    
}
