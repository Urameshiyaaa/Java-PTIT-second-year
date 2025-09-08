import java.util.Scanner;
public class SoLienKe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            long N = sc.nextLong();
            System.out.println(soLienKe(N));
        }
        sc.close();
    }
    public static String soLienKe(long n){
        String strN = String.valueOf(n);
        for (int i = 0; i < strN.length() - 1; i++){
            if (Math.abs(strN.charAt(i) - strN.charAt(i+1)) != 1){
                return "NO";
            }
        }
        return "YES";
    }
}
