import java.util.Date;
import java.util.Scanner;
/**
 * Write a description of class HocSinh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HocSinh extends Nguoi
{
    // String hoTen;
    private String lop;
    private String khoaHoc;
    private int kyHoc;
    
    public HocSinh(){}
    
    public HocSinh(String hoTen, String lop, String khoaHoc){
        this.hoTen = hoTen;
        this.lop = lop;
        this.khoaHoc = khoaHoc;
    }
    
    public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc){
        this(hoTen, lop, khoaHoc);
        this.ngaySinh = ngaySinh;
    }
    
    public String getLop(){
        return lop;
    }
    
    public void inThongTin(){
        super.inThongTin(); // in hoTen, ngaySinh, queQuan
        System.out.println("Lop: " + lop);
        System.out.println("Khoa hoc: " + khoaHoc);
        System.out.println("-------------");
        
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc = sc.nextLine();
    }
}
