package m01.s18;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr, quant;
        int max;
        arr = new int [in.nextInt()];
        quant = new int [arr.length];


        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int k : arr) {
                if (arr[i] == k)
                    count++;
            }
            quant[i] = count;
        }

        max = quant[0];
        for (int num: quant){
            if (max < num)
                max = num;
        }

        for(int i = 0; i < arr.length; i++){
            if (quant[i] == max){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
