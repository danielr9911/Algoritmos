import org.junit.Test;
import static org.junit.Assert.*;
/**
 * The test class BacktrackingBacktrackingnQueenProblemTest.
 * Laboratorio 4 - JAVA
 *
 * @author drendon9
 * @author bsepulv3
 * @author jmoral33
 */
public class BacktrackingnQueenProblemTest {
    /**
     * Prueba con 4 reinas
     */
    @Test
    public void cuatroReinas() {
        assertEquals(1, BacktrackingnQueenProblem.play(4)[0]);
        assertEquals(3, BacktrackingnQueenProblem.play(4)[1]);
        assertEquals(0, BacktrackingnQueenProblem.play(4)[2]);
        assertEquals(2, BacktrackingnQueenProblem.play(4)[3]);
    }

    /**
     * Prueba con 5 reinas
     */
    @Test
    public void cincoReinas() {
        assertEquals(0, BacktrackingnQueenProblem.play(5)[0]);
        assertEquals(2, BacktrackingnQueenProblem.play(5)[1]);
        assertEquals(4, BacktrackingnQueenProblem.play(5)[2]);
        assertEquals(1, BacktrackingnQueenProblem.play(5)[3]);
        assertEquals(3, BacktrackingnQueenProblem.play(5)[4]);
    }

    /**
     * Prueba con 6 reinas
     */
    @Test
    public void seisReinas() {
        assertEquals(1, BacktrackingnQueenProblem.play(6)[0]);
        assertEquals(3, BacktrackingnQueenProblem.play(6)[1]);
        assertEquals(5, BacktrackingnQueenProblem.play(6)[2]);
        assertEquals(0, BacktrackingnQueenProblem.play(6)[3]);
        assertEquals(2, BacktrackingnQueenProblem.play(6)[4]);
        assertEquals(4, BacktrackingnQueenProblem.play(6)[5]);
    }

    /**
     * Prueba con 7 reinas
     */
    @Test
    public void sieteReinas() {
        assertEquals(0, BacktrackingnQueenProblem.play(7)[0]);
        assertEquals(2, BacktrackingnQueenProblem.play(7)[1]);
        assertEquals(4, BacktrackingnQueenProblem.play(7)[2]);
        assertEquals(6, BacktrackingnQueenProblem.play(7)[3]);
        assertEquals(1, BacktrackingnQueenProblem.play(7)[4]);
        assertEquals(3, BacktrackingnQueenProblem.play(7)[5]);
        assertEquals(5, BacktrackingnQueenProblem.play(7)[6]);
    }

    /**
     * Prueba con 6 reinas
     */
    @Test
    public void ochoReinas() {
        assertEquals(0, BacktrackingnQueenProblem.play(8)[0]);
        assertEquals(4, BacktrackingnQueenProblem.play(8)[1]);
        assertEquals(7, BacktrackingnQueenProblem.play(8)[2]);
        assertEquals(5, BacktrackingnQueenProblem.play(8)[3]);
        assertEquals(2, BacktrackingnQueenProblem.play(8)[4]);
        assertEquals(6, BacktrackingnQueenProblem.play(8)[5]);
        assertEquals(1, BacktrackingnQueenProblem.play(8)[6]);
        assertEquals(3, BacktrackingnQueenProblem.play(8)[7]);
    }
}

