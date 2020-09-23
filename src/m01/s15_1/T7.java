package m01.s15_1;

import java.util.Locale;
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        float x = in.nextFloat();
        float y = in.nextFloat();
        if (((y > 1 - x) && (y > 2 * x * x) && (x < 1)) || ((y > 1 - x) && (x < 1) && (x > 0)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
