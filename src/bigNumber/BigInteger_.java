package bigNumber;
import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger first = scan.nextBigInteger();
        BigInteger second = scan.nextBigInteger();
        System.out.println(first.add(second));
        System.out.println(first.multiply(second));
    }
}
