package magpie;

/**
 * Created by will on 1/24/16.
 */
public enum Suit {

    HEARTS (true),
    DIAMONDS (true),
    CLUBS (false),
    SPADES (false);

    private final boolean isHeartsOrDiamonds;

    Suit(boolean isHeartsOrDiamonds) {
        this.isHeartsOrDiamonds = isHeartsOrDiamonds;
    }

    public boolean isHeartsOrDiamonds() {
        return isHeartsOrDiamonds;
    }

}
