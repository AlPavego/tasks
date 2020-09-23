package m01.s15_1;

import java.util.Locale;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y < 0.5) && (y > 0) && (x < Math.PI) && (x > 0) && (y < Math.sin(x)))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
