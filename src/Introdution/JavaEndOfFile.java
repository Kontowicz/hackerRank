package Introdution;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args){
        int i = 0;
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            System.out.println(++i + " " + s.nextLine());
        }
    }
}
