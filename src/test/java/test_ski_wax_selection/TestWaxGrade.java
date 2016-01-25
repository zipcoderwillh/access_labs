package test_ski_wax_selection;

import org.junit.*;
import static org.junit.Assert.*;
import ski_wax_selection.*;

/**
 * Created by willhorton on 1/25/16.
 */
public class TestWaxGrade {

    @Test
    public void testDetermineWaxGrade() {
        // Test that correct wax grade is returned for each snow type input, and that null is returned
        // for any other input
        assertEquals(WaxGrade.SPECIAL, WaxGrade.determineWaxGrade("powder"));
        assertEquals(WaxGrade.STANDARD, WaxGrade.determineWaxGrade("firm"));
        assertEquals(WaxGrade.EXTRA, WaxGrade.determineWaxGrade("crusty"));
        assertNull(WaxGrade.determineWaxGrade("liquid"));
    }

}
