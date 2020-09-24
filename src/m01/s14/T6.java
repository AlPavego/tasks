package m01.s14;

import java.util.Scanner;

public class T6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n ^ (~n + 1)) == -(n * 2))
            System.out.println(0);
        else
            System.out.println(1);
    }
}