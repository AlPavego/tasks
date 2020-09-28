package m01.s17;

import java.util.Scanner;

public class T2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;

        do {
            n = in.nextInt();
            if (n > 10)
                sum += n;
        } while(n % 5 != 0);
        System.out.println(sum);
    }
}
