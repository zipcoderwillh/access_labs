package test_ski_wax_selection;

import org.junit.*;
import static org.junit.Assert.*;
import ski_wax_selection.*;

/**
 * Created by willhorton on 1/25/16.
 */
public class TestWaxColor {

    @Test
    public void testDetermineWaxColor() {
        //Test that correct color is returned for various temp inputs
        assertEquals(WaxColor.YELLOW, WaxColor.determineWaxColor(39));
        assertEquals(WaxColor.RED, WaxColor.determineWaxColor(33));
        assertEquals(WaxColor.VIOLET, WaxColor.determineWaxColor(29));
        assertEquals(WaxColor.BLUE, WaxColor.determineWaxColor(22));
        assertEquals(WaxColor.GREEN, WaxColor.determineWaxColor(12));
        assertEquals(WaxColor.WHITE, WaxColor.determineWaxColor(4));
    }

}
