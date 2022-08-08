package Challange.DataStructures;

import java.util.Scanner;

public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isStatus(leap, game, 0);
    }

    static boolean isStatus(int leap, int[] game, int x){
        if (x<0) return false;
        if (game[x] == 1) return false;
        if (x == game.length - 1) return true;
        if (x+leap>game.length-1) return true;

        game[x] = 1;
        return isStatus(leap, game, x+1)||isStatus(leap, game, x-1)||isStatus(leap, game, x+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
