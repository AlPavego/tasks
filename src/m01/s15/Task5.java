package m01.s15;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (-a == b || -a == c || -a == d || -b == a || -b == c || -b == d)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
