//third year first semester 
package enrollmentsystem;
import java.util.Scanner;

public class y3s1 {
    
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
    
    static int f;
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

    
    public void display5() {
 
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    Scanner sb = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);
   
    System.out.println("Third year first semester");
        
        System.out.println("(1) = enroll subjects individually");
        System.out.println("(2) = full package enrollment");
        f = sd.nextInt();

        switch (f) {
        // individual subjects
        case 1:
        // 1st year 1st semester
        System.out.println("Enter your full name");
        name = sn.nextLine();
            
        System.out.println("-----------Available subjects-----------");
        System.out.println(" (1)  IT317 - 3 unit/s | 1 lab/s");
        System.out.println(" (2)  IT318 - 3 unit/s | 1 lab/s");
        System.out.println(" (3) EEL311 - 3 unit/s | 1 lab/s");
        System.out.println(" (4) CISCO1 - 3 unit/s | 1 lab/s");
        System.out.println(" (5) RIZ311 - 3 unit/s | 0 lab/s");
        System.out.println(" (6)  SS313 - 3 unit/s | 0 lab/s");
        System.out.println(" (7) HUM314 - 3 unit/s | 0 lab/s");
        System.out.println(" (8) MAT314 - 3 unit/s | 0 lab/s");      
        System.out.println("----------------------------------------");
        

        // ------------first subject------------             
        System.out.println("Enter 1st subject" );
        subjectone = sc.nextLine();
        if (subjectone.equals ("5") || subjectone.equals("6") ||
            subjectone.equals("7") || subjectone.equals("8"))
        { 
            
                
        unit1 = 3;
        lab1 = 0;
        payment1 = type1;

        
        }
        
        else if (subjectone.equals ("1") || subjectone.equals("2") ||
                 subjectone.equals ("3"))
        
        {    
        unit1 = 3;    
        lab1 = 1;
        payment1 = type2;

        }
        
        else if (subjectone.equals ("4")) 
        
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
        if (subjecttwo.equals ("5") || subjecttwo.equals("6") ||
            subjecttwo.equals("7") || subjecttwo.equals("8"))
        { 
            
                
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
                 subjecttwo.equals ("3"))
        
        {    
        unit2 = 3;
        lab2 = 1;
        payment2 = type2;

        }
        
        else if (subjecttwo.equals ("4")) 
        
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
        if (subjecttwo.equals ("5") || subjecttwo.equals("6") ||
            subjecttwo.equals("7") || subjecttwo.equals("8"))
        { 
            
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
                 subjecttwo.equals ("3"))
        
        {    
        payment2 = type2;
        lab2 = 1;

        }
        
        else if (subjecttwo.equals ("4")) 
        
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
        if (subjectthree.equals ("5") || subjectthree.equals("6") ||
            subjectthree.equals("7") || subjectthree.equals("8"))
        { 
            
                
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("1") || subjectthree.equals("2") ||
                 subjectthree.equals ("3"))
        
        {   
        unit3 = 3;   
        lab3 = 1;
        payment3 = type2;

        }
        
        else if (subjectthree.equals ("4")) 
        
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
        if (subjectthree.equals ("5") || subjectthree.equals("6") ||
            subjectthree.equals("7") || subjectthree.equals("8"))
        { 
          
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("1") || subjectthree.equals("2") ||
                 subjectthree.equals ("3"))
        
        {    
        unit3 = 3;
        lab3 = 1;
        payment3 = type2;

        }
        
        else if (subjectthree.equals ("4")) 
        
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
        if (subjectfour.equals ("5") || subjectfour.equals("6") ||
            subjectfour.equals("7") || subjectfour.equals("8"))
        { 
            
                
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("1") || subjectfour.equals("2") ||
                 subjectfour.equals ("3"))
        
        {   
        unit4 = 3;    
        lab4 = 1;
        payment4 = type2;

        }
        
        else if (subjectfour.equals ("4")) 
        
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
        if (subjectfour.equals ("5") || subjectfour.equals("6") ||
            subjectfour.equals("7") || subjectfour.equals("8"))
        { 
          
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("1") || subjectfour.equals("2") ||
                 subjectfour.equals ("3"))
        
        {    
        unit4 = 3;
        lab4 = 1;
        payment4 = type2;

        }
        
        else if (subjectfour.equals ("4")) 
        
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
        if (subjectfive.equals ("5") || subjectfive.equals("6") ||
            subjectfive.equals("7") || subjectfive.equals("8"))
        { 
            
                
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("1") || subjectfive.equals("2") ||
                 subjectfive.equals ("3"))
        
        {   
        unit5 = 3;    
        lab5 = 1;
        payment5 = type2;

        }
        
        else if (subjectfive.equals ("4")) 
        
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
        if (subjectfive.equals ("5") || subjectfive.equals("6") ||
            subjectfive.equals("7") || subjectfive.equals("8"))
        { 
          
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("1") || subjectfive.equals("2") ||
                 subjectfive.equals ("3"))
        
        {    
        unit5 = 3;
        lab5 = 1;
        payment5 = type2;

        }
        
        else if (subjectfive.equals ("4")) 
        
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
        else if (subjectsix.equals ("5") || subjectsix.equals("6") ||
                 subjectsix.equals("7") || subjectsix.equals("8"))
        { 
        

                
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("1") || subjectsix.equals("2") ||
                 subjectsix.equals ("3"))
        
        {   
        unit6 = 3;    
        lab6 = 1;
        payment6 = type2;

        }
        
        else if (subjectsix.equals ("4")) 
        
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
        
        if (subjectsix.equals ("5") || subjectsix.equals("6") ||
            subjectsix.equals("7") || subjectsix.equals("8"))
        { 
          
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("1") || subjectsix.equals("2") ||
                 subjectsix.equals ("3"))
        
        {    
        unit6 = 3;
        lab6 = 1;
        payment6 = type2;

        }
        
        else if (subjectsix.equals ("4")) 
        
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

        // ------------seventh subject------------           

        System.out.println("Enter 7th subject" );
        System.out.println("(N/n) = no subject to enroll");
        subjectseven = sc.nextLine();
        if (subjectseven.equals ("n") || subjectseven.equals ("N")){
        subjectseven = "no7"; 
        payment7 = type0;}
        else if (subjectseven.equals ("5") || subjectseven.equals("6") ||
                 subjectseven.equals("7") || subjectseven.equals("8"))
        { 
            
                
        unit7 = 3;
        lab7 = 0;
        payment7 = type1;
        
        }
        
        else if (subjectseven.equals ("1") || subjectseven.equals("2") ||
                 subjectseven.equals ("3"))
        
        {   
        unit7 = 3;    
        lab7 = 1;
        payment7 = type2;

        }
        
        else if (subjectseven.equals ("4")) 
        
        { 
        unit7 = 3;
        lab7 = 1;
        payment7 = type6;

        }     
        
        else {
        System.out.println("invalid entry");
        break;
        }    
        
        while (subjectseven.equals (subjectone) ||
               subjectseven.equals (subjecttwo) ||
               subjectseven.equals (subjectthree) ||
               subjectseven.equals (subjectfour) ||
               subjectseven.equals (subjectfive) ||
               subjectseven.equals (subjectsix))
                {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 7th subject");
        System.out.println("(N/n) = no subject to enroll");
        
        subjectseven = sc.nextLine();
        if (subjectseven.equals ("n") || subjectseven.equals ("N")){
        subjectseven = "no7";}        
        
        else if (!subjectseven.equals (subjectone) ||
            !subjectseven.equals (subjecttwo) ||
            !subjectseven.equals (subjectthree) ||
            !subjectseven.equals (subjectfour) ||
            !subjectseven.equals (subjectfive) ||
            !subjectseven.equals (subjectsix))
        {
             
        } // tempo
        }
        if (subjectseven.equals ("5") || subjectseven.equals("6") ||
            subjectseven.equals("7") || subjectseven.equals("8"))
        { 
          
        unit7 = 3;
        lab7 = 0;
        payment7 = type1;
        
        }
        
        else if (subjectseven.equals ("1") || subjectseven.equals("2") ||
                 subjectseven.equals ("3"))
        
        {    
        unit7 = 3;
        lab7 = 1;
        payment7 = type2;

        }
        
        else if (subjectseven.equals ("4")) 
        
        { 
        unit7 = 3;    
        lab7 = 1;
        payment7 = type6;
            
        }         
        else if (subjectseven.equals ("n") || subjectseven.equals ("N") ||
                subjectseven.equals ("no7"))
        {    
        unit7 = 0;
        lab7 = 0;
        payment7 = 0;

        }
        
        else {
        System.out.println("invalid entry");
        break;
        }         
 
 
 
        
        
        // ------------calculation portion------------ 
                
        paymenttotal = payment1 + payment2 + payment3 + payment4 + payment5 +
                payment6 + payment7;
        
        totalunits = unit1 + unit2 + unit3 + unit4 + unit5 + unit6 + unit7;
        
        totallabs = lab1 + lab2 + lab3 + lab4 + lab5 + lab6 + lab7;
        
        totalpayment = paymenttotal + miscellaneous + quipper;
        
        
        
        
        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        

        
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
       
        
        // ------------subject tagging and output------------      
        
        if (subjectone.equals ("1")) {
        subjectone = "IT317"; }
        else if (subjectone.equals ("2")) {
        subjectone = "IT318"; }      
        else if (subjectone.equals ("3")) {
        subjectone = "EEL311"; }         
        else if (subjectone.equals ("4")) {
        subjectone = "CISCO1"; }  
        else if (subjectone.equals ("5")) {
        subjectone = "RIZ311"; }  
        else if (subjectone.equals ("6")) {
        subjectone = "SS313"; } 
        else if (subjectone.equals ("7")) {
        subjectone = "HUM314"; }  
        else if (subjectone.equals ("8")) {
        subjectone = "MAT314"; }        
        
        if (subjecttwo.equals ("1")) {
        subjecttwo = "IT317"; }
        else if (subjecttwo.equals ("2")) {
        subjecttwo = "IT318"; }      
        else if (subjecttwo.equals ("3")) {
        subjecttwo = "EEL311"; }         
        else if (subjecttwo.equals ("4")) {
        subjecttwo = "CISCO1"; }  
        else if (subjecttwo.equals ("5")) {
        subjecttwo = "RIZ311"; }  
        else if (subjecttwo.equals ("6")) {
        subjecttwo = "SS313"; }  
        else if (subjecttwo.equals ("7")) {
        subjecttwo = "HUM314"; }  
        else if (subjecttwo.equals ("8")) {
        subjecttwo = "MAT314"; }  
        
        if (subjectthree.equals ("1")) {
        subjectthree = "IT317"; }
        else if (subjectthree.equals ("2")) {
        subjectthree = "IT318"; }      
        else if (subjectthree.equals ("3")) {
        subjectthree = "EEL311"; }         
        else if (subjectthree.equals ("4")) {
        subjectthree = "CISCO1"; }  
        else if (subjectthree.equals ("5")) {
        subjectthree = "RIZ311"; }  
        else if (subjectthree.equals ("6")) {
        subjectthree = "SS313"; }  
        else if (subjectthree.equals ("7")) {
        subjectthree = "HUM314"; }  
        else if (subjectthree.equals ("8")) {
        subjectthree = "MAT314"; }  

        if (subjectfour.equals ("1")) {
        subjectfour = "IT317"; }
        else if (subjectfour.equals ("2")) {
        subjectfour = "IT318"; }      
        else if (subjectfour.equals ("3")) {
        subjectfour = "EEL311"; }         
        else if (subjectfour.equals ("4")) {
        subjectfour = "CISCO1"; }  
        else if (subjectfour.equals ("5")) {
        subjectfour = "RIZ311"; }  
        else if (subjectfour.equals ("6")) {
        subjectfour = "SS313"; }  
        else if (subjectfour.equals ("7")) {
        subjectfour = "HUM314"; }  
        else if (subjectfour.equals ("8")) {
        subjectfour = "MAT314"; }   

        if (subjectfive.equals ("1")) {
        subjectfive = "IT317"; }
        else if (subjectfive.equals ("2")) {
        subjectfive = "IT318"; }      
        else if (subjectfive.equals ("3")) {
        subjectfive = "EEL311"; }         
        else if (subjectfive.equals ("4")) {
        subjectfive = "CISCO1"; }  
        else if (subjectfive.equals ("5")) {
        subjectfive = "RIZ311"; }  
        else if (subjectfive.equals ("6")) {
        subjectfive = "SS313"; }  
        else if (subjectfive.equals ("7")) {
        subjectfive = "HUM314"; }  
        else if (subjectfive.equals ("8")) {
        subjectfive = "MAT314"; }   
        else if (subjectfive.equals ("n")|| subjectfive.equals ("N")){
        subjectfive = "- - -"; } 

        if (subjectsix.equals ("1")) {
        subjectsix = "IT317"; }
        else if (subjectsix.equals ("2")) {
        subjectsix = "IT318"; }      
        else if (subjectsix.equals ("3")) {
        subjectsix = "EEL311"; }         
        else if (subjectsix.equals ("4")) {
        subjectsix = "CISCO1"; }  
        else if (subjectsix.equals ("5")) {
        subjectsix = "RIZ311"; }  
        else if (subjectsix.equals ("6")) {
        subjectsix = "SS313"; }  
        else if (subjectsix.equals ("7")) {
        subjectsix = "HUM314"; }  
        else if (subjectsix.equals ("8")) {
        subjectsix = "MAT314"; }   
        else if (subjectsix.equals ("no6")) {
        subjectsix = "- - -"; } 

        if (subjectseven.equals ("1")) {
        subjectseven = "IT317"; }
        else if (subjectseven.equals ("2")) {
        subjectseven = "IT318"; }      
        else if (subjectseven.equals ("3")) {
        subjectseven = "EEL311"; }         
        else if (subjectseven.equals ("4")) {
        subjectseven = "CISCO1"; }  
        else if (subjectseven.equals ("5")) {
        subjectseven = "RIZ311"; }  
        else if (subjectseven.equals ("6")) {
        subjectseven = "SS313"; }  
        else if (subjectseven.equals ("7")) {
        subjectseven = "HUM314"; }  
        else if (subjectseven.equals ("8")) {
        subjectseven = "MAT314"; }   
        else if (subjectseven.equals ("no7")) {
        subjectseven = "- - -"; }         

        
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


          System.out.println("Subject1: " + subjectone);  
          System.out.println("Subject2: " + subjecttwo);  
          System.out.println("Subject3: " + subjectthree);  
          System.out.println("Subject4: " + subjectfour);  
          System.out.println("Subject5: " + subjectfive);  
          System.out.println("Subject6: " + subjectsix);  
          System.out.println("Subject7: " + subjectseven); 
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
            
        paymenttotal = 11855;    
        totalpayment = 20855;

        
        System.out.println("Enter your full name");
        name = sn.nextLine();

        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
        
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


    System.out.println("Subject1: IT317");
    System.out.println("Subject2: IT318");
    System.out.println("Subject3: EEL311");
    System.out.println("Subject4: CISCO1");
    System.out.println("Subject5: RIZ311");
    System.out.println("Subject6: SS313");
    System.out.println("Subject7: HUM314");
    System.out.println("Subject8: MAT314");

        System.out.println("---------------------------------------------");         
        System.out.println("Tuition: " + paymenttotal);
        System.out.println("Quipper = 7500");
        System.out.println("Miscellaneous = 1500");
        System.out.println("Total units: 24");
        System.out.println("Total lab units: 4");  
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



        


      

    




    

    

    



      


        
        
    
        
    
    
    


