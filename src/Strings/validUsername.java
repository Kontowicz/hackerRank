package Strings;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    String regex = "[A-Za-z](\\w){7,28}";
    public static final String regularExpression = null;
}

public class validUsername {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
