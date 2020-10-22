package m01.s16_1;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = in.nextInt();
        int day = in.nextInt();
        if (!(month < 13 && month > 0 && day <= months[month - 1])) {
            System.out.println(-1);
        }
        else {
            day = months[month - 1] - day;
            for (int m = month; m < months.length; m++) {
                day += months[m];
            }
            System.out.println(day);
        }
    }
}
