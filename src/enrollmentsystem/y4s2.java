//fourth year second semester 
package enrollmentsystem;
import java.util.Scanner;

public class y4s2 {
    
    static String name;
    static int downpayment;
    static int properdownpayment;
    static int totalpayment;
    static double balancepayment;
    static double perexampayment;
    
    static int paymenttotal;
    static int payment1;
    static int payment2;
    static int payment3;
    static int payment4;
    static int payment5;
    static int payment6;
    static int payment7;
    static int payment8;
    static int payment9;

    static int totallabs;
    static int lab1; 
    static int lab2;
    static int lab3;
    static int lab4;
    static int lab5;
    static int lab6;
    static int lab7;
    static int lab8;
    static int lab9;

    static int totalunits;
    static int unit1;
    static int unit2;
    static int unit3;
    static int unit4;
    static int unit5;
    static int unit6;
    static int unit7;
    static int unit8;
    static int unit9;

    static String nosubject6;
    
    static int i;
    static int miscellaneous = 7500;
    static int quipper = 1500;
    static int type0 = 0;
    static int type1 = 1065;
    static int type2 = 1865;
    static int type6 = 2000;
    static int type7 = 2665;
    static int type8 = 355;
    
    static String subjectone;
    static String subjecttwo;
    static String subjectthree;
    static String subjectfour;
    static String subjectfive;
    static String subjectsix;
    static String subjectseven;
    static String subjecteight;
    static String subjectnine;

    
    public void display8() {
 
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    Scanner sb = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);
   
    System.out.println("Fourth year second semester");
        
        System.out.println("(1) = enroll subjects individually");
        System.out.println("(2) = full package enrollment");
        i = sd.nextInt();

