import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int max;
        int x = in.nextInt();
        int y = in.nextInt();
        max = (x < y ? y : x);
        System.out.println(max);
    }
}
