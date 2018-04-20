package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class javaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            int v = scanner.nextInt();
            list.add(v);
        }
        int p = scanner.nextInt();
        for(int i=0; i<p; i++){
            String query = scanner.next();

             if(query.equals("Insert")) {
                 int pos = scanner.nextInt();
                 int val = scanner.nextInt();
                 list.add(pos, val);
             }
              else {
                 int pos = scanner.nextInt();
                 list.remove(pos);
             }

            }


        for (Integer e: list
             ) {
            System.out.print(e.toString()+" ");
        }
    }
}
