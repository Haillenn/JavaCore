import java.util.Scanner;
/**
 * Write a description of class Bai4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bai4
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap ho ten: ");
       String s = sc.nextLine();
       
       int l = s.length();
       int b = s.indexOf(" ");
       int f = s.lastIndexOf(" ");
       
       String ho = s.substring(0,b);
       String dem = s.substring(b+1,f);
       String ten = s.substring(f+1);
       
       System.out.println("Ho: " + ho);
       System.out.println("Dem: " + dem);
       System.out.println("Ten: " + ten);
       
    }
}
