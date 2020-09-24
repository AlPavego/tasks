package m01.s16;

import java.util.Locale;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        double b = in.nextDouble();

        if ((a == 0 && b <= 0) || (a < 0 && b < 0))
            System.out.println("no such x");
        else if ((a > 0 && b > 0) || (a == 0 && b > 0))
            System.out.println("any x");

        if (a > 0 && b < 0)
            System.out.printf("x<%.1f or x>%.1f ", b / a, (-1) * b / a);
        if (a < 0 && b > 0)
            System.out.printf("%.1f<x<%.1f ", b / a, (-1) * b / a);
    }
}