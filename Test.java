
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args){
        PhanSo ps1 = new PhanSo();
        System.out.println(ps1.inPs());
        
        PhanSo ps2 = new PhanSo(3,5);
        PhanSo ps3 = new PhanSo(8,18);
        
        PhanSo pst = ps2.congPs(ps3);
        System.out.println(pst.inPs());
        
        System.out.println(ps3.kiemTraToiGian());
        
        PhanSo psrg = ps3.rutGonPs();
        System.out.println(psrg.inPs());
    }
}
