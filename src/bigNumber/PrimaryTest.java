package bigNumber;
import javafx.css.Match;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimaryTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BigInteger big = scan.nextBigInteger();
        scan.close();
        if(big.isProbablePrime(1)){
            System.out.println("prime");
        }else
            System.out.println("not prime");

    }
}
