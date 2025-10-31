import java.util.Scanner;

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;
    public NhanVien() {
        this.maNV = "00001";
    }
    public void infor(Scanner sc) {
        this.hoTen = sc.nextLine();
        this.gioiTinh = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.diaChi = sc.nextLine();
        this.maSoThue = sc.nextLine();
        this.ngayKyHopDong = sc.nextLine();
    }
    public void displayInfor() {
        System.out.print(this.maNV + " ");
        System.out.print(this.hoTen + " ");
        System.out.print(this.gioiTinh + " ");
        System.out.print(this.ngaySinh + " ");
        System.out.print(this.diaChi + " ");
        System.out.print(this.maSoThue + " ");
        System.out.print(this.ngayKyHopDong);
        System.out.println(); 
    }
}
public class LopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.infor(sc);
        nv.displayInfor();
        sc.close();
    }
}