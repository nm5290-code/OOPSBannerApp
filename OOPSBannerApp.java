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

        System.out.println(String.join(" ", " ***** ", " ***** ", " ******", " ******"));
        System.out.println(String.join(" ", "*     *", "*     *", "*     *", "*     "));
        System.out.println(String.join(" ", "*     *", "*     *", "*     *", "*     "));
        System.out.println(String.join(" ", "*     *", "*     *", "****** ", " *****"));
        System.out.println(String.join(" ", "*     *", "*     *", "*      ", "     *"));
        System.out.println(String.join(" ", "*     *", "*     *", "*      ", "*    *"));
        System.out.println(String.join(" ", " ***** ", " ***** ", "*      ", " ****"));

    }
}