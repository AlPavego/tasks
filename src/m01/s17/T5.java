package m01.s17;

import java.util.Scanner;

public class T5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;

        do {
            n /= 2;
            c++;
        } while (n > 0);

        System.out.println(c);
    }
}
