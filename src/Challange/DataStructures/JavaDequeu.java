package Challange.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            dq.add(number);
            set.add(number);

            if (dq.size() == m) {
                max = Math.max(set.size(), max);
                int item = dq.remove();
                if (!dq.contains(item)) {
                    set.remove(item);
                }
            }
        }
        System.out.println(max);
    }
}
