//MAIN
package enrollmentsystem;
import java.util.Scanner;


public class EnrollmentSystem {
    
    public static void main(String[] args) {
    Scanner sm = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);
    
    int a;
   
    System.out.println("Welcome to IETI");
    System.out.println("(1) = first year first semester");
    System.out.println("(2) = first year second semester");
    System.out.println("(3) = second year first semester");
    System.out.println("(4) = second year second semester");
    System.out.println("(5) = third year first semester");
    System.out.println("(6) = third year second semester");
    System.out.println("(7) = fourth year first semester");
    System.out.println("(8) = fourth year second semester");
    
    a = sm.nextInt();
    
    switch (a) {
        
    case 1:
          
    y1s1 link1 = new y1s1 ();
    link1.display1();
    
    break; 
    
    case 2:
    
    y1s2 link2 = new y1s2 ();
    link2.display2();
   
    break;
    
    case 3:
    
    y2s1 link3 = new y2s1 ();
    link3.display3();
    
    break;
    
    case 4:
    
    y2s2 link4 = new y2s2 ();
    link4.display4();
    
    break;
    
    case 5:
    
    y3s1 link5 = new y3s1 ();
    link5.display5();
    
    break;
    
    case 6:
    
    y3s2 link6 = new y3s2 ();
    link6.display6();
    
    break;
    
    case 7:
    
    y4s1 link7 = new y4s1 ();
    link7.display7();
    
    break;
    
    case 8:
    
    y4s2 link8 = new y4s2 ();
    link8.display8();
    
    break;
    
    }
    
    }

    }  