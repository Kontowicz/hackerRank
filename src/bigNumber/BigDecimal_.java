package bigNumber;


import javafx.print.Collation;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimal_ {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s,0,n, (s1,s2)->{BigDecimal a = new BigDecimal(s1); BigDecimal b = new BigDecimal(s2); return b.compareTo(a);});




        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

