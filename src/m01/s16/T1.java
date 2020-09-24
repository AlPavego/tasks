package m01.s16;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if ((num >= 0) && (num < 10))
            System.out.println("DIGIT");
        else if ((num >= 10) && (num < 100))
            System.out.println("NUM");
        else
            System.out.println("OTHER");
    }
}
