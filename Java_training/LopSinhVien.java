import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float diemGPA;
    public SinhVien() {
        this.maSV = "B20DCCN001";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.diemGPA = 0.0f;
    }
    private String fixNgaySinh(String ngaySinhChuaChuan) {
        String[] ngaySinhFail = ngaySinhChuaChuan.split("/");
        String ngay = String.format("%02d", Integer.parseInt(ngaySinhFail[0]));
        String thang = String.format("%02d", Integer.parseInt(ngaySinhFail[1]));
        String nam = ngaySinhFail[2]; 
        return ngay + "/" + thang + "/" + nam;
    }
    public void infor(Scanner sc) {
        this.hoTen = sc.nextLine();
        this.lop = sc.nextLine();
        String ngaySinhInput = sc.nextLine();
        this.ngaySinh = fixNgaySinh(ngaySinhInput);
        this.diemGPA = sc.nextFloat();
    }
    public void displayInfor() {
        System.out.print(this.maSV + " ");
        System.out.print(this.hoTen + " ");
        System.out.print(this.lop + " ");
        System.out.print(this.ngaySinh + " ");
        System.out.printf("%.2f%n", this.diemGPA);
    }
}

public class LopSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        sv.infor(sc);
        sv.displayInfor();
        sc.close();
    }
}