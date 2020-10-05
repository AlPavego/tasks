package m01.s19;

import java.util.Locale;
import java.util.Scanner;

public class T4 {
    private static void nBin (double x, int n){
        for (int i = 0; i < n; i++){
            x *= 2;
            System.out.print((int) x);
            if (x >= 1)
                x -= (int) x;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        nBin(in.nextDouble(), in.nextInt());
    }
}
