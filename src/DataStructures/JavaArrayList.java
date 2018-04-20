package DataStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        ArrayList[] contaienr = new ArrayList[len];
        for(int i=0; i<len; i++){
            int len2 = scanner.nextInt();
            contaienr[i] = new ArrayList();
            for(int j=0; j<len2; j++){
                contaienr[i].add(scanner.nextInt());
            }
        }

        int query = scanner.nextInt();
        for(int i=0; i<query; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(contaienr[x-1].get(y-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
