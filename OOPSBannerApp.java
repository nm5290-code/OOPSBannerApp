/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author Nimrat
 * @version 7.0
 */

// Extend the User Story 6 to implement a CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "OOPS"
// banner using these mappings. Thereby addressing the drawback of not having
// centralized character pattern management system.

// Key Requirements:
// 1. Create CharacterPatternMap class to hold character and its pattern
// 2. Implement methods to create and retrieve character patterns
// 3. Use CharacterPatternMap to display the "OOPS" banner
// 4. Implement modular and reusable character pattern management
// Drawback of this approach is that we are creating CharacterPatternMap objects ...

public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate a character and its corresponding pattern.
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Static Method to Create and initializes CharacterPatternMap array for predefined characters
     * * Populates pattern maps for letters 'O', 'P', 'S' and space character.
     * Each character has a 7-line ASCII art representation.
     * * @return array of CharacterPatternMap objects containing character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        String[] patternO = {
            "  OOO  ",
            " O   O ",
            " O   O ",
            " O   O ",
            " O   O ",
            " O   O ",
            "  OOO  "
        };

        String[] patternP = {
            " PPPP  ",
            " P   P ",
            " P   P ",
            " PPPP  ",
            " P     ",
            " P     ",
            " P     "
        };

        String[] patternS = {
            "  SSS  ",
            " S   S ",
            " S     ",
            "  SSS  ",
            "     S ",
            " S   S ",
            "  SSS  "
        };

        String[] patternSpace = {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', patternO),
            new CharacterPatternMap('P', patternP),
            new CharacterPatternMap('S', patternS),
            new CharacterPatternMap(' ', patternSpace)
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character
     * * Searches through the character pattern maps to find a matching character.
     * If the character is not found, recursively returns the pattern for space character.
     * * @param ch       the character to look up
     * @param charMaps the array of CharacterPatternMap objects to search through
     * @return the pattern array for the given character, or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // If the character is not found, recursively return the pattern for the space character
        if (ch != ' ') {
            return getCharacterPattern(' ', charMaps);
        }
        
        return new String[7]; // Safety fallback
    }

    /**
     * Prints a message as a banner using ASCII art patterns
     * * Renders the entire message horizontally by combining individual character
     * patterns line by line. Characters are separated by spacing for readability.
     * * @param message  the message string to be displayed as a banner
     * @param charMaps the array of CharacterPatternMap objects containing available patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int line = 0; line < 7; line++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                
                rowBuilder.append(pattern[line]).append("   "); // Added spacing between letters
            }
            
            System.out.println(rowBuilder.toString());
        }
    }

    /**
     * Main method - Entry point for the banner display application
     * * Initializes the character pattern maps and displays "OOPS" as an ASCII art banner.
     * * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // Define the message to be displayed
        String message = "OOPS";
        
        // Print the banner message
        printMessage(message, charMaps);
    }
}