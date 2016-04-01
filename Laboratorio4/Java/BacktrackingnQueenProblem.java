/**
 * class BacktrackingnQueenProblem
 * Laboratorio 4 - JAVA
 * Encuentra UNA solucion al problema de las N Reinas
 * @author drendon9
 * @author bsepulv3
 * @author jmoral33
 */
public class BacktrackingnQueenProblem {
    private static boolean continuar = true;
    private static int[] solucion;
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        reinas(8);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    /**
     * Ejecuta el algoritmo utilizando Backtracking con nReinas
     * @param nReinas Numero de reinas
     * @return Numero de soluciones posibles 
     */
    public static int[] play(int nReinas) {
        reinas(nReinas);
        continuar = true;
        return solucion;
    }

    /**
     * Verifica si existen dos reinas que se ataquen
     * @param tablero tablero con reinas
     * @return boolean atacan
     */
    public static boolean atacan(int[] tablero, int index) {
        for (int i = 0; i < index; i++) {
            for (int j = 1; j < index + 1; j++) {
                if (i != j && tablero[i] == tablero[j]) {
                    return true;
                }
                if ((i + j < index + 1) && tablero[i] == (tablero[i + j] - j)) {
                    return true;
                }
                if ((i + j < index + 1) && tablero[i] == (tablero[i + j] + j)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Crea el primer tablero con n reinas y llama a reinasAux
     * @param n reinas
     */
    public static void reinas(int n) {
        int[] tablero = new int[n];
        reinasAux(tablero, 0);
    }

    /**
     * Metodo auxiliar para reinas (Recursion)
     * @param tablero tablero con reinas
     * @param index indice
     */
    public static void reinasAux(int[] tablero, int index) {
        if (index == tablero.length && continuar) {
            solucion = new int[tablero.length];
            for (int i = 0; i < tablero.length; i++) {
                solucion[i] = tablero[i];
            }
            imprimir(tablero);
            System.out.println("");
            continuar = false;
        } else if (continuar) {
            for (int i = 0; i < tablero.length; i++) {
                tablero[index] = i;
                if (!atacan(tablero, index)) {
                    reinasAux(tablero, index + 1);
                } else {
                    tablero[index] = -1;
                }
            }
        }

    }

    /**
     * Imprime el tablero
     * @param tablero tablero a imprimir
     */
    public static void imprimir(int[] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[j] == i) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println("");
        }
    }

}