        switch (i) {
        // individual subjects
        case 1:
        // 1st year 1st semester
        System.out.println("Enter your full name");
        name = sn.nextLine();
            
        System.out.println("-----------Available subjects-----------");
        System.out.println(" (1) EEL424 - 3 unit/s | 1 lab/s");
        System.out.println(" (2)TVET423 - 3 unit/s | 1 lab/s");
        System.out.println(" (3) SFT421 - 1 unit/s | 0 lab/s");
        System.out.println(" (4)  IT428 - 3 unit/s | 2 lab/s");
        System.out.println(" (5) CISCO4 - 3 unit/s | 1 lab/s"); 
        System.out.println("----------------------------------------");
        

        // ------------first subject------------             
        System.out.println("Enter 1st subject" );
        subjectone = sc.nextLine();

        
        if (subjectone.equals ("1") || subjectone.equals("2"))
        {    
        unit1 = 3;    
        lab1 = 1;
        payment1 = type2;

        }
        
        else if (subjectone.equals ("5")) 
        
        {    
        unit1 = 3;
        lab1 = 1;
        payment1 = type6;
        
        }
        
        else if (subjectone.equals ("4")) 
        
        {    
        unit1 = 3;
        lab1 = 2;
        payment1 = type7;
        
        }
        
        else if (subjectone.equals ("3")) 
        
        {    
        unit1 = 1;
        lab1 = 0;
        payment1 = type8;
        
        }
        
        else {
        System.out.println("invalid entry");
        break;
        }
        // ------------second subject------------ 
       
        System.out.println("Enter 2nd subject" );
        subjecttwo = sc.nextLine();
  
        if (subjecttwo.equals ("1") || subjecttwo.equals("2"))
        {    
        unit2 = 3;
        lab2 = 1;
        payment2 = type2;

        }
        
        else if (subjecttwo.equals ("5")) 
        
        {    
        unit2 = 3;    
        lab2 = 1;
        payment2 = type6;

        }
        
        else if (subjecttwo.equals ("4")) 
        
        {    
        unit2 = 3;    
        lab2 = 2;
        payment2 = type7;

        }
        
        else if (subjecttwo.equals ("3")) 
        
        {    
        unit2 = 1;    
        lab2 = 0;
        payment2 = type8;

        }
        
        else {
        System.out.println("invalid entry");
        break;
        }
        
        while (subjecttwo.equals (subjectone))
   
        
        {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 2nd subject");
        
        subjecttwo = sc.nextLine();
        
        if (!subjecttwo.equals (subjectone)) {
        } // tempo
        }

        
        if (subjecttwo.equals ("1") || subjecttwo.equals("2"))
        {    
        payment2 = type2;
        lab2 = 1;

        }
        
        else if (subjecttwo.equals ("5")) 
        
        {   
        unit2 = 3;
        lab2 = 1;
        payment2 = type6;
            
        }
        
        else if (subjecttwo.equals ("4")) 
        
        {   
        unit2 = 3;
        lab2 = 2;
        payment2 = type7;
            
        }
        
        else if (subjecttwo.equals ("3")) 
        
        {   
        unit2 = 1;
        lab2 = 0;
        payment2 = type8;
            
        }
        
        else {
        System.out.println("invalid entry");
        break;
        }
       
        // ------------third subject------------ 
        
        System.out.println("Enter 3rd subject" );
        subjectthree = sc.nextLine();
        
        if (subjectthree.equals ("1") || subjectthree.equals("2"))
        {   
        unit3 = 3;   
        lab3 = 1;
        payment3 = type2;

        }
        
        else if (subjectthree.equals ("5")) 
        
        { 
        unit3 = 3;
        lab3 = 1;
        payment3 = type6;

        }
        
        else if (subjectthree.equals ("4")) 
        
        { 
        unit3 = 3;
        lab3 = 2;
        payment3 = type7;

        }
        
        else if (subjectthree.equals ("3")) 
        
        { 
        unit3 = 1;
        lab3 = 0;
        payment3 = type8;

        }
        
        else {
        System.out.println("invalid entry");
        break;
        }
        
        while (subjectthree.equals (subjectone) ||
               subjectthree.equals (subjecttwo))
                {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 3rd subject");
        
        subjectthree = sc.nextLine();
        
        if (!subjectthree.equals (subjectone) ||
             !subjectthree.equals (subjecttwo))
        {
             
        } // tempo
        }
        
        if (subjectthree.equals ("1") || subjectthree.equals("2"))
        {    
        unit3 = 3;
        lab3 = 1;
        payment3 = type2;

        }
        
        else if (subjectthree.equals ("5")) 
        
        { 
        unit3 = 3;    
        lab3 = 1;
        payment3 = type6;
            
        }
        
        else if (subjectthree.equals ("4")) 
        
        { 
        unit3 = 3;    
        lab3 = 2;
        payment3 = type7;  
        }
        
        else if (subjectthree.equals ("3")) 
        
        { 
        unit3 = 1;    
        lab3 = 0;
        payment3 = type8;  
        }
        
        else {
        System.out.println("invalid entry");
        break;
        }
        
        // ------------fourth subject------------        

        System.out.println("Enter 4th subject" );
        subjectfour = sc.nextLine();
       
        if (subjectfour.equals ("1") || subjectfour.equals("2"))
        {   
        unit4 = 3;    
        lab4 = 1;
        payment4 = type2;

        }
        
        else if (subjectfour.equals ("5")) 
        
        { 
        unit4 = 3;
        lab4 = 1;
        payment4 = type6;

        }
        
        else if (subjectfour.equals ("4")) 
        
        { 
        unit4 = 3;
        lab4 = 2;
        payment4 = type7;

        }
        
        else if (subjectfour.equals ("3")) 
        
        { 
        unit4 = 1;
        lab4 = 0;
        payment4 = type8;

        }
        
        else {
        System.out.println("invalid entry");
        break;
        }  
        
        while (subjectfour.equals (subjectone) ||
               subjectfour.equals (subjecttwo) ||
               subjectfour.equals (subjectthree))
                {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 4th subject");
        
        subjectfour = sc.nextLine();
        
        if (!subjectfour.equals (subjectone) ||
            !subjectfour.equals (subjecttwo) ||
            !subjectfour.equals (subjectthree))
        {
             
        } // tempo
        }
        
        if (subjectfour.equals ("1") || subjectfour.equals("2"))
        {    
        unit4 = 3;
        lab4 = 1;
        payment4 = type2;

        }
        
        else if (subjectfour.equals ("5")) 
        
        { 
        unit4 = 3;    
        lab4 = 1;
        payment4 = type6;
            
        }    
        
        else if (subjectfour.equals ("4")) 
        
        { 
        unit4 = 3;    
        lab4 = 2;
        payment4 = type7;           
        }    
        
        else if (subjectfour.equals ("3")) 
        
        { 
        unit4 = 1;    
        lab4 = 0;
        payment4 = type8;           
        }    
        
        else {
        System.out.println("invalid entry");
        break;
        }
 
    
        // ------------calculation portion------------ 
                
        paymenttotal = payment1 + payment2 + payment3 + payment4;
        
        totalunits = unit1 + unit2 + unit3 + unit4;
        
        totallabs = lab1 + lab2 + lab3 + lab4;
        
        totalpayment = paymenttotal + miscellaneous + quipper;
        
        
        
        
        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        

        
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
       
        
        // ------------subject tagging and output------------      
        
        if (subjectone.equals ("1")) {
        subjectone = "EEL424"; }
        else if (subjectone.equals ("2")) {
        subjectone = "TVET423"; }      
        else if (subjectone.equals ("3")) {
        subjectone = "SFT421"; }         
        else if (subjectone.equals ("4")) {
        subjectone = "IT428"; }  
        else if (subjectone.equals ("5")) {
        subjectone = "CISCO4"; }       
        
        if (subjecttwo.equals ("1")) {
        subjecttwo = "EEL424"; }
        else if (subjecttwo.equals ("2")) {
        subjecttwo = "TVET423"; }      
        else if (subjecttwo.equals ("3")) {
        subjecttwo = "SFT421"; }         
        else if (subjecttwo.equals ("4")) {
        subjecttwo = "IT428"; }  
        else if (subjecttwo.equals ("5")) {
        subjecttwo = "CISCO4"; }  
        
        if (subjectthree.equals ("1")) {
        subjectthree = "EEL424"; }
        else if (subjectthree.equals ("2")) {
        subjectthree = "TVET423"; }      
        else if (subjectthree.equals ("3")) {
        subjectthree = "SFT421"; }         
        else if (subjectthree.equals ("4")) {
        subjectthree = "IT428"; }  
        else if (subjectthree.equals ("5")) {
        subjectthree = "CISCO4"; }  

        if (subjectfour.equals ("1")) {
        subjectfour = "EEL424"; }
        else if (subjectfour.equals ("2")) {
        subjectfour = "TVET423"; }      
        else if (subjectfour.equals ("3")) {
        subjectfour = "SFT421"; }         
        else if (subjectfour.equals ("4")) {
        subjectfour = "IT428"; }  
        else if (subjectfour.equals ("5")) {
        subjectfour = "CISCO4"; }  

              
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


          System.out.println("Subject1: " + subjectone);  
          System.out.println("Subject2: " + subjecttwo);  
          System.out.println("Subject3: " + subjectthree);  
          System.out.println("Subject4: " + subjectfour);   
        System.out.println("---------------------------------------------");         
        System.out.println("Tuition: " + paymenttotal);
        System.out.println("Quipper = 7500");
        System.out.println("Miscellaneous = 1500");
              
        System.out.println("Total units: " + totalunits);
        System.out.println("Total lab units: " + totallabs);  
        System.out.println("---------------------------------------------"); 
        System.out.println("Total: " + totalpayment);
        System.out.println("Downpayment: " + downpayment);
        System.out.println("Balance: " + balancepayment);
        System.out.println("Prelim payment: " + perexampayment);
        System.out.println("Midterm payment: " + perexampayment);
        System.out.println("Finals payment: " + perexampayment);         

        
        break; 
        //full package enrollment
        case 2:
            
        paymenttotal = 8750;    
        totalpayment = 17750;

        
        System.out.println("Enter your full name");
        name = sn.nextLine();

        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
        
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


    System.out.println("Subject1: SS415");
    System.out.println("Subject2: IT415");
    System.out.println("Subject3: IT417");
    System.out.println("Subject4: IT418");
    System.out.println("Subject5: CISCO3");

        System.out.println("---------------------------------------------");         
        System.out.println("Tuition: " + paymenttotal);
        System.out.println("Quipper = 7500");
        System.out.println("Miscellaneous = 1500");
        System.out.println("Total units: 13");
        System.out.println("Total lab units: 5");  
        System.out.println("---------------------------------------------"); 
        System.out.println("Total: " + totalpayment);
        System.out.println("Downpayment: " + downpayment);
        System.out.println("Balance: " + balancepayment);
        System.out.println("Prelim payment: " + perexampayment);
        System.out.println("Midterm payment: " + perexampayment);
        System.out.println("Finals payment: " + perexampayment);  
        
        break;
        }
      
}

}



        


      

    




    

    

    



      


        
        
    
        
    
    
    


