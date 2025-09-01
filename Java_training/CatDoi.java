import java.util.Scanner;
public class CatDoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int BoTest = sc.nextInt();

        for (int i = 1; i <= BoTest; i++){
            String nhapN = sc.next();
            System.out.println(checkSoCatDoi(nhapN));
        }
        sc.close();
    }
    public static String checkSoCatDoi(String n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for (int i = 0; i < String.valueOf(n).length(); i++ ){
            char str = String.valueOf(n).charAt(i);
            if ( str == '0' || str == '1'){
            } 
            else if (str == '8' || str == '9'){
                sb.setCharAt(i, '0');
            }
            else{return "INVALID";}

        }
        if (sb.toString().matches("0+")) {
            return "INVALID";
        }
        return sb.toString().replaceFirst("^0+(?!$)", "");
        }
}
            

