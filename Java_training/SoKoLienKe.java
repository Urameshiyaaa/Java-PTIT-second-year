package Test;
import java.util.Scanner;
public class SoKoLienKe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            long N = sc.nextLong();
            System.out.println(soKoLienKe(N));
        }
        sc.close();
    }
    public static String soKoLienKe(long N){
        String strN = String.valueOf(N);
        int s = 0;
        for (int i = 0; i < strN.length(); i++){
            int num = Character.getNumericValue(strN.charAt(i));
            s += num;
        }
        if (s % 10 != 0){
            return "NO";
        }
        for (int i = 0; i < strN.length() - 1; i++){
                if (Math.abs(strN.charAt(i) - strN.charAt(i+1)) != 2){
                    return "NO";
                }
            }
        return "YES";
    }
}
