package Challange.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int numberOfElements=scan.nextInt();
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<numberOfElements; i++){
            int b=scan.nextInt();
            list.add(b);
        }
        int queries=scan.nextInt();

        for(int i=0; i<queries; i++){
            String  x=scan.next();
            if (x.equals("Insert"))
            {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            }
            else
            { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }

        scan.close();
        for(Integer each: list){
            System.out.print(each+" ");
        }

    }
}
