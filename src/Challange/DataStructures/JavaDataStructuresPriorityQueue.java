package Challange.DataStructures;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaDataStructuresPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Student2> pq = new PriorityQueue<Student2>((s1, s2) -> (s1.cgpa != s2.cgpa)
                ? (Double.compare(s2.cgpa, s1.cgpa))
                : (!s1.name.equals(s2.name) ? s1.name.compareTo(s2.name) : Integer.compare(s1.token, s2.token)));

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("ENTER")) {
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int token = sc.nextInt();

                pq.offer(new Student2(token, name, cgpa));
            } else if (command.equals("SERVED")) {
                pq.poll();
            }
        }

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                System.out.println(pq.poll().name);
            }
        }

        sc.close();
    }
}

class Student2 {
    int token;
    String name;
    double cgpa;

    Student2(int token, String name, double cgpa) {
        this.token = token;
        this.name = name;
        this.cgpa = cgpa;
    }
}




