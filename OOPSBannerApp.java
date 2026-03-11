/**
 * OOPSBannerApp UC3 - OOPS Banner using String.join()
 *
 * This program prints OOPS banner using String.join()
 * for better memory efficiency and cleaner code.
 *
 * @author Nimrat
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Define a String array
        String[] lines = new String[7];

        lines[0] = String.join(" ", " ***** ", " ***** ", " ******", " ******");
        lines[1] = String.join(" ", "*     *", "*     *", "*     *", "*     ");
        lines[2] = String.join(" ", "*     *", "*     *", "*     *", "*     ");
        lines[3] = String.join(" ", "*     *", "*     *", "****** ", " *****");
        lines[4] = String.join(" ", "*     *", "*     *", "*      ", "     *");
        lines[5] = String.join(" ", "*     *", "*     *", "*      ", "*    *");
        lines[6] = String.join(" ", " ***** ", " ***** ", "*      ", " ****");
        

        for (String line : lines) {
            System.out.println(line);
        }

    }
}