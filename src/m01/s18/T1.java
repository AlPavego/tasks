package m01.s18;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int [in.nextInt()];
        int n;
        int a = -1;

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        n = in.nextInt();

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == n)
            {
                a = i;
                break;
            }
        }
        if (a == -1)
            System.out.println("NO");
        else
            System.out.println(a + 1);
    }
}
