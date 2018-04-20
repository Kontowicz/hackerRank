package Introdution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoopsII {

    private static double calc(int b, int p){
       double toReturn = 0;
       for(int i=0; i<=p; i++)
           toReturn += Math.pow(2,i)*b;
        return toReturn;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int k=0; k<n; k++){
                System.out.print(a+(int)calc(b,k) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
