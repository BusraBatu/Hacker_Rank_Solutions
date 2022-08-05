package Challange.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaDataStructuresArrayList {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numberOfList=scan.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList();
        for (int i = 0; i < numberOfList; i++) {
            int numberOfElements=scan.nextInt();
            ArrayList<Integer> list = new ArrayList();
            for (int j = 0; j < numberOfElements; j++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }

        int queries = scan.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
