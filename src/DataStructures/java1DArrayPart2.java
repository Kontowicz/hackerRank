package DataStructures;

import java.util.Scanner;

public class java1DArrayPart2 {
    public static boolean canWin( int i,int leap, int[] game) {
        if(i<0 || game[i]==1){
            return false;
        }
        else if(i+1>=game.length || i+leap>=game.length){
            return true;
        }
        game[i] = 1;
        return canWin(i+leap,leap,game) ||
                canWin(i+1,leap,game) ||
                canWin(i-1,leap,game);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(0,leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
