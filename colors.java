public class colors {

    // === ANSI BASIC ===

    public static String gradientText(String text,
                                      int r1, int g1, int b1,
                                      int r2, int g2, int b2) {

        StringBuilder sb = new StringBuilder();
        int len = text.length();

        for (int i = 0; i < len; i++) {
            float ratio = (float) i / (len - 1);
            int r = (int) (r1 + ratio * (r2 - r1));
            int g = (int) (g1 + ratio * (g2 - g1));
            int b = (int) (b1 + ratio * (b2 - b1));

            sb.append(rgb(r, g, b))
              .append(text.charAt(i));
        }
        sb.append(RESET);
        return sb.toString();
    }




    public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Bright Colors
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    // Background Colors
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    // Bright Backgrounds
    public static final String BG_BRIGHT_BLACK = "\u001B[100m";
    public static final String BG_BRIGHT_RED = "\u001B[101m";
    public static final String BG_BRIGHT_GREEN = "\u001B[102m";
    public static final String BG_BRIGHT_YELLOW = "\u001B[103m";
    public static final String BG_BRIGHT_BLUE = "\u001B[104m";
    public static final String BG_BRIGHT_MAGENTA = "\u001B[105m";
    public static final String BG_BRIGHT_CYAN = "\u001B[106m";
    public static final String BG_BRIGHT_WHITE = "\u001B[107m";

    // Styles
    public static final String BOLD = "\u001B[1m";
    public static final String DIM = "\u001B[2m";
    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BLINK = "\u001B[5m";
    public static final String REVERSE = "\u001B[7m";
    public static final String HIDDEN = "\u001B[8m";
    public static final String STRIKETHROUGH = "\u001B[9m";

    // Cursor & Screen control
    public static final String CLEAR_SCREEN = "\u001B[2J";
    public static final String CLEAR_LINE = "\u001B[K";
    public static final String SAVE_CURSOR = "\u001B[s";
    public static final String RESTORE_CURSOR = "\u001B[u";
    public static final String HIDE_CURSOR = "\u001B[?25l";
    public static final String SHOW_CURSOR = "\u001B[?25h";

    // Helper for 256-color mode
    public static String color256(int n) {
        return "\u001B[38;5;" + n + "m";
    }

    // Helper for 24-bit RGB
    public static String rgb(int r, int g, int b) {
        return "\u001B[38;2;" + r + ";" + g + ";" + b + "m";
    }

    // Helper to move cursor
    public static String moveCursor(int row, int col) {
        return "\u001B[" + row + ";" + col + "H";
    }

    public static void main(String[] args){

        System.out.println(CLEAR_SCREEN + moveCursor(1, 1));

        System.out.println(BOLD + "=== ANSI COLORS DEMO ===" + RESET);
        System.out.println();

        // Regular colors
        System.out.println("Regular colors:");
        System.out.println(RED + "RED" + RESET);
        System.out.println(GREEN + "GREEN" + RESET);
        System.out.println(YELLOW + "YELLOW" + RESET);
        System.out.println(BLUE + "BLUE" + RESET);
        System.out.println(MAGENTA + "MAGENTA" + RESET);
        System.out.println(CYAN + "CYAN" + RESET);
        System.out.println(WHITE + "WHITE" + RESET);
        System.out.println();

        // Bright colors
        System.out.println("Bright colors:");
        System.out.println(BRIGHT_RED + "BRIGHT RED" + RESET);
        System.out.println(BRIGHT_GREEN + "BRIGHT GREEN" + RESET);
        System.out.println(BRIGHT_YELLOW + "BRIGHT YELLOW" + RESET);
        System.out.println(BRIGHT_BLUE + "BRIGHT BLUE" + RESET);
        System.out.println(BRIGHT_MAGENTA + "BRIGHT MAGENTA" + RESET);
        System.out.println(BRIGHT_CYAN + "BRIGHT CYAN" + RESET);
        System.out.println(BRIGHT_WHITE + "BRIGHT WHITE" + RESET);
        System.out.println();

        // Backgrounds
        System.out.println("Background colors:");
        System.out.println(BG_RED + WHITE + "RED BG" + RESET);
        System.out.println(BG_GREEN + BLACK + "GREEN BG" + RESET);
        System.out.println(BG_BLUE + WHITE + "BLUE BG" + RESET);
        System.out.println(BG_YELLOW + BLACK + "YELLOW BG" + RESET);
        System.out.println(BG_MAGENTA + WHITE + "MAGENTA BG" + RESET);
        System.out.println(BG_CYAN + BLACK + "CYAN BG" + RESET);
        System.out.println();

        // Styles
        System.out.println("Styles:");
        System.out.println(BOLD + "Bold Text" + RESET);
        System.out.println(ITALIC + "Italic Text" + RESET);
        System.out.println(UNDERLINE + "Underlined Text" + RESET);
        System.out.println(REVERSE + "Reversed Colors" + RESET);
        System.out.println(STRIKETHROUGH + "Strikethrough Text" + RESET);
        System.out.println();

        // 256-color demo
        System.out.println("256-color gradient:");
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                int code = i * 16 + j;
                System.out.print(color256(code) + String.format("%4d", code));
            }
            System.out.println(RESET);
        }
        System.out.println();

        // TrueColor demo (RGB gradient)
        System.out.println("TrueColor RGB gradient:");
        for (int r = 0; r <= 255; r += 51) {
            for (int g = 0; g <= 255; g += 51) {
                for (int b = 0; b <= 255; b += 51) {
                    System.out.print(rgb(r, g, b) + " 0 " + RESET);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(BOLD + GREEN + "=== DEMO COMPLETE ===" + RESET);
    }
}
