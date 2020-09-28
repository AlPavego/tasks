package m01.s18;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[in.nextInt()];

        for (int i = 0; i < a.length; i++){
            if (i == 0){
                a[i] = 4;
            }
            else
                a[i] = a[i - 1] + 3;
            System.out.print(a[i] + " ");
        }
    }
}
