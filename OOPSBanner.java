/**
 * OOPSBannerApp UC8 - OOPS Banner using HashMap for Character Patterns
 *
 * This program uses HashMap to store ASCII art patterns for characters
 * and renders the banner using utility static methods.
 * 
 * Key Concepts:
 * - HashMap for efficient key-value pair storage of character patterns
 * - StringBuilder for efficient string concatenation
 * - Static Methods for utility functions
 * - Nested Loops for multi-line banner output
 *
 * @author Nimrat
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    // Part 2 - Utility Static Methods

    /**
     * Builds and returns a HashMap containing character patterns
     * Key: Character (O, P, S)
     * Value: String array representing the ASCII art pattern
     */
    public static Map<Character, String[]> buildCharacterPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for 'O'
        String[] patternO = {
            "  ****  ",
            " **  ** ",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ****  "
        };
        patternMap.put('O', patternO);

        // Pattern for 'P'
        String[] patternP = {
            "******  ",
            "**   ** ",
            "**   ** ",
            "******  ",
            "**      ",
            "**      ",
            "**      "
        };
        patternMap.put('P', patternP);

        // Pattern for 'S'
        String[] patternS = {
            " ****** ",
            "**      ",
            "**      ",
            " ****** ",
            "      **",
            "      **",
            " ****** "
        };
        patternMap.put('S', patternS);

        return patternMap;
    }

    /**
     * Displays the banner for a given message using character patterns from the map
     * Uses StringBuilder for efficient string concatenation
     * Uses nested loops - outer for rows, inner for characters
     */
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        int numRows = 7;
        String separator = "  ";

        for (int row = 0; row < numRows; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]);
                    if (i < message.length() - 1) {
                        lineBuilder.append(separator);
                    }
                }
            }

            // Print the constructed line for this row
            System.out.println(lineBuilder.toString());
        }
    }

    // Part 3 - Main Method

    public static void main(String[] args) {
        // Build the character pattern map using HashMap
        Map<Character, String[]> characterPatternMap = buildCharacterPatternMap();

        // Display the banner for "OOPS"
        displayBanner("OOPS", characterPatternMap);
    }
}