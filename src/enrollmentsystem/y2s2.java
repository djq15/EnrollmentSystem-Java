//second year second semester 
package enrollmentsystem;
import java.util.Scanner;

public class y2s2 {
    
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
    
    static int e;
    static int miscellaneous = 7500;
    static int quipper = 1500;
    static int type0 = 0;
    static int type1 = 1065;
    static int type2 = 1865;
    static int type3 = 710;
    static int type5 = 3020;
  
    static String subjectone;
    static String subjecttwo;
    static String subjectthree;
    static String subjectfour;
    static String subjectfive;
    static String subjectsix;
    static String subjectseven;
    static String subjecteight;
    static String subjectnine;

    
    public void display4() {
 
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    Scanner sb = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);
   
    System.out.println("Second year second semester");
        
        System.out.println("(1) = enroll subjects individually");
        System.out.println("(2) = full package enrollment");
        e = sd.nextInt();

        switch (e) {
        // individual subjects
        case 1:
        // 1st year 1st semester
        System.out.println("Enter your full name");
        name = sn.nextLine();
            
        System.out.println("-----------Available subjects-----------");
        System.out.println(" (1)  IT225 - 3 unit/s | 1 lab/s");
        System.out.println(" (2)  IT226 - 3 unit/s | 1 lab/s");
        System.out.println(" (3)  IT227 - 3 unit/s | 1 lab/s");
        System.out.println(" (4) LDS121 - 4 unit/s | 2 lab/s");
        System.out.println(" (5) FEL221 - 3 unit/s | 1 lab/s");
        System.out.println(" (6) MAT223 - 3 unit/s | 0 lab/s");
        System.out.println(" (7)  NS222 - 3 unit/s | 1 lab/s");
        System.out.println(" (8)  SS223 - 3 unit/s | 0 lab/s");
        System.out.println(" (9)  PE224 - 2 unit/s | 0 lab/s");       
        System.out.println("----------------------------------------");
        


        // ------------first subject------------             
        System.out.println("Enter 1st subject" );
        subjectone = sc.nextLine();
        if (subjectone.equals ("6") || subjectone.equals("8"))
        { 
            
                
        unit1 = 3;
        lab1 = 0;
        payment1 = type1;

        
        }
        
        else if (subjectone.equals ("1") || subjectone.equals("2") ||
                 subjectone.equals ("3") || subjectone.equals("5") ||
                 subjectone.equals("7"))
        {    
        unit1 = 3;    
        lab1 = 1;
        payment1 = type2;

        }
        
        else if (subjectone.equals ("9")) 
        
        {    
        unit1 = 2;
        lab1 = 0;
        payment1 = type3;
        
        }

        else if (subjectone.equals ("4")) 
        
        {    
        unit1 = 4;
        lab1 = 2;
        payment1 = type5;
        
        }        
        
        else {
        System.out.println("invalid entry");
        break;
        }
        // ------------second subject------------ 
       
        System.out.println("Enter 2nd subject" );
        subjecttwo = sc.nextLine();
        if (subjecttwo.equals ("6") || subjecttwo.equals("8"))
        { 
            
                
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
                 subjecttwo.equals ("3") || subjecttwo.equals("5") ||
                 subjecttwo.equals ("7"))
        {    
        unit2 = 3;
        lab2 = 1;
        payment2 = type2;

        }
        
        else if (subjecttwo.equals ("9")) 
        
        {    
        unit2 = 2;    
        lab2 = 0;
        payment2 = type3;

        }
        
        else if (subjecttwo.equals ("4")) 
        
        {    
        unit2 = 4;
        lab2 = 2;
        payment2 = type5;
        
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
        if (subjecttwo.equals ("6") || subjecttwo.equals("8"))
        { 
            
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
                 subjecttwo.equals ("3") || subjecttwo.equals("5") ||
                 subjecttwo.equals("7"))
        {    
        payment2 = type2;
        lab2 = 1;

        }
        
        else if (subjecttwo.equals ("9")) 
        
        {   
        unit2 = 2;
        lab2 = 0;
        payment2 = type3;
            
        }
        
        else if (subjecttwo.equals ("4")) 
        
        {    
        unit2 = 4;
        lab2 = 2;
        payment2 = type5;
        
        }  
         
        else {
        System.out.println("invalid entry");
        break;
        }
       
        // ------------third subject------------ 
        
        System.out.println("Enter 3rd subject" );
        subjectthree = sc.nextLine();
        if (subjectthree.equals ("6") || subjectthree.equals("8"))
        {           
                
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("1") || subjectthree.equals("2") ||
                 subjectthree.equals ("3") || subjectthree.equals("5") ||
                 subjectthree.equals("7"))
        {   
        unit3 = 3;   
        lab3 = 1;
        payment3 = type2;

        }
        
        else if (subjectthree.equals ("9")) 
        
        { 
        unit3 = 2;
        lab3 = 0;
        payment3 = type3;

        }
        
        else if (subjectthree.equals ("4")) 
        
        {    
        unit3 = 4;
        lab3 = 2;
        payment3 = type5;
        
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
        if (subjectthree.equals ("6") || subjectthree.equals("8"))
        { 
          
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("1") || subjectthree.equals("2") ||
                 subjectthree.equals ("3") || subjectthree.equals("5") ||
                 subjectthree.equals("7"))
        {    
        unit3 = 3;
        lab3 = 1;
        payment3 = type2;

        }
        
        else if (subjectthree.equals ("9")) 
        
        { 
        unit3 = 2;    
        lab3 = 0;
        payment3 = type3;
        
        }
        
        else if (subjectthree.equals ("4")) 
        
        {    
        unit3 = 4;
        lab3 = 2;
        payment3 = type5;
        
        }  
        
        else {
        System.out.println("invalid entry");
        break;
        }
        
        // ------------fourth subject------------        

        System.out.println("Enter 4th subject" );
        subjectfour = sc.nextLine();
        if (subjectfour.equals ("6") || subjectfour.equals("8"))
        { 
            
                
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("1") || subjectfour.equals("2") ||
                 subjectfour.equals ("3") || subjectfour.equals("5") ||
                 subjectfour.equals("7"))
        {   
        unit4 = 3;    
        lab4 = 1;
        payment4 = type2;

        }
        
        else if (subjectfour.equals ("9")) 
        
        { 
        unit4 = 2;
        lab4 = 0;
        payment4 = type3;

        }
        
        else if (subjectfour.equals ("4")) 
        
        {    
        unit4 = 4;
        lab4 = 2;
        payment4 = type5;
        
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
        if (subjectfour.equals ("6") || subjectfour.equals("8"))
        { 
          
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("1") || subjectfour.equals("2") ||
                 subjectfour.equals ("3") || subjectfour.equals("5") ||
                 subjectfour.equals("7"))
        {    
        unit4 = 3;
        lab4 = 1;
        payment4 = type2;

        }
        
        else if (subjectfour.equals ("9")) 
        
        { 
        unit4 = 2;    
        lab4 = 0;
        payment4 = type3;
        
        }    
        
        else if (subjectfour.equals ("4")) 
        
        {    
        unit4 = 4;
        lab4 = 2;
        payment4 = type5;
        
        }  
        
        else {
        System.out.println("invalid entry");
        break;
        }
        
        // ------------fifth subject------------       
        
        System.out.println("Enter 5th subject" );
        System.out.println("(N/n) = no subject to enroll");
        subjectfive = sc.nextLine();
        if (subjectfive.equals ("6") || subjectfive.equals("8"))
        { 
            
                
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("1") || subjectfive.equals("2") ||
                 subjectfive.equals ("3") || subjectfive.equals("5") ||
                 subjectfive.equals("7"))
        {   
        unit5 = 3;    
        lab5 = 1;
        payment5 = type2;

        }
        
        else if (subjectfive.equals ("9")) 
        
        { 
        unit5 = 2;
        lab5 = 0;
        payment5 = type3;
        
        }
        
        else if (subjectfive.equals ("4")) 
        
        {    
        unit5 = 4;
        lab5 = 2;
        payment5 = type5;
        
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
        if (subjectfive.equals ("6") || subjectfive.equals("8"))
        { 
          
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("1") || subjectfive.equals("2") ||
                 subjectfive.equals ("3") || subjectfive.equals("5") ||
                 subjectfive.equals("7"))
        {    
        unit5 = 3;
        lab5 = 1;
        payment5 = type2;

        }
        
        else if (subjectfive.equals ("9")) 
        
        { 
        unit5 = 2;    
        lab5 = 0;
        payment5 = type3;
            
        } 
          
        else if (subjectfive.equals ("4")) 
        
        {    
        unit5 = 4;
        lab5 = 2;
        payment5 = type5;
        
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
        else if (subjectsix.equals ("6") || subjectsix.equals("8"))
        { 
        

                
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("1") || subjectsix.equals("2") ||
                 subjectsix.equals ("3") || subjectsix.equals("5") ||
                 subjectsix.equals("7"))
        {   
        unit6 = 3;    
        lab6 = 1;
        payment6 = type2;

        }
        
        else if (subjectsix.equals ("9")) 
        
        { 
        unit6 = 2;
        lab6 = 0;
        payment6 = type3;

        }
        
        else if (subjectsix.equals ("4")) 
        
        {    
        unit6 = 4;
        lab6 = 2;
        payment6 = type5;
        
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
        
        if (subjectsix.equals ("6") || subjectsix.equals("8"))
        { 
          
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("1") || subjectsix.equals("2") ||
                 subjectsix.equals ("3") || subjectsix.equals("5") ||
                 subjectsix.equals("7"))
        {    
        unit6 = 3;
        lab6 = 1;
        payment6 = type2;

        }
        
        else if (subjectsix.equals ("9")) 
        
        { 
        unit6 = 2;    
        lab6 = 0;
        payment6 = type3;
            
        }     
        
        else if (subjectsix.equals ("4")) 
        
        {    
        unit6 = 4;
        lab6 = 2;
        payment6 = type5;
        
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
        else if (subjectseven.equals ("6") || subjectseven.equals("8"))
        { 
            
                
        unit7 = 3;
        lab7 = 0;
        payment7 = type1;
        
        }
        
        else if (subjectseven.equals ("1") || subjectseven.equals("2") ||
                 subjectseven.equals ("3") || subjectseven.equals("5") ||
                 subjectseven.equals("7"))
        {   
        unit7 = 3;    
        lab7 = 1;
        payment7 = type2;

        }
        
        else if (subjectseven.equals ("9")) 
        
        { 
        unit7 = 2;
        lab7 = 0;
        payment7 = type3;

        }   
        
        else if (subjectseven.equals ("4")) 
        
        {    
        unit7 = 4;
        lab7 = 2;
        payment7 = type5;
        
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
        if (subjectseven.equals ("6") || subjectseven.equals("8"))
        { 
          
        unit7 = 3;
        lab7 = 0;
        payment7 = type1;
        
        }
        
        else if (subjectseven.equals ("1") || subjectseven.equals("2") ||
                 subjectseven.equals ("3") || subjectseven.equals("5") ||
                 subjectseven.equals("7"))
        {    
        unit7 = 3;
        lab7 = 1;
        payment7 = type2;

        }
        
        else if (subjectseven.equals ("9")) 
        
        { 
        unit7 = 2;    
        lab7 = 0;
        payment7 = type3;
            
        }         
        
        else if (subjectseven.equals ("4")) 
        
        {    
        unit7 = 4;
        lab7 = 2;
        payment7 = type5;
        
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
 
        // ------------eighth subject------------          
        
        System.out.println("Enter 8th subject" );
        System.out.println("(N/n) = no subject to enroll");
        subjecteight = sc.nextLine();
        if (subjecteight.equals ("n") || subjecteight.equals ("N")){
        subjecteight = "no8"; 
        payment8 = type0;}
        else if (subjecteight.equals ("6") || subjecteight.equals("8"))
        { 
        

                
        unit8 = 3;
        lab8 = 0;
        payment8 = type1;
        
        }
        
        else if (subjecteight.equals ("1") || subjecteight.equals("2") ||
                 subjecteight.equals ("3") || subjecteight.equals("5") ||
                 subjecteight.equals("7"))
        {   
        unit8 = 3;    
        lab8 = 1;
        payment8 = type2;

        }
        
        else if (subjecteight.equals ("9")) 
        
        { 
        unit8 = 2;
        lab8 = 0;
        payment8 = type3;

        }
        
        else if (subjecteight.equals ("4")) 
        
        {    
        unit8 = 4;
        lab8 = 2;
        payment8 = type5;
        
        }  
       
        else {
        System.out.println("invalid entry");
                
        break;
        }    

        while (subjecteight.equals (subjectone) ||
               subjecteight.equals (subjecttwo) ||
               subjecteight.equals (subjectthree) ||
               subjecteight.equals (subjectfour) ||
               subjecteight.equals (subjectfive) ||
               subjecteight.equals (subjectsix) ||               
               subjecteight.equals (subjectseven))            
                {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 8th subject");
        System.out.println("(N/n) = no subject to enroll");
        
        subjecteight = sc.nextLine();
        if (subjecteight.equals ("n") || subjecteight.equals ("N")){
        subjecteight = "no8";}

        else if (!subjecteight.equals (subjectone) ||
            !subjecteight.equals (subjecttwo) ||
            !subjecteight.equals (subjectthree) ||
            !subjecteight.equals (subjectfour) ||
            !subjecteight.equals (subjectfive) ||
            !subjecteight.equals (subjectsix) ||
            !subjecteight.equals (subjectseven))
            
            {}
                 
        } // tempo
        
        if (subjecteight.equals ("6") || subjecteight.equals("8"))
        { 
          
        unit8 = 3;
        lab8 = 0;
        payment8 = type1;
        
        }
        
        else if (subjecteight.equals ("1") || subjecteight.equals("2") ||
                 subjecteight.equals ("3") || subjecteight.equals("5") ||
                 subjecteight.equals("7"))
        {    
        unit8 = 3;
        lab8 = 1;
        payment8 = type2;

        }
        
        else if (subjecteight.equals ("9")) 
        
        { 
        unit8 = 2;    
        lab8 = 0;
        payment8 = type3;
            
        }    
        
        else if (subjecteight.equals ("4")) 
        
        {    
        unit8 = 4;
        lab8 = 2;
        payment8 = type5;
        
        }  
        
        else if (subjecteight.equals ("n") || subjecteight.equals ("N") ||
                subjecteight.equals ("no8"))
        {    
        unit8 = 0;
        lab8 = 0;
        payment8 = 0;
        }
            
        else {
        System.out.println("invalid entry");
        break;
        }           
        
 
        
        
        // ------------calculation portion------------ 
                
        paymenttotal = payment1 + payment2 + payment3 + payment4 + payment5 +
                payment6 + payment7 + payment8;
        
        totalunits = unit1 + unit2 + unit3 + unit4 + unit5 + unit6 + unit7 +
                unit8;       
        
        totallabs = lab1 + lab2 + lab3 + lab4 + lab5 + lab6 + lab7 +
                lab8;       
        
        totalpayment = paymenttotal + miscellaneous + quipper;
        
        
       
        
        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        

        
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
       
        
        // ------------subject tagging and output------------      
        
        if (subjectone.equals ("1")) {
        subjectone = "IT225"; }
        else if (subjectone.equals ("2")) {
        subjectone = "IT226"; }      
        else if (subjectone.equals ("3")) {
        subjectone = "IT227"; }         
        else if (subjectone.equals ("4")) {
        subjectone = "LDS121"; }  
        else if (subjectone.equals ("5")) {
        subjectone = "FEL221"; }  
        else if (subjectone.equals ("6")) {
        subjectone = "MAT223"; }  
        else if (subjectone.equals ("7")) {
        subjectone = "NS222"; }  
        else if (subjectone.equals ("8")) {
        subjectone = "SS223"; }  
        else if (subjectone.equals ("9")) {
        subjectone = "PE224"; }         
        
        if (subjecttwo.equals ("1")) {
        subjecttwo = "IT225"; }
        else if (subjecttwo.equals ("2")) {
        subjecttwo = "IT226"; }      
        else if (subjecttwo.equals ("3")) {
        subjecttwo = "IT227"; }         
        else if (subjecttwo.equals ("4")) {
        subjecttwo = "LDS121"; }  
        else if (subjecttwo.equals ("5")) {
        subjecttwo = "FEL221"; }  
        else if (subjecttwo.equals ("6")) {
        subjecttwo = "MAT223"; }  
        else if (subjecttwo.equals ("7")) {
        subjecttwo = "NS222"; }  
        else if (subjecttwo.equals ("8")) {
        subjecttwo = "SS223"; }  
        else if (subjecttwo.equals ("9")) {
        subjecttwo = "PE224"; }   
        
        if (subjectthree.equals ("1")) {
        subjectthree = "IT225"; }
        else if (subjectthree.equals ("2")) {
        subjectthree = "IT226"; }      
        else if (subjectthree.equals ("3")) {
        subjectthree = "IT227"; }         
        else if (subjectthree.equals ("4")) {
        subjectthree = "LDS121"; }  
        else if (subjectthree.equals ("5")) {
        subjectthree = "FEL221"; }  
        else if (subjectthree.equals ("6")) {
        subjectthree = "MAT223"; }  
        else if (subjectthree.equals ("7")) {
        subjectthree = "NS222"; }  
        else if (subjectthree.equals ("8")) {
        subjectthree = "SS223"; }  
        else if (subjectthree.equals ("9")) {
        subjectthree = "PE224"; }  

        if (subjectfour.equals ("1")) {
        subjectfour = "IT225"; }
        else if (subjectfour.equals ("2")) {
        subjectfour = "IT226"; }      
        else if (subjectfour.equals ("3")) {
        subjectfour = "IT227"; }         
        else if (subjectfour.equals ("4")) {
        subjectfour = "LDS121"; }  
        else if (subjectfour.equals ("5")) {
        subjectfour = "FEL221"; }  
        else if (subjectfour.equals ("6")) {
        subjectfour = "MAT223"; }  
        else if (subjectfour.equals ("7")) {
        subjectfour = "NS222"; }  
        else if (subjectfour.equals ("8")) {
        subjectfour = "SS223"; }  
        else if (subjectfour.equals ("9")) {
        subjectfour = "PE224"; }  

        if (subjectfive.equals ("1")) {
        subjectfive = "IT225"; }
        else if (subjectfive.equals ("2")) {
        subjectfive = "IT226"; }      
        else if (subjectfive.equals ("3")) {
        subjectfive = "IT227"; }         
        else if (subjectfive.equals ("4")) {
        subjectfive = "LDS121"; }  
        else if (subjectfive.equals ("5")) {
        subjectfive = "FEL221"; }  
        else if (subjectfive.equals ("6")) {
        subjectfive = "MAT223"; }  
        else if (subjectfive.equals ("7")) {
        subjectfive = "NS222"; }  
        else if (subjectfive.equals ("8")) {
        subjectfive = "SS223"; }  
        else if (subjectfive.equals ("9")) {
        subjectfive = "PE224"; }  
        else if (subjectfive.equals ("n")|| subjectfive.equals ("N")){
        subjectfive = "- - -"; } 

        if (subjectsix.equals ("1")) {
        subjectsix = "IT225"; }
        else if (subjectsix.equals ("2")) {
        subjectsix = "IT226"; }      
        else if (subjectsix.equals ("3")) {
        subjectsix = "IT227"; }         
        else if (subjectsix.equals ("4")) {
        subjectsix = "LDS121"; }  
        else if (subjectsix.equals ("5")) {
        subjectsix = "FEL221"; }  
        else if (subjectsix.equals ("6")) {
        subjectsix = "MAT223"; }  
        else if (subjectsix.equals ("7")) {
        subjectsix = "NS222"; }  
        else if (subjectsix.equals ("8")) {
        subjectsix = "SS223"; }  
        else if (subjectsix.equals ("9")) {
        subjectsix = "PE224"; }    
        else if (subjectsix.equals ("no6")) {
        subjectsix = "- - -"; } 

        if (subjectseven.equals ("1")) {
        subjectseven = "IT225"; }
        else if (subjectseven.equals ("2")) {
        subjectseven = "IT226"; }      
        else if (subjectseven.equals ("3")) {
        subjectseven = "IT227"; }         
        else if (subjectseven.equals ("4")) {
        subjectseven = "LDS121"; }  
        else if (subjectseven.equals ("5")) {
        subjectseven = "FEL221"; }  
        else if (subjectseven.equals ("6")) {
        subjectseven = "MAT223"; }  
        else if (subjectseven.equals ("7")) {
        subjectseven = "NS222"; }  
        else if (subjectseven.equals ("8")) {
        subjectseven = "SS223"; }  
        else if (subjectseven.equals ("9")) {
        subjectseven = "PE224"; }    
        else if (subjectseven.equals ("no7")) {
        subjectseven = "- - -"; }         

        if (subjecteight.equals ("1")) {
        subjecteight = "IT225"; }
        else if (subjecteight.equals ("2")) {
        subjecteight = "IT226"; }      
        else if (subjecteight.equals ("3")) {
        subjecteight = "IT227"; }         
        else if (subjecteight.equals ("4")) {
        subjecteight = "LDS121"; }  
        else if (subjecteight.equals ("5")) {
        subjecteight = "FEL221"; }  
        else if (subjecteight.equals ("6")) {
        subjecteight = "MAT223"; }  
        else if (subjecteight.equals ("7")) {
        subjecteight = "NS222"; }  
        else if (subjecteight.equals ("8")) {
        subjecteight = "SS223"; }  
        else if (subjecteight.equals ("9")) {
        subjecteight = "PE224"; }   
        else if (subjecteight.equals ("no8")) {
        subjecteight = "- - -"; }            

               
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


          System.out.println("Subject1: " + subjectone);  
          System.out.println("Subject2: " + subjecttwo);  
          System.out.println("Subject3: " + subjectthree);  
          System.out.println("Subject4: " + subjectfour);  
          System.out.println("Subject5: " + subjectfive);  
          System.out.println("Subject6: " + subjectsix);  
          System.out.println("Subject7: " + subjectseven);  
          System.out.println("Subject8: " + subjecteight);    
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
            
        paymenttotal = 15185;    
        totalpayment = 24185;

        
        System.out.println("Enter your full name");
        name = sn.nextLine();

        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
        
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


    System.out.println("Subject1: IT225");
    System.out.println("Subject2: IT226");
    System.out.println("Subject3: IT227");
    System.out.println("Subject4: LDS121");
    System.out.println("Subject5: FEL221");
    System.out.println("Subject6: MAT223");
    System.out.println("Subject7: NS222");
    System.out.println("Subject8: SS223");
    System.out.println("Subject9: PE224");


        System.out.println("---------------------------------------------");         
        System.out.println("Tuition: " + paymenttotal);
        System.out.println("Quipper = 7500");
        System.out.println("Miscellaneous = 1500");
        System.out.println("Total units: 27");
        System.out.println("Total lab units: 7");  
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



        


      

    




    

    

    



      


        
        
    
        
    
    
    


