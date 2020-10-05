package m01.s19;

import java.util.Scanner;

public class T3 {
    private static int numbers(int x){
        int count = 0;
        for (int i = x - 1; i > 100; i--){
            int sum = 0;
            int n = i;
            while (n > 0){
                sum += n % 10;
                n /= 10;
            }
            if (sum % 13 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(numbers(in.nextInt()));
    }
}
