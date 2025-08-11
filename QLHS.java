import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
/**
 * Write a description of class QLHS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QLHS
{
    private ArrayList<HocSinh> dshs;
    
    public QLHS(){
        dshs = new ArrayList<HocSinh>(); // mac dinh duoc cap 10 phan tu
    }
    
    public void themHocSinh(HocSinh hs){
        dshs.add(hs);
    }
    
    public void nhapDanhSach(Scanner sc){
        System.out.print("So hoc sinh can nhap n = ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i<n; i++){
            HocSinh hs = new HocSinh();
            hs.nhapThongTin(sc);
            themHocSinh(hs);
        }
    }
    
    public void inDanhSach(){
        // HocSinh hs;
        // for (int i = 0; i<dshs.size(); i++)
        //   {
               // hs = dshs.get(i); 
        //   }
        for (HocSinh hs: dshs){ // loai for each
            hs.inThongTin();
        }
    }
    
    public void timKiemHocSinh(String lop){
        for (HocSinh hs: dshs){ // loai for each
            if(lop.equals(hs.getLop())){
                hs.inThongTin();
            }
        }
    }
    
    public void timKiemHocSinh(int namSinh, String lop){
        for (HocSinh hs: dshs){ // loai for each
            if(lop.equals(hs.getLop()) && (namSinh == hs.getNgaySinh().getYear()+1900)){
                hs.inThongTin();
            }
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        QLHS qlhs= new QLHS();
        qlhs.nhapDanhSach(sc);
        qlhs.inDanhSach();
        qlhs.timKiemHocSinh("K63CNTTA");
        qlhs.timKiemHocSinh(2000, "K63CNTTA");
    }
}
