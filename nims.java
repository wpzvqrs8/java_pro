// package vs_code1.java_project_game;

import java.util.*;

public class nims {
    public void nim() {

        Scanner sc = new Scanner(System.in);
        int stones = 17;
        int player = 1;

        int stoneSelected;

        System.out.println("welcome to NIM game!");
        System.out.println("there are total 17 stones");
        System.out.println("Player can only select 1 to 3 stones");
        System.out.println("player selecting the last stone loses the game");
        System.out.println();
        
        System.out.println("--------GAME STARTS--------");

        while (stones > 0) {

            System.out.println("total stones right now: " + stones);

            System.out.println("Player " + player + " select stone between 1 to 3 :");
            stoneSelected = sc.nextInt();

            if (stoneSelected < 1 || stoneSelected > 3 || stoneSelected > stones) {
                System.out.println("invalid selection. Select stones between 1 to 3 or within the no. of stones");
                continue;
            }

            stones -= stoneSelected;

            if (stones == 0) {
                System.out.println("Player " + player + " loses");
                break;
            }

            player = (player == 1) ? 2 : 1;

        }

    }

    public static void main(String[] args) {
        new nims().nim();
    }
}