package m01.s14;

import java.util.Scanner;

public class T1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println((a >> b) << b);
    }
}