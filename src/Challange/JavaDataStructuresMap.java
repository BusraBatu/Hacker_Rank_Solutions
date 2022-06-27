package Challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class JavaDataStructuresMap {

        public static void main(String[] args) throws IOException {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(input.readLine());
            HashMap<String, Integer> map = new HashMap();
            while (a-->0) {
                String name = input.readLine();
                int phone   = Integer.parseInt(input.readLine());
                map.put(name, phone);
            }


            String str;
            while((str = input.readLine()) != null) {
                if (map.containsKey(str)) {
                    System.out.println(str + "=" + map.get(str));
                } else {
                    System.out.println("Not found");
                }
            }

            input.close();
        }
    }

