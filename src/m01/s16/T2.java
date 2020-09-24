package m01.s16;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c)
                System.out.println(c + " " + b + " " + a);
            else
                System.out.println(b + " " + c + " " + a);
        }
        else if ((b > a) && (b > c)){
            if (a > c)
                System.out.println(c + " " + a + " " + b);
            else
                System.out.println(a + " " + c + " " + b);
        }
        else
            if (a > b)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(a + " " + b + " " + c);
    }
}
