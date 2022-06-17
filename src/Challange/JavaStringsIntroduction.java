package Challange;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int aLength=A.length();
        int bLength=B.length();
    String x="";
       if(A.compareTo(B)<0){
           x="No";
           A=A.substring(0,1).toUpperCase()+A.substring(1);
           B=B.substring(0,1).toUpperCase()+B.substring(1);
       }else if(A.compareTo(B)==0){
            x="No";
            A=A.substring(0,1).toUpperCase()+A.substring(1);
            B=B.substring(0,1).toUpperCase()+B.substring(1);
        }else{
            x="Yes";
            A=A.substring(0,1).toUpperCase()+A.substring(1);
            B=B.substring(0,1).toUpperCase()+B.substring(1);
        }



        System.out.println(aLength+bLength);
        System.out.println(x);
        System.out.println(A+" "+B);




    }
}
