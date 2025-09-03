import java.util.Scanner;
public class UocChiaHet2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int BoTest = sc.nextInt();

        for (int i = 1; i <= BoTest; i++){
            int n = sc.nextInt();
            if (n >= 1){
                System.out.println(uch2(n));
            }
        }
        sc.close();
    }
    public static long uch2(long n){
        int a = 0;
        long N = n / 2;
        if (n % 2 != 0){
            return a;
        }
        for (long i = 1; i * i <= N; i++){
            if (n % 2 == 0){
                a++;
                if (i != N / i){
                    a++;
                }
            }
        }
        return a;
    }
}