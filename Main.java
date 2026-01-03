import java.util.*;

class Main {
    public static void printBigLogo() {

        String[] logo = {
                "                                  888",
                "                                  888",
                "oooo oooo    ooo     .ooooo.      888      .ooooo.      .ooooo.   ooo. .oo.  .oo.       .ooooo.  ",
                " `88. `88.  .8'     d88' `88b     888     d88' \"Y8     d88' `88b  `888P Y88bP Y88b     d88' `88b ",
                "  `88..]88..8'      888ooo888     888     888          888   888   888   888   888     888ooo888 ",
                "   `888'`888'       888    .o     888     888   .o8    888   888   888   888   888     888    .o ",
                "    `8'  `8'        `Y8bod8P'    o888o    `Y8bod8P'    `Y8bod8P'   o888o o888o o888o   `Y8bod8P' ",
                "                                                              ",
                "                                                             ",
                "                                                             "

        };

        String BG_BLACK = "\u001B[40m";

        int startR = 255, startG = 0, startB = 0; // pink
        int endR = 0, endG = 0, endB = 255; // cyan

        int width = 105;

        // Top border
        // Top border
        System.out.println(BG_BLACK + colors.BOLD + colors.gradientText(
                "╔" + "═".repeat(width + 2) + "╗",
                startR, startG, startB,
                endR, endG, endB));

        // Logo lines
        for (String line : logo) {
            String padded = String.format("%-" + width + "s", line);
            System.out.println(BG_BLACK +
                    colors.gradientText("║ " + padded + " ║",
                            startR, startG, startB,
                            endR, endG, endB));
        }

        // Bottom border
        // Bottom border
        System.out.println(BG_BLACK + colors.BOLD + colors.gradientText(
                "╚" + "═".repeat(width + 2) + "╝",
                startR, startG, startB,
                endR, endG, endB));

        System.out.println();
    }
    void main_menu(){
        System.out.println(colors.BG_BLACK+colors.CYAN
                + "<============================AVAILABLE GAMES=================================>" + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 1)................................ Chess...................................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 2)................................ Tic-Tac-Toe.............................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 3)................................ UNO......................................" + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 4)................................ NIMs....................................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 5)................................ Dots & Boxes............................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 6)................................ Connect-4................................" + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 7)................................ Hangman / Word Guess....................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 8)................................ Snake & Ladder..........................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 9)................................ Sudoku..................................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 10)............................... Snake & Apple............................" + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 11)............................... 2048....................................." + colors.RESET);
        System.out.println(colors.BG_BLACK+colors.WHITE+" 12)............................... Battleship..............................." + colors.RESET);
        System.out.println("\n\n");
        System.out.println(colors.RED+"For EXIT -> 0"+colors.RESET);
        System.out.println(colors.WHITE + "Select a game by entering its number...           " + colors.RESET);
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();
        if(gameNumber==1){
            new chess();
            main_menu();
        }
        else if (gameNumber==2) {
            new tic_tac_toe();
            main_menu();
        }
        else if (gameNumber==3) {
            new uno();
            main_menu();
        }
        else if (gameNumber==4) {
            new nims();
            main_menu();
        }
        else if (gameNumber==5) {
            new dot_boxes();
            main_menu();
        }
        else if (gameNumber==6) {
            new connect_4();
            main_menu();
        }
        else if (gameNumber==7) {
            new hangman();
            main_menu();
        }
        else if (gameNumber==8) {
            new snake_ladder();
            main_menu();
        }
        else if (gameNumber==9) {
            new suduko();
            main_menu();
        }
        else if (gameNumber==10) {
            new snake_apple();
            main_menu();
        }
        else if (gameNumber==11) {
            new game_2048();
            main_menu();
        }
        else if (gameNumber==12) {
            new battle_ship();
            main_menu();
        } else if (gameNumber==0) {
            System.out.printf("Thank you  for playing !!");
            return;
        }
    }
    public static void main(String[] args) {
        printBigLogo();
        new Main().main_menu();

    }
}