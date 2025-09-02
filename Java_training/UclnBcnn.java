import java.util.Scanner;
public class uclnBcnn {
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int BoTest = sc.nextInt();
    for (int i = 1; i <= BoTest; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0){
            System.out.println(bcnn(a, b) + " " + ucln(a, b));
        }
        else{
            System.out.println("Nhập a, b nguyên dương đi bro");
        }
    }
    sc.close();
    }

    public static int ucln(int a, int b){
        while (b != 0){
            int uc = b;
            b = a % b;
            a = uc;
        }
        return a;
    }
    public static long bcnn(int a, int b){
        long bc = Math.abs((long)a * b) / ucln(a, b);
        return bc;
    }
}
