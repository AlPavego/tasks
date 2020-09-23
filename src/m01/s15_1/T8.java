package m01.s15_1;

import java.util.Locale;
import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((x > 0) && (((x * x) + (y * y) < 1) || ((y > -1) && (y < 1) && (y > (x - 1)))))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
