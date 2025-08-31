import java.util.Scanner;
public class CheckFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long BoTest = sc.nextLong();

        for (int i = 1; i <= BoTest; i++){
            long nhapN = sc.nextLong();
            System.out.println(checkFbnc(nhapN));
        }
        sc.close();
    }
    public static String checkFbnc(long n){
        if (n == 0 || n == 1) return "YES";
        long f1 = 1, f2 = 1, fn = 0;
        while (fn < n) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn == n ? "YES" : "NO";
    }
}
