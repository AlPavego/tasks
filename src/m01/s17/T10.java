package m01.s17;

import java.util.Scanner;

public class T10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flag = true;

        while(flag)
        {
            n++;
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                    break;
                if (i == n - 1)
                    flag = false;
            }
        }
        System.out.println(n);
    }
}
