package trilib;

import static org.junit.Assert.*;

public class TriLibTest {

    @org.junit.Test
    public void determine_01() {
        assertEquals(TriType.ILLEGAL, TriLib.determine(-1, 2, 3));
    }

    @org.junit.Test
    public void determine_02() {
        assertEquals(TriType.ILLEGAL, TriLib.determine(2, 3, 5));
    }

    @org.junit.Test
    public void determine_03() {
        assertEquals(TriType.EQUILATERAL, TriLib.determine(3, 3, 3));
    }

    @org.junit.Test
    public void determine_04() {
        assertEquals(TriType.ISOSCELES, TriLib.determine(5, 3, 3));
    }

    @org.junit.Test
    public void determine_05() {
        assertEquals(TriType.NORMAL, TriLib.determine(3, 4, 5));
    }

    @org.junit.Test
    public void determine_06() {
        assertEquals(TriType.EQUILATERAL, TriLib.determine(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

}