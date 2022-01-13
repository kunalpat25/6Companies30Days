package GoldmanSachs;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        DecodeString obj = new DecodeString();
        System.out.println(obj.decodeString(s));
        sc.close();
    }
    public String decodeString(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ']')
            {
                String temp = "";
                while(!st.isEmpty() && st.peek() != '[')
                {
                    temp = st.pop() + temp;
                }
                
                if(!st.isEmpty())
                    st.pop();
                    
                String num = "";
                while(!st.isEmpty() && Character.isDigit(st.peek()))
                {
                    num = st.pop() + num;
                }
                
                int times = Integer.parseInt(num);
                String repeat = temp;
                for(int k=1; k<times; k++)
                {
                    temp = temp + repeat;
                }
                
                for(int j=0; j<temp.length(); j++)
                {
                    st.push(temp.charAt(j));
                }
            }
            else
                st.push(s.charAt(i));
        }
        String res = "";
        while(!st.isEmpty())
            res = st.pop() + res;
            
        return res;
    }
}