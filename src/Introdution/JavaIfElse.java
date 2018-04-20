package Introdution;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();

        if(in%2==1){
            System.out.println("Weird");
        }
        else if(in%2==0 && in >2 && in < 5){
            System.out.println("Not Weird");
        }
        else if(in%2==0 && in >6 && in < 20) {
            System.out.println("Weird");
        }
        else if(in%2==0 && in>20){
            System.out.println("Not Weird");
        }

    }

}
