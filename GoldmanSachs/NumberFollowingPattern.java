package GoldmanSachs;

import java.util.Scanner;
import java.util.Stack;

public class NumberFollowingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        NumberFollowingPattern obj = new NumberFollowingPattern();
        System.out.println(obj.printMinNumberForPattern(str));
        sc.close();
    }

    public String printMinNumberForPattern(String str){
        int n = str.length();
        
        Stack<Integer> stack = new Stack<>();
        String result = "";
        for(int i=0; i<=n; i++)
        {
            stack.push(i+1);
            
            if(i==n || str.charAt(i) == 'I')
            {
                while(!stack.isEmpty())
                {
                    result += String.valueOf(stack.pop());
                }
            }
        }
        
        return result;
    }
}
