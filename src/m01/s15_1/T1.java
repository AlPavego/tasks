package m01.s15_1;

import java.util.Locale;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (x < 2 && y < x && x * x + y * y > 4 && y > 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
