import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';
    private static final char L_BRACE    = '{';
    private static final char R_BRACE    = '}';
    private static final char L_BRACKET  = '[';
    private static final char R_BRACKET  = ']';
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        
        if(isBalanced(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if      (s.charAt(i) == L_PAREN)   stack.push(L_PAREN);

            else if (s.charAt(i) == L_BRACE)   stack.push(L_BRACE);

            else if (s.charAt(i) == L_BRACKET) stack.push(L_BRACKET);

            else if (s.charAt(i) == R_PAREN) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_PAREN) return false;
            }

            else if (s.charAt(i) == R_BRACE) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_BRACE) return false;
            }

            else if (s.charAt(i) == R_BRACKET) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_BRACKET) return false;
            }

            // ignore all other characters

        }
        return stack.isEmpty();
    }
}
