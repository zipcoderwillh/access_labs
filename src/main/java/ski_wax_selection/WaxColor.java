package ski_wax_selection;

/**
 * Created by willhorton on 1/25/16.
 */
public enum WaxColor {

    YELLOW, RED, VIOLET, BLUE, GREEN, WHITE;

    public static WaxColor determineWaxColor(int temp) {

        WaxColor result;

        if(temp > 38) {
            result = YELLOW;
        } else if(temp <= 38 && temp > 31) {
            result = RED;
        } else if(temp <= 31 && temp > 26) {
            result = VIOLET;
        } else if(temp <= 26 && temp > 18) {
            result = BLUE;
        } else if(temp <=18 && temp > 5) {
            result = GREEN;
        } else {
            result = WHITE;
        }

        return result;

    }

}
