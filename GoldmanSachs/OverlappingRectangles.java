package GoldmanSachs;

import java.util.Scanner;

public class OverlappingRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L1[] = new int[2];
        int L2[] = new int[2];
        int R1[] = new int[2];
        int R2[] = new int[2];
        System.out.println("Enter L1,R1 and L2,R2 coordinates (8 integers):");
        L1[0] = sc.nextInt();
        L1[1] = sc.nextInt();
        R1[0] = sc.nextInt();
        R1[1] = sc.nextInt();
        L2[0] = sc.nextInt();
        L2[1] = sc.nextInt();
        R2[0] = sc.nextInt();
        R2[1] = sc.nextInt();

        OverlappingRectangles or = new OverlappingRectangles();
        int result = or.doOverlap(L1, R1, L2, R2);
        if(result == 1)
            System.out.println("Rectangles do overlap.");
        else 
            System.out.println("Rectangles don't overlap");

        sc.close();
    }
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        int ax = L1[0], ay = L1[1];
        int bx = R1[0], by = R1[1];
        int x1 = L2[0], y1 = L2[1];
        int x3 = R2[0], y3 = R2[1];
        int x2 = x3, y2 = y1;
        int x4 = x1, y4 = y3;
        
        if((ax <= x1 && ay >= y1) && (x1 <= bx && y1 >= by))
            return 1;
        else if((ax <= x2 && ay >= y2) && (x2 <= bx && y2 >= by))
            return 1;
        else if((ax <= x3 && ay >= y3) && (x3 <= bx && y3 >= by))
            return 1;
        else if((ax <= x4 && ay >= y4) && (x4 <= bx && y4 >= by))
            return 1;
        
        ax = L2[0];
        ay = L2[1];
        bx = R2[0];
        by = R2[1];
        x1 = L1[0];
        y1 = L1[1];
        x3 = R1[0];
        y3 = R1[1];
        x2 = x3;
        y2 = y1;
        x4 = x1;
        y4 = y3;
        
        if((ax <= x1 && ay >= y1) && (x1 <= bx && y1 >= by))
            return 1;
        else if((ax <= x2 && ay >= y2) && (x2 <= bx && y2 >= by))
            return 1;
        else if((ax <= x3 && ay >= y3) && (x3 <= bx && y3 >= by))
            return 1;
        else if((ax <= x4 && ay >= y4) && (x4 <= bx && y4 >= by))
            return 1;
            
        if((ay >= y1 && y1 >= by) && (ay >= y3 && y3 >= by)) 
            if(ax >= x1 && bx <= x3)
                return 1;
        
        if((y1 >= ay && ay >= y3) && (y1 >= by && by >= y3))
            if(x1 >=ax && x3 <= bx)
                return 1;
        return 0;
    }
}