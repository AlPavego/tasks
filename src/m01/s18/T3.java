package m01.s18;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int [in.nextInt()];
        double sum = 0;
        int c = 0;
        boolean f = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int num: arr) {
            if (num % 2 == 1 || num % 2 == -1) {
                f = true;
                sum += num;
                c++;
            }
        }
        if ((sum == 0) && !f) {
            System.out.println("NO");
        }
        else {
            sum /= c;
            System.out.printf("%.2f", sum);
        }
    }
}
