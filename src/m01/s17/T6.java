package m01.s17;

import java.util.Scanner;

public class T6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;

        for (int i = 25; i < n; i++)
        {
            if (i % 2 == 0)
                c += i;
        }
        System.out.println(c);
    }
}
