package m01.s16_1;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println(max);
    }
}
