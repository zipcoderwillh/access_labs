package test_ski_wax_selection;

import org.junit.*;
import static org.junit.Assert.*;
import ski_wax_selection.*;

/**
 * Created by willhorton on 1/25/16.
 */
public class TestWax {

    @Test
    public void testDisplayWax() {
        // Test that displayWax returns accurate info
        Wax testWax = new Wax(32, "powder");
        assertEquals("Wax color is RED, wax grade is SPECIAL", testWax.displayWax());
    }

}
