package m01.s15_1;

import java.util.Locale;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y < 2 - (x * x)) && ((y > 0) || ((y <= 0) && (y > x))))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
