package ski_wax_selection;

/**
 * Created by willhorton on 1/25/16.
 */
public enum WaxGrade {

    SPECIAL, STANDARD, EXTRA;

    public static WaxGrade determineWaxGrade(String snowCondition) {

        WaxGrade result;

        switch(snowCondition) {
            case("powder") : result = SPECIAL;
                break;
            case ("firm") : result = STANDARD;
                break;
            case ("crusty") : result = EXTRA;
                break;
            default : result = null;
        }

        return result;

    }

}
