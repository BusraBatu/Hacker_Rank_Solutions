package Challange;

import java.util.HashSet;
import java.util.Scanner;

public class JavaDataStructuresHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet set= new HashSet<>();
        String x="";
        for (int i = 0; i < pair_right.length; i++) {
            x=pair_left[i]+" "+pair_right[i];
            set.add(x);
            System.out.println(set.size());
        }




    }
}
