package m01.s16;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (( ((n % 100) == 1) || ((n % 10) == 1)) && ((n % 100) != 11)){
            System.out.println(n + " TOPT");
        }
        else if ((n % 100) > 21 || n % 100 == 0) {
            if (((n % 10) > 1) && ((n % 10) < 5))
                System.out.println(n + " TOPTA");
            else
                System.out.println(n + " TOPTOB");
        }
        else {
            if ( ((n % 100) > 4) || (n == 0))
                System.out.println(n + " TOPTOB");
            else
                System.out.println(n + " TOPTA" );
            }
        }
    }