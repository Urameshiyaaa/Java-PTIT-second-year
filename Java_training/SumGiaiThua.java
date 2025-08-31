import java.util.Scanner;
public class SumGiaiThua {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        while (n > 20){
            n = sc.nextLong();
        }
        long s0 = 1, s = 0;
        for (int i = 1; i <= n; i++){
            s0 *= i;
            s += s0; 
        }
        System.out.println(s);
        sc.close();
    }
}
