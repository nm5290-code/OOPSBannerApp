/**
 * OOPSBannerApp UC6 - Refactor Banner Logic into Functions
 *
 * This program prints OOPS banner using helper methods
 * for each character pattern (O, P, S) to improve
 * modularity, reusability, and maintainability.
 *
 * @author Nimrat
 * @version 6.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Declare and initialize a String array using helper methods
        String[] lines = {
            String.join(" ", getOPattern(0), getOPattern(0), getPPattern(0), getSPattern(0)),
            String.join(" ", getOPattern(1), getOPattern(1), getPPattern(1), getSPattern(1)),
            String.join(" ", getOPattern(2), getOPattern(2), getPPattern(2), getSPattern(2)),
            String.join(" ", getOPattern(3), getOPattern(3), getPPattern(3), getSPattern(3)),
            String.join(" ", getOPattern(4), getOPattern(4), getPPattern(4), getSPattern(4)),
            String.join(" ", getOPattern(5), getOPattern(5), getPPattern(5), getSPattern(5)),
            String.join(" ", getOPattern(6), getOPattern(6), getPPattern(6), getSPattern(6))
        };

        for (String line : lines) {
            System.out.println(line);
        }

    }

    // Helper method to return O character pattern for a given line
    public static String getOPattern(int line) {
        String[] pattern = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
        return pattern[line];
    }

    // Helper method to return P character pattern for a given line
    public static String getPPattern(int line) {
        String[] pattern = {
            " ******",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
        return pattern[line];
    }

    // Helper method to return S character pattern for a given line
    public static String getSPattern(int line) {
        String[] pattern = {
            " ******",
            "*     ",
            "*     ",
            " *****",
            "     *",
            "*    *",
            " ****"
        };
        return pattern[line];
    }
}