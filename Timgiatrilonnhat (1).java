
import java.util.Scanner ; 
public class Timgiatrilonnhat {
 public static void main(String[] args) {
   
    Scanner input  = new Scanner(System.in);
    System.out.println("Nhap a: " );
     int a = input.nextInt() ; 
    System.out.println("Nhap b: ");
       int b = input.nextInt() ;
    System.out.println("Nhap c: ");
       int c = input.nextInt() ; 
    System.out.println("Nhap d: " );
       int d = input.nextInt() ;
//Th�m d�ng do�n nh�n c?p nh?t
else if(c>=a && c>=b &&  c>=d) {
            System.out.println(b+ "\tb lon nhat");
    }else
        System.out.println(d+ "\t d lon nhat");
//Th�m d�ng quang s? c?p nh?t
else if(c>=a && c>=b &&  c>=d) {
            System.out.println(b+ "\tb lon nhat");
    }else
        System.out.println(d+ "\t d lon nhat");
        
   
    
    }
        
   
    
    
}
// truongtattrung cap nhap
