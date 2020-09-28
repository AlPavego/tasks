package m01.s17;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = 0;

        while (n > 0){
            if ((n % 10) > 0)
            {
                if (((n % 10) < min) || (min == 0))
                    min = n % 10;
            }
            n /= 10;
        }
        System.out.println(min);
    }
}
