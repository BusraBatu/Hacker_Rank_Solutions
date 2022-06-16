package Challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
 */

public class JavaStringToken {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.length()>400000)
        {
            return ;
        }
        else if(s.length()==0)
        {
            System.out.println(0);
        }
        else
        {
            String[] words = s.split("[!,?.*_'@\\ ]+");
            int count = words.length;
            System.out.println(count);
            for(String word : words)
            {
                System.out.println(word);
            }
        }

        scan.close();
    }
}
