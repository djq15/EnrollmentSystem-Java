//third year second semester 
package enrollmentsystem;
import java.util.Scanner;

public class y3s2 {
    
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
    
    static int g;
    static int miscellaneous = 7500;
    static int quipper = 1500;
    static int type0 = 0;
    static int type1 = 1065;
    static int type2 = 1865;
    static int type6 = 2000;
  
    static String subjectone;
    static String subjecttwo;
    static String subjectthree;
    static String subjectfour;
    static String subjectfive;
    static String subjectsix;
    static String subjectseven;
    static String subjecteight;
    static String subjectnine;

    
    public void display6() {
 
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    Scanner sb = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);
   
    System.out.println("Third year second semester");
        
        System.out.println("(1) = enroll subjects individually");
        System.out.println("(2) = full package enrollment");
        g = sd.nextInt();

        switch (g) {
        // individual subjects
        case 1:
        // 1st year 1st semester
        System.out.println("Enter your full name");
        name = sn.nextLine();
            
        System.out.println("-----------Available subjects-----------");
        System.out.println(" (1)  IT323 - 3 unit/s | 1 lab/s");
        System.out.println(" (2)  IT324 - 3 unit/s | 1 lab/s");
        System.out.println(" (3)  IT322 - 3 unit/s | 1 lab/s");
        System.out.println(" (4) TEC311 - 3 unit/s | 1 lab/s");
        System.out.println(" (5) CISCO2 - 3 unit/s | 1 lab/s");
        System.out.println(" (6)  SS325 - 3 unit/s | 0 lab/s");
        System.out.println(" (7) EEL322 - 3 unit/s | 1 lab/s");    
        System.out.println("----------------------------------------");
        

        // ------------first subject------------             
        System.out.println("Enter 1st subject" );
        subjectone = sc.nextLine();
        if (subjectone.equals ("6"))
        { 
            
                
        unit1 = 3;
        lab1 = 0;
        payment1 = type1;

        
        }
        
        else if (subjectone.equals ("1") || subjectone.equals("2") ||
                 subjectone.equals ("3")|| subjectone.equals("4") ||
                 subjectone.equals("7"))
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
        else {
        System.out.println("invalid entry");
        break;
        }
        // ------------second subject------------ 
       
        System.out.println("Enter 2nd subject" );
        subjecttwo = sc.nextLine();
        if (subjecttwo.equals ("6"))
        { 
            
                
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
                 subjecttwo.equals ("3") || subjecttwo.equals("4") ||
                 subjecttwo.equals("7"))
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
        if (subjecttwo.equals ("6"))
        { 
            
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
                 subjecttwo.equals ("3") || subjecttwo.equals("4") ||
                 subjecttwo.equals("7"))
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
        else {
        System.out.println("invalid entry");
        break;
        }
       
        // ------------third subject------------ 
        
        System.out.println("Enter 3rd subject" );
        subjectthree = sc.nextLine();
        if (subjectthree.equals ("6"))
        { 
            
                
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("1") || subjectthree.equals("2") ||
                 subjectthree.equals ("3") || subjectthree.equals("4") ||
                 subjectthree.equals("7"))
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
        if (subjectthree.equals ("6"))
        { 
          
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("1") || subjectthree.equals("2") ||
                 subjectthree.equals ("3") || subjectthree.equals("4") ||
                 subjectthree.equals("7"))
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
        else {
        System.out.println("invalid entry");
        break;
        }
        
        // ------------fourth subject------------        

        System.out.println("Enter 4th subject" );
        subjectfour = sc.nextLine();
        if (subjectfour.equals ("6"))
        { 
            
                
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("1") || subjectfour.equals("2") ||
                 subjectfour.equals ("3") || subjectfour.equals("4") ||
                 subjectfour.equals("7"))
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
        if (subjectfour.equals ("6"))
        { 
          
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("1") || subjectfour.equals("2") ||
                 subjectfour.equals ("3") || subjectfour.equals("4") ||
                 subjectfour.equals("7"))
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
        else {
        System.out.println("invalid entry");
        break;
        }
        
        // ------------fifth subject------------       
        
        System.out.println("Enter 5th subject" );
        System.out.println("(N/n) = no subject to enroll");
        subjectfive = sc.nextLine();
        if (subjectfive.equals ("6"))
        { 
            
                
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("1") || subjectfive.equals("2") ||
                 subjectfive.equals ("3") || subjectfive.equals("4") ||
                 subjectfive.equals("7"))
        {   
        unit5 = 3;    
        lab5 = 1;
        payment5 = type2;

        }
        
        else if (subjectfive.equals ("5")) 
        
        { 
        unit5 = 3;
        lab5 = 1;
        payment5 = type6;

        }
        else if (subjectfive.equals ("n") || subjectfive.equals ("N")) 
        {
        unit5 = 0;
        lab5 = 0;
        payment5 = 0;

        }    
        
        else {
        System.out.println("invalid entry");
        break;
        }    
        
        while (subjectfive.equals (subjectone) ||
               subjectfive.equals (subjecttwo) ||
               subjectfive.equals (subjectthree) ||
               subjectfive.equals (subjectfour))
                {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 5th subject");
        System.out.println("(N/n) = no subject to enroll");
        
        subjectfive = sc.nextLine();
        
        
        if (!subjectfive.equals (subjectone) ||
            !subjectfive.equals (subjecttwo) ||
            !subjectfive.equals (subjectthree) ||
            !subjectfive.equals (subjectfour))
        {
             
        } // tempo
        }
        if (subjectfive.equals ("6"))
        { 
          
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("1") || subjectfive.equals("2") ||
                 subjectfive.equals ("3") || subjectfive.equals("4") ||
                 subjectfive.equals("7"))
        {    
        unit5 = 3;
        lab5 = 1;
        payment5 = type2;

        }
        
        else if (subjectfive.equals ("5")) 
        
        { 
        unit5 = 3;    
        lab5 = 1;
        payment5 = type6;
            
        }         
        else if (subjectfive.equals ("n") || subjectfive.equals ("N")) 
        {    
        unit5 = 0;
        lab5 = 0;
        payment5 = 0;

        }
        
        else {
        System.out.println("invalid entry");
        break;
        }        

        // ------------sixth subject------------    
    
        System.out.println("Enter 6th subject" );
        System.out.println("(N/n) = no subject to enroll");
        subjectsix = sc.nextLine();
        if (subjectsix.equals ("n") || subjectsix.equals ("N")){
        subjectsix = "no6"; 
        payment6 = type0;}
        else if (subjectsix.equals ("6"))
        { 
        

                
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("1") || subjectsix.equals("2") ||
                 subjectsix.equals ("3") || subjectsix.equals("4") ||
                 subjectsix.equals("7"))
        {   
        unit6 = 3;    
        lab6 = 1;
        payment6 = type2;

        }
        
        else if (subjectsix.equals ("5")) 
        
        { 
        unit6 = 3;
        lab6 = 1;
        payment6 = type6;

        }
       
        else {
        System.out.println("invalid entry");
                
        break;
        }    
        
        while (subjectsix.equals (subjectone) ||
               subjectsix.equals (subjecttwo) ||
               subjectsix.equals (subjectthree) ||
               subjectsix.equals (subjectfour) ||
               subjectsix.equals (subjectfive))
                {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 6th subject");
        System.out.println("(N/n) = no subject to enroll");
        
        subjectsix = sc.nextLine();
        if (subjectsix.equals ("n") || subjectsix.equals ("N")){
        subjectsix = "no6";}

        else if (!subjectsix.equals (subjectone) ||
            !subjectsix.equals (subjecttwo) ||
            !subjectsix.equals (subjectthree) ||
            !subjectsix.equals (subjectfour) ||
            !subjectsix.equals (subjectfive))
            {}
                 
        } // tempo
        
        if (subjectsix.equals ("6"))
        { 
          
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("1") || subjectsix.equals("2") ||
                 subjectsix.equals ("3") || subjectsix.equals("4") ||
                 subjectsix.equals("7"))
        {    
        unit6 = 3;
        lab6 = 1;
        payment6 = type2;

        }
        
        else if (subjectsix.equals ("5")) 
        
        { 
        unit6 = 3;    
        lab6 = 1;
        payment6 = type6;
            
        }         
        else if (subjectsix.equals ("n") || subjectsix.equals ("N") ||
                subjectsix.equals ("no6"))
        {    
        unit6 = 0;
        lab6 = 0;
        payment6 = 0;

        }
            
        else {
        System.out.println("invalid entry");
        break;
        }       

        
        // ------------calculation portion------------ 
                
        paymenttotal = payment1 + payment2 + payment3 + payment4 + payment5 +
                payment6;
        
        totalunits = unit1 + unit2 + unit3 + unit4 + unit5 + unit6;
        
        totallabs = lab1 + lab2 + lab3 + lab4 + lab5 + lab6;
        
        totalpayment = paymenttotal + miscellaneous + quipper;
        
        
        
        
        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        

        
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
       
        
        // ------------subject tagging and output------------      
        
        if (subjectone.equals ("1")) {
        subjectone = "IT323"; }
        else if (subjectone.equals ("2")) {
        subjectone = "IT324"; }      
        else if (subjectone.equals ("3")) {
        subjectone = "IT322"; }         
        else if (subjectone.equals ("4")) {
        subjectone = "TEC311"; }  
        else if (subjectone.equals ("5")) {
        subjectone = "CISCO2"; }  
        else if (subjectone.equals ("6")) {
        subjectone = "SS325"; } 
        else if (subjectone.equals ("7")) {
        subjectone = "EEL322"; }       
        
        if (subjecttwo.equals ("1")) {
        subjecttwo = "IT323"; }
        else if (subjecttwo.equals ("2")) {
        subjecttwo = "IT324"; }      
        else if (subjecttwo.equals ("3")) {
        subjecttwo = "IT322"; }         
        else if (subjecttwo.equals ("4")) {
        subjecttwo = "TEC311"; }  
        else if (subjecttwo.equals ("5")) {
        subjecttwo = "CISCO2"; }  
        else if (subjecttwo.equals ("6")) {
        subjecttwo = "SS325"; }  
        else if (subjecttwo.equals ("7")) {
        subjecttwo = "EEL322"; }  
        
        if (subjectthree.equals ("1")) {
        subjectthree = "IT323"; }
        else if (subjectthree.equals ("2")) {
        subjectthree = "IT324"; }      
        else if (subjectthree.equals ("3")) {
        subjectthree = "IT322"; }         
        else if (subjectthree.equals ("4")) {
        subjectthree = "TEC311"; }  
        else if (subjectthree.equals ("5")) {
        subjectthree = "CISCO2"; }  
        else if (subjectthree.equals ("6")) {
        subjectthree = "SS325"; }  
        else if (subjectthree.equals ("7")) {
        subjectthree = "EEL322"; }  

        if (subjectfour.equals ("1")) {
        subjectfour = "IT323"; }
        else if (subjectfour.equals ("2")) {
        subjectfour = "IT324"; }      
        else if (subjectfour.equals ("3")) {
        subjectfour = "IT322"; }         
        else if (subjectfour.equals ("4")) {
        subjectfour = "TEC311"; }  
        else if (subjectfour.equals ("5")) {
        subjectfour = "CISCO2"; }  
        else if (subjectfour.equals ("6")) {
        subjectfour = "SS325"; }  
        else if (subjectfour.equals ("7")) {
        subjectfour = "EEL322"; }  

        if (subjectfive.equals ("1")) {
        subjectfive = "IT323"; }
        else if (subjectfive.equals ("2")) {
        subjectfive = "IT324"; }      
        else if (subjectfive.equals ("3")) {
        subjectfive = "IT322"; }         
        else if (subjectfive.equals ("4")) {
        subjectfive = "TEC311"; }  
        else if (subjectfive.equals ("5")) {
        subjectfive = "CISCO2"; }  
        else if (subjectfive.equals ("6")) {
        subjectfive = "SS325"; }  
        else if (subjectfive.equals ("7")) {
        subjectfive = "EEL322"; }   
        else if (subjectfive.equals ("n")|| subjectfive.equals ("N")){
        subjectfive = "- - -"; } 

        if (subjectsix.equals ("1")) {
        subjectsix = "IT323"; }
        else if (subjectsix.equals ("2")) {
        subjectsix = "IT324"; }      
        else if (subjectsix.equals ("3")) {
        subjectsix = "IT322"; }         
        else if (subjectsix.equals ("4")) {
        subjectsix = "TEC311"; }  
        else if (subjectsix.equals ("5")) {
        subjectsix = "CISCO2"; }  
        else if (subjectsix.equals ("6")) {
        subjectsix = "SS325"; }  
        else if (subjectsix.equals ("7")) {
        subjectsix = "EEL322"; }   
        else if (subjectsix.equals ("no6")) {
        subjectsix = "- - -"; } 
              
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


          System.out.println("Subject1: " + subjectone);  
          System.out.println("Subject2: " + subjecttwo);  
          System.out.println("Subject3: " + subjectthree);  
          System.out.println("Subject4: " + subjectfour);  
          System.out.println("Subject5: " + subjectfive);  
          System.out.println("Subject6: " + subjectsix);  
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
            
        paymenttotal = 12390;    
        totalpayment = 21390;

        
        System.out.println("Enter your full name");
        name = sn.nextLine();

        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
        
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


    System.out.println("Subject1: IT323");
    System.out.println("Subject2: IT324");
    System.out.println("Subject3: IT322");
    System.out.println("Subject4: TEC311");
    System.out.println("Subject5: CISCO2");
    System.out.println("Subject6: SS325");
    System.out.println("Subject7: EEL322");

        System.out.println("---------------------------------------------");         
        System.out.println("Tuition: " + paymenttotal);
        System.out.println("Quipper = 7500");
        System.out.println("Miscellaneous = 1500");
        System.out.println("Total units: 21");
        System.out.println("Total lab units: 6");  
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



        


      

    




    

    

    



      


        
        
    
        
    
    
    


