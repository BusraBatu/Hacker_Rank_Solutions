package Challange.String;

import java.util.Scanner;

public class StringReverse {
    /*
Sample Input
madam
Sample Output
Yes
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();


        if ((new StringBuilder(A).reverse().toString()).equalsIgnoreCase(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
