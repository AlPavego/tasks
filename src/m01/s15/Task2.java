package m01.s15;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        if (((a >= -3) && (a <= 5)) || ((a >= 9) && (a <= 15)))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
