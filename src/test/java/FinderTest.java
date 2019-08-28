import static org.junit.Assert.*;
import org.junit.Test;

public class FinderTest {
    @Test
    public void testValidMax() {
        Integer[] array = {3, 2, 4, 2, 1, 9, 5};
        assertEquals(new Integer(9), Finder.findMax(array));
    }

    @Test
    public void testValidMin() {
        Integer[] array = {3, 2, 4, 2, 1, 9, 5};
        assertEquals(new Integer(1), Finder.findMin(array));
    }

    @Test
    public void testEmptyMax() {
        Integer[] array = {};
        assertEquals(null, Finder.findMax(array));
    }

    @Test
    public void testEmptyMin() {
        Integer[] array = {};
        assertEquals(null, Finder.findMin(array));
    }

    @Test
    public void testNullMax() {
        Integer[] array = null;
        assertEquals(null, Finder.findMax(array));
    }

    @Test
    public void testNullMin() {
        Integer[] array = null;
        assertEquals(null, Finder.findMin(array));
    }
}