/**
 * OOPSBannerApp UC5 - OOPS Banner using String.join()
 *
 * This program prints OOPS banner using String.join()
 * for better memory efficiency and cleaner code.
 *
 * @author Nimrat
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Declare and initialize a String array with inline String.join() calls
        String[] lines = {
            String.join(" ", " ***** ", " ***** ", " ******", " ******"),
            String.join(" ", "*     *", "*     *", "*     *", "*     "),
            String.join(" ", "*     *", "*     *", "*     *", "*     "),
            String.join(" ", "*     *", "*     *", "****** ", " *****"),
            String.join(" ", "*     *", "*     *", "*      ", "     *"),
            String.join(" ", "*     *", "*     *", "*      ", "*    *"),
            String.join(" ", " ***** ", " ***** ", "*      ", " ****")
        };

        for (String line : lines) {
            System.out.println(line);
        }

    }
}