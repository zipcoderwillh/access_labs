package ski_wax_selection;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by willhorton on 1/25/16.
 */
public class Wax {

    private WaxColor color;
    private WaxGrade grade;

    public Wax() {

        int temp = 0;
        String snowConditions = null;
        Scanner sc = new Scanner(System.in);

        // Get and validate temp input
        while(true) {
            System.out.println("Please enter a temperature:");
            String tempString = sc.nextLine();
            if(tempString.matches("-?\\d+")) {
                temp = Integer.parseInt(tempString);
                break;
            }
            System.out.println("Please enter numbers only");
        }

        // Get and validate snow conditions input
        while(true) {
            System.out.println("Please enter the snow conditions ('firm', 'crusty', or 'powder'):");
            snowConditions = sc.nextLine();
            if(snowConditions.matches("^(firm)|(crusty)|(powder)$")) {
                break;
            }
            System.out.println("Invalid snow type: please enter 'firm', 'crusty', or 'powder'.");
        }

        this.color = WaxColor.determineWaxColor(temp);
        this.grade = WaxGrade.determineWaxGrade(snowConditions);

    }

    public String displayWax() {
        return "Recommended wax type for these conditions is: \nColor: " + color + ", Grade: " + grade;
    }

    public static void main(String[] args) {

        Wax skiWax = new Wax();
        System.out.println(skiWax.displayWax());

    }

}
