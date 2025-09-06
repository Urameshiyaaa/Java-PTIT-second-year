import java.util.Scanner;
public class Count4and7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(count4and7(n));
        sc.close();
    }
    public static String count4and7(long N){
        int count4 = 0;
        int count7 = 0;
        String strN = String.valueOf(N);
        for (int i = 0; i < strN.length(); i++){
            if (strN.charAt(i) == '4'){
                count4++;
            }
            else if (strN.charAt(i) == '7'){
                count7++;
            }
        }
        int c = count4 + count7;
        if (c == 4 || c == 7){
            return "YES";
        }
        return "NO";
    }
}