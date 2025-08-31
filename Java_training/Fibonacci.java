import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BoTest = sc.nextInt();

        for (int i = 1; i <= BoTest; i++){
            int nhapN = sc.nextInt();
            System.out.println(fibonacci(nhapN));
        }
        sc.close();
    }
    public static long fibonacci(int n){
        if (n == 2 || n == 1 || n > 92){
            return 1;
        }
        long f1 = 1, f2 = 1, fn = 0;
        for (int i = 3; i <= n; i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
