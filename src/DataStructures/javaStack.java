package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class javaStack {
    private static boolean isBalanced(String arg){
        Stack<Character> stak = new Stack<>();

        for(int i=0; i<arg.length(); i++){
           if(!stak.empty()) {
               switch(arg.charAt(i)) {
                   case '}' : if (stak.peek() == '{') {
                       stak.pop();
                   } break;
                   case ']' : if (stak.peek() == '[') {
                       stak.pop();
                   } break;
                   case ')' : if (stak.peek() == '(') {
                       stak.pop();
                   } break;
                   default: stak.push(arg.charAt(i));
               }
           }else{
               stak.push(arg.charAt(i));
           }
        }
        return stak.isEmpty();
    }
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input)? "true":"false");
        }

    }
}
