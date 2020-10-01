package m01.s18;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        int count = 0;
        int first_c = -1;
        arr = new int [in.nextInt()];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int k: arr){
            if (k < 0)
                first_c++;
            else
                break;
        }

        for (int i = first_c + 1; i < arr.length; i++){
            if (arr[i] < 0){
                int temp = arr[i];
                for (int j = i; j > first_c + 1; j--){
                    arr[j] = arr[j - 1];
                }
                arr[first_c + 1] = temp;
                first_c++;
            }
        }

        for(int k: arr){
            System.out.print(k + " ");
        }
    }
}
