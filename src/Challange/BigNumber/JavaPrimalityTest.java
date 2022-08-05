package Challange.BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger prime= new BigInteger(n);

        if(prime.isProbablePrime(1))
        {System.out.println("prime");}
        else{
            System.out.println("not prime");

        }
        bufferedReader.close();
    }
}
