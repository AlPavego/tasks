package m01.s18;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int [in.nextInt()];
        int sum = 0;
        boolean f = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int num: arr) {
            if (num % 2 == 0) {
                f = true;
                sum += num;
            }
        }
        if ((sum == 0) && (f == false))
            System.out.println("NO");
        else
            System.out.println(sum);
    }
}
