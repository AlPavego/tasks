package m01.s17;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int a = in.nextInt();
        int b = in.nextInt();

        while (a - b >= 0)
        {
            a = a - b;
            count++;
        }
        System.out.println(count + " " + a);
    }
}
