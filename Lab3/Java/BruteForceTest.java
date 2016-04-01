import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Laboratorio 3 - NxN Reinas
 * The test class BruteForceTest.
 * @author drendon9
 * @author bsepulv3
 * @author jmoral33
 */
public class BruteForceTest
{
    /**
     * Prueba con 4 reinas
     */
    @Test
    public void cuatroReinas()
    {
        assertEquals(2, BruteForce.play(4));
    }
    
    /**
     * Prueba con 5 reinas
     */
    @Test
    public void cincoReinas()
    {
        assertEquals(10, BruteForce.play(5));
    }
    
    /**
     * Prueba con 6 reinas
     */
    @Test
    public void seisReinas()
    {
        assertEquals(4, BruteForce.play(6));
    }
    
    /**
     * Prueba con 7 reinas
     */
    @Test
    public void sieteReinas()
    {
        assertEquals(40, BruteForce.play(7));
    }
    
    /**
     * Prueba con 8 reinas
     */
    @Test
    public void ochoReinas()
    {
        assertEquals(92, BruteForce.play(8));
    }
    
    /**
     * Prueba con 9 reinas
     */
    @Test
    public void nueveReinas()
    {
        assertEquals(352, BruteForce.play(9));
    }
}


