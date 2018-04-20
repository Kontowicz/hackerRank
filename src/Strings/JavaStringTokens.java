package Strings;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] parts = s.trim().split("[ !,?.\\_'@]+");
        if(s.length()>400000){
            return;
        }
        if(s==null || s.equals("") || s.trim().equals("")){
            System.out.println("0");
            return;
        }else {

            System.out.println(parts.length);
            for (String p : parts) {
                System.out.println(p);
            }
        }
        scan.close();
    }
}
