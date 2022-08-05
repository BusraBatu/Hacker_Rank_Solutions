package Challange.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {

        try{
            Scanner scan= new Scanner(System.in);
            int x=scan.nextInt();
            int y=scan.nextInt();
            int result=x/y;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }

}
