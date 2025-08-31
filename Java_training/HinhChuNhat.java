import java.util.Scanner;
public class HinhChuNhat{
    public static void main(String[] args){
        Scanner hcn = new Scanner(System.in);
        int chieuDai = hcn.nextInt();
        int chieuRong = hcn.nextInt();
        if (chieuDai <= 0 || chieuRong <= 0 ){
            System.out.print(0);
        }
        else{
            int chuVi = (chieuDai + chieuRong) * 2;
            int dienTich = chieuDai * chieuRong;
        
        System.out.print(chuVi + " ");
        System.out.print(dienTich);
        }
        hcn.close();
    }
}
