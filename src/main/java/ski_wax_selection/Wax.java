package ski_wax_selection;

/**
 * Created by willhorton on 1/25/16.
 */
public class Wax {

    private WaxColor color;
    private WaxGrade grade;

    public Wax(int temp, String snowConditions) {

        this.color = WaxColor.determineWaxColor(temp);
        this.grade = WaxGrade.determineWaxGrade(snowConditions);

    }

    public String displayWax() {
        return "Wax color is " + color + ", wax grade is " + grade;
    }

    public static void main(String[] args) {

        // Demonstrate getting and displaying different types of waxes
        Wax skiWax = new Wax(23, "firm");
        System.out.println(skiWax.displayWax());

        Wax skiWax1 = new Wax(5, "crusty");
        System.out.println(skiWax1.displayWax());

        Wax skiWax2 = new Wax(31, "powder");
        System.out.println(skiWax2.displayWax());

    }

}
