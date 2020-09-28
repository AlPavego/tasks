package m01.s18;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[in.nextInt()];

        for (int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        for (int i = 1; i < a.length + 1; i++){
            System.out.print(a[a.length - i] + " ");
        }
    }
}
