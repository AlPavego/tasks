package m01.s19;

import java.util.Scanner;

public class T1 {
    private static int digitsSum(int x){
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(digitsSum(num));
    }
}
