package GoldmanSachs;

import java.util.Scanner;

public class SquaresInChessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SquaresInChessboard obj = new SquaresInChessboard();
        System.out.println(obj.findSquaresInChessboard(n));
        sc.close();
    }
    public long findSquaresInChessboard(int n){
        long ans = ( n * (n+1) * ((2 * n) + 1)) / 6;
        return ans;
    }
}
