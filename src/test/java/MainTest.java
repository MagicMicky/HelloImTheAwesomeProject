import static org.junit.Assert.*;

/**
 * Created by magicmicky on 18/11/15.
 */
public class MainTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        assertEquals(Main.add(0,3), 2);
        assertEquals(Main.add(-1,1), 0);
        assertEquals(Main.add(9999,1), 10000);
    }
}