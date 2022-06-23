package Challange;

import java.util.Scanner;

public class JavaDataStructuresSubArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int arr[]=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=scan.nextInt();
        }
        int count=0;

        for (int i = 0; i < a; i++) {
            int sum=0;
            for (int j = i; j < a; j++) {
                sum+=arr[j];
                if(sum<0){
                    count++;
                }


            }

        }
        System.out.println(count);

    }
}
