package m01.s19;

import java.util.Scanner;

public class T5 {
    private static int[] arrFill(int[] x){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < x.length; i++){
            x[i] = in.nextInt();
        }
        return x;
    }
    private static double avgArif(int[] arr){
        int sum = 0;
        for (int num: arr){
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        arr = arrFill(arr);
        System.out.println(avgArif(arr));
    }
}
