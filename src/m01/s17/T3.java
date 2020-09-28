package m01.s17;

import java.util.Scanner;

public class T3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = in.nextInt();

        while((i > 9) && (i < 100))
        {
            sum += (i % 10) + (i / 10);
            i = in.nextInt();
        }
        System.out.println(sum);
    }
}
