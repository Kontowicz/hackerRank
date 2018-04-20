package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<=s.length()-k; i++){
            list.add(s.substring(i,i+k));
        }

        java.util.Collections.sort(list);

        return list.get(0) + "\n" + list.get(list.size()-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
