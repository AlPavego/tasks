package m02.s12;

import java.math.BigInteger;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String n = String.valueOf(x);
        System.out.println(new BigInteger(n).toString(2));
        System.out.println(new BigInteger(n).toString(8));
        System.out.println(new BigInteger(n).toString(16));
        if (x < (1 << 8) / 2 - 1 && x > -(1 << 8) / 2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if (x < (1 << 16) / 2 - 1 &&  x > -((1 << 16) / 2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
