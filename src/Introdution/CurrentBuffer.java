package Introdution;
import java.util.Scanner;
public class CurrentBuffer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] tabl = new int[3];
        for(int i=0;i<3;i++){
            tabl[i] = scan.nextInt();
        }

        for(int i=0; i<3; i++){
            System.out.println(tabl[i]);
        }
    }
}
