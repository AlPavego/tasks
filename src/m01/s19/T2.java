package m01.s19;

public class T2 {
    private static int digitsSum(){
        int i = 10;
        int sum = 0;
        while (i < 100){
            if (i % 7 == 0){
                int n = i;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitsSum());
    }
}
