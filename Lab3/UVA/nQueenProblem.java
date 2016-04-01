/**
 * Laboratorio 3 - UVA
 * @author drendon9
 * @author bsepulv3
 * @author jmoral33
 */

import java.util.Scanner;
public class nQueenProblem {
    private static int cont =0;
    private static Scanner sc;
    public static int [][] tablero2;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            tablero2 = new int [n][n];
            if(n==0){
                break;
            }
            int[] tablero =  new int[n];
            for(int j=0;j<n;j++){
                tablero[j]=-1;
                String line = sc.next();
                int count = line.length() - line.replace("*", "").length();
                int[] times = new int [count];
                for(int k = 0;k<n;k++){
                    if(line.charAt(k) == '*' ){ 
                        tablero2[j][k]=-1;
                    }
                    
                }               
                
            }
            reinas(tablero);       
            int caso = i+1;
            System.out.println("Case "+caso+": "+cont );
        }
        
    }

    /**
     * Verifica si existen dos reinas que se ataquen
     * @param tablero tablero con reinas
     * @return boolean atacan
     */
    public static boolean atacan (int [] tablero,int index){
        for (int i = 0; i < index; i++) {
            
            for (int j = 1; j < index+1; j++) {
                
                if(i!=j&&tablero[i]==tablero[j]){                    
                        return true;                     
                }
                    if((i+j<index+1)&&tablero[i]==(tablero[i+j]-j)){
                        return true;
                    }
                    if((i+j<index+1)&&tablero[i]==(tablero[i+j]+j)){
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
    public static void reinas (int [] tablero){
    	cont=0;
    	reinasAux(tablero,0);
        
              
    }

    /**
     * Metodo auxiliar para reinas
     * @param tablero tablero con reinas
     * @param index indice
     */
    public static void reinasAux(int[] tablero, int index){
        
        if (index==tablero.length){           
                
                cont++;
            
        }
        else{
            for (int i = 0; i < tablero.length; i++) {
                    if(tablero2[i][index]!=-1){
                        tablero[index]=i;
                        
                        if(!atacan(tablero,index)){
                            reinasAux(tablero,index+1);
                        }else{
                            tablero[index]=-1;
                        }
                    }                   
                
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