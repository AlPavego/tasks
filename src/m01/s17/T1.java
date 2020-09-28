package m01.s17;

import java.util.Scanner;

public class T1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;

        do {
            count++;
        } while(in.nextInt() >= 0);
        System.out.println(count);
    }
}
