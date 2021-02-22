import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PileOfCubesTest {
    public PileOfCubes pileOfCubes = new PileOfCubes();

    @Test
    public void test1() {
        assertEquals(2022, pileOfCubes.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, pileOfCubes.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, pileOfCubes.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, pileOfCubes.findNb(40539911473216L));
    }
}
