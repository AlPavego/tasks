package m01.s16_1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        if (month > 12 || month < 1) {
            System.out.println(0);
        }
        else {
            if (month < 8 && month % 2 == 1 || month > 7 && month % 2 == 0){
                System.out.println(31);
            }
            else if (month > 8 && month % 2 == 1 || (month < 7 && month != 2) && month % 2 == 0){
                System.out.println(30);
            }
            else{
                System.out.println(28);
            }
        }
    }
}
