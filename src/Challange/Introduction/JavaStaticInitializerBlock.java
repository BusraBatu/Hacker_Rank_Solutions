package Challange.Introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static Scanner scan= new Scanner(System.in);
    static int B=scan.nextInt();
    static int H=scan.nextInt();
    static boolean flag=true;
    static{
        if(B>0 & H>0){
            flag=true;
        }else{
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
