package m01.s15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (((a < 1000) && (a > 99)) && (a % 5 == 0))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
