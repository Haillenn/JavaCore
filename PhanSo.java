
/**
 * Write a description of class PhanSo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhanSo
{
    int ts;
    int ms;
    
    public PhanSo(){
        this.ts = 0;
        this.ms = 1;
    }
    
    public PhanSo(int ts, int ms){
        this.ts = ts;
        this.ms = ms;
    }
    
    public PhanSo congPs(PhanSo ps){
        int tsm = this.ts* ps.ms + ps.ts * this.ms;
        int msm = this.ms * ps.ms;
        PhanSo pst = new PhanSo(tsm, msm);
        return pst;
    }
    
    // Cong phan so ps1 + ps2
    public PhanSo congPs(PhanSo ps1, PhanSo ps2){
    
    }
    
    public int ucln(int a, int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }
    
    public PhanSo rutGonPs(){
        int ucln = ucln(this.ts, this.ms);
        int tsm = this.ts/ucln;
        int msm = this.ms/ucln;
        return new PhanSo(tsm, msm);
    }
    
    public boolean kiemTraToiGian(){
        int ucln = ucln(this.ts, this.ms);
        if(ucln == 1){
            return true;
        }
        
        return false;
    }
    
    public String inPs(){
        String ps = this.ts + "/" + this.ms;
        return ps;
    }
    
    
}
