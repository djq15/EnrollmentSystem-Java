//first year second semester 
package enrollmentsystem;
import java.util.Scanner;

public class y1s2 {
    
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
    
    static int c;
    static int miscellaneous = 7500;
    static int quipper = 1500;
    static int type0 = 0;
    static int type1 = 1065;
    static int type2 = 1865;
    static int type3 = 710;
    static int type4 = 2310;
  
    static String subjectone;
    static String subjecttwo;
    static String subjectthree;
    static String subjectfour;
    static String subjectfive;
    static String subjectsix;
    static String subjectseven;
    static String subjecteight;
    static String subjectnine;

    
    public void display2() {
 
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    Scanner sb = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);
   
    System.out.println("First year second semester");
        
        System.out.println("(1) = enroll subjects individually");
        System.out.println("(2) = full package enrollment");
        c = sd.nextInt();

        switch (c) {
        // individual subjects
        case 1:
        // 1st year 1st semester
        System.out.println("Enter your full name");
        name = sn.nextLine();
            
        System.out.println("-----------Available subjects-----------");
        System.out.println(" (1) ENG112 - 3 unit/s | 0 lab/s");
        System.out.println(" (2) MAT112 - 3 unit/s | 0 lab/s");
        System.out.println(" (3)  IT122 - 3 unit/s | 1 lab/s");
        System.out.println(" (4)  IT223 - 3 unit/s | 1 lab/s");
        System.out.println(" (5)TVET122 - 3 unit/s | 0 lab/s");
        System.out.println(" (6) DFT122 - 2 unit/s | 2 lab/s");
        System.out.println(" (7) HUM121 - 3 unit/s | 0 lab/s");
        System.out.println(" (8)  NS212 - 3 unit/s | 1 lab/s");
        System.out.println(" (9)  PE122 - 2 unit/s | 0 lab/s");
        System.out.println("(10)NSTP122 - 3 unit/s | 0 lab/s");        
        System.out.println("----------------------------------------");
        


        // ------------first subject------------             
        System.out.println("Enter 1st subject" );
        subjectone = sc.nextLine();
        if (subjectone.equals ("1") || subjectone.equals("2") ||
            subjectone.equals("5") || subjectone.equals("7") ||
            subjectone.equals("10"))
        { 
            
                
        unit1 = 3;
        lab1 = 0;
        payment1 = type1;

        
        }
        
        else if (subjectone.equals ("3") || subjectone.equals("4") ||
                 subjectone.equals ("8"))
        
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

        else if (subjectone.equals ("6")) 
        
        {    
        unit1 = 2;
        lab1 = 2;
        payment1 = type4;
        
        }        
        
        else {
        System.out.println("invalid entry");
        break;
        }
        // ------------second subject------------ 
       
        System.out.println("Enter 2nd subject" );
        subjecttwo = sc.nextLine();
        if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
            subjecttwo.equals("5") || subjecttwo.equals("7") ||
            subjecttwo.equals("10"))
        { 
            
                
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("3") || subjecttwo.equals("4") ||
                 subjecttwo.equals ("8"))
        
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
        
        else if (subjecttwo.equals ("6")) 
        
        {    
        unit2 = 2;
        lab2 = 2;
        payment2 = type4;
        
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
        if (subjecttwo.equals ("1") || subjecttwo.equals("2") ||
            subjecttwo.equals("5") || subjecttwo.equals("7") ||
            subjecttwo.equals("10"))
        { 
            
        unit2 = 3;
        lab2 = 0;
        payment2 = type1;
        
        }
        
        else if (subjecttwo.equals ("3") || subjecttwo.equals("4") ||
                 subjecttwo.equals ("8"))
        
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
        
        else if (subjecttwo.equals ("6")) 
        
        {    
        unit2 = 2;
        lab2 = 2;
        payment2 = type4;
        
        }  
         
        else {
        System.out.println("invalid entry");
        break;
        }
       
        // ------------third subject------------ 
        
        System.out.println("Enter 3rd subject" );
        subjectthree = sc.nextLine();
        if (subjectthree.equals ("1") || subjectthree.equals("2") ||
            subjectthree.equals("5") || subjectthree.equals("7") ||
            subjectthree.equals("10"))
        { 
            
                
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("3") || subjectthree.equals("4") ||
                 subjectthree.equals ("8"))
        
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
        
        else if (subjectthree.equals ("6")) 
        
        {    
        unit3 = 2;
        lab3 = 2;
        payment3 = type4;
        
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
        if (subjectthree.equals ("1") || subjectthree.equals("2") ||
            subjectthree.equals("5") || subjectthree.equals("7") ||
            subjectthree.equals("10"))
        { 
          
        unit3 = 3;
        lab3 = 0;
        payment3 = type1;
        
        }
        
        else if (subjectthree.equals ("3") || subjectthree.equals("4") ||
                 subjectthree.equals ("8"))
        
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
        
        else if (subjectthree.equals ("6")) 
        
        {    
        unit3 = 2;
        lab3 = 2;
        payment3 = type4;
        
        }  
        
        else {
        System.out.println("invalid entry");
        break;
        }
        
        // ------------fourth subject------------        

        System.out.println("Enter 4th subject" );
        subjectfour = sc.nextLine();
        if (subjectfour.equals ("1") || subjectfour.equals("2") ||
            subjectfour.equals("5") || subjectfour.equals("7") ||
            subjectfour.equals("10"))
        { 
            
                
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("3") || subjectfour.equals("4") ||
                 subjectfour.equals ("8"))
        
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
        
        else if (subjectfour.equals ("6")) 
        
        {    
        unit4 = 2;
        lab4 = 2;
        payment4 = type4;
        
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
        if (subjectfour.equals ("1") || subjectfour.equals("2") ||
            subjectfour.equals("5") || subjectfour.equals("7") ||
            subjectfour.equals("10"))
        { 
          
        unit4 = 3;
        lab4 = 0;
        payment4 = type1;
        
        }
        
        else if (subjectfour.equals ("3") || subjectfour.equals("4") ||
                 subjectfour.equals ("8"))
        
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
        
        else if (subjectfour.equals ("6")) 
        
        {    
        unit4 = 2;
        lab4 = 2;
        payment4 = type4;
        
        }  
        
        else {
        System.out.println("invalid entry");
        break;
        }
        
        // ------------fifth subject------------       
        
        System.out.println("Enter 5th subject" );
        System.out.println("(N/n) = no subject to enroll");
        subjectfive = sc.nextLine();
        if (subjectfive.equals ("1") || subjectfive.equals("2") ||
            subjectfive.equals("5") || subjectfive.equals("7") ||
            subjectfive.equals("10"))
        { 
            
                
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("3") || subjectfive.equals("4") ||
                 subjectfive.equals ("8"))
        
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
        
        else if (subjectfive.equals ("6")) 
        
        {    
        unit5 = 2;
        lab5 = 2;
        payment5 = type4;
        
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
        if (subjectfive.equals ("1") || subjectfive.equals("2") ||
            subjectfive.equals("5") || subjectfive.equals("7") ||
            subjectfive.equals("10"))
        { 
          
        unit5 = 3;
        lab5 = 0;
        payment5 = type1;
        
        }
        
        else if (subjectfive.equals ("3") || subjectfive.equals("4") ||
                 subjectfive.equals ("8"))
        
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
          
        else if (subjectfive.equals ("6")) 
        
        {    
        unit5 = 2;
        lab5 = 2;
        payment5 = type4;
        
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
        else if (subjectsix.equals ("1") || subjectsix.equals("2") ||
            subjectsix.equals("5") || subjectsix.equals("7") ||
            subjectsix.equals("10"))
        { 
        

                
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("3") || subjectsix.equals("4") ||
                 subjectsix.equals ("8"))
        
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
        
        else if (subjectsix.equals ("6")) 
        
        {    
        unit6 = 2;
        lab6 = 2;
        payment6 = type4;
        
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
        
        if (subjectsix.equals ("1") || subjectsix.equals("2") ||
            subjectsix.equals("5") || subjectsix.equals("7") ||
            subjectsix.equals("10"))
        { 
          
        unit6 = 3;
        lab6 = 0;
        payment6 = type1;
        
        }
        
        else if (subjectsix.equals ("3") || subjectsix.equals("4") ||
                 subjectsix.equals ("8"))
        
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
        
        else if (subjectsix.equals ("6")) 
        
        {    
        unit6 = 2;
        lab6 = 2;
        payment6 = type4;
        
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
        else if (subjectseven.equals ("1") || subjectseven.equals("2") ||
            subjectseven.equals("5") || subjectseven.equals("7") ||
            subjectseven.equals("10"))
        { 
            
                
        unit7 = 3;
        lab7 = 0;
        payment7 = type1;
        
        }
        
        else if (subjectseven.equals ("3") || subjectseven.equals("4") ||
                 subjectseven.equals ("8"))
        
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
        
        else if (subjectseven.equals ("6")) 
        
        {    
        unit7 = 2;
        lab7 = 2;
        payment7 = type4;
        
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
        if (subjectseven.equals ("1") || subjectseven.equals("2") ||
            subjectseven.equals("5") || subjectseven.equals("7") ||
            subjectseven.equals("10"))
        { 
          
        unit7 = 3;
        lab7 = 0;
        payment7 = type1;
        
        }
        
        else if (subjectseven.equals ("3") || subjectseven.equals("4") ||
                 subjectseven.equals ("8"))
        
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
        
        else if (subjectseven.equals ("6")) 
        
        {    
        unit7 = 2;
        lab7 = 2;
        payment7 = type4;
        
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
        else if (subjecteight.equals ("1") || subjecteight.equals("2") ||
            subjecteight.equals("5") || subjecteight.equals("7") ||
            subjecteight.equals("10"))
        { 
        

                
        unit8 = 3;
        lab8 = 0;
        payment8 = type1;
        
        }
        
        else if (subjecteight.equals ("3") || subjecteight.equals("4") ||
                 subjecteight.equals ("8"))
        
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
        
        else if (subjecteight.equals ("6")) 
        
        {    
        unit8 = 2;
        lab8 = 2;
        payment8 = type4;
        
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
        
        if (subjecteight.equals ("1") || subjecteight.equals("2") ||
            subjecteight.equals("5") || subjecteight.equals("7") ||
            subjecteight.equals("10"))
        { 
          
        unit8 = 3;
        lab8 = 0;
        payment8 = type1;
        
        }
        
        else if (subjecteight.equals ("3") || subjecteight.equals("4") ||
                 subjecteight.equals ("8"))
        
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
        
        else if (subjecteight.equals ("6")) 
        
        {    
        unit8 = 2;
        lab8 = 2;
        payment8 = type4;
        
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
        
        // ------------ninth subject------------   

        System.out.println("Enter 9th subject" );
        System.out.println("(N/n) = no subject to enroll");
        subjectnine = sc.nextLine();
        if (subjectnine.equals ("n") || subjectnine.equals ("N")){
        subjectnine = "no9"; 
        payment9 = type0;}
        else if (subjectnine.equals ("1") || subjectnine.equals("2") ||
            subjectnine.equals("5") || subjectnine.equals("7") ||
            subjectnine.equals("10"))
        { 
     
        unit9 = 3;
        lab9 = 0;
        payment9 = type1;
        
        }
        
        else if (subjectnine.equals ("3") || subjectnine.equals("4") ||
                 subjectnine.equals ("8"))
        
        {   
        unit9 = 3;    
        lab9 = 1;
        payment9 = type2;

        }
        
        else if (subjectnine.equals ("9")) 
        
        { 
        unit9 = 2;
        lab9 = 0;
        payment9 = type3;

        }
        
        else if (subjectnine.equals ("6")) 
        
        {    
        unit9 = 2;
        lab9 = 2;
        payment9 = type4;
        
        }  
        
       
        else {
        System.out.println("invalid entry");
                
        break;
        }    
        
        while (subjectnine.equals (subjectone) ||
               subjectnine.equals (subjecttwo) ||
               subjectnine.equals (subjectthree) ||
               subjectnine.equals (subjectfour) ||
               subjectnine.equals (subjectfive) ||
               subjectnine.equals (subjectsix) ||
               subjectnine.equals (subjectseven) ||
               subjectnine.equals (subjecteight))                
                {
        System.out.println("duplicate subject, pick another one");
        System.out.println("Enter 9th subject");
        System.out.println("(N/n) = no subject to enroll");
        
        subjectnine = sc.nextLine();
        if (subjectnine.equals ("n") || subjectnine.equals ("N")){
        subjectnine = "no9";}

        else if (!subjectnine.equals (subjectone) ||
            !subjectnine.equals (subjecttwo) ||
            !subjectnine.equals (subjectthree) ||
            !subjectnine.equals (subjectfour) ||
            !subjectnine.equals (subjectfive) ||
            !subjectnine.equals (subjectsix) ||
            !subjectnine.equals (subjectseven) ||
            !subjectnine.equals (subjecteight))             
            {}
                 
        } // tempo
        
        if (subjectnine.equals ("1") || subjectnine.equals("2") ||
            subjectnine.equals("5") || subjectnine.equals("7") ||
            subjectnine.equals("10"))
        { 
          
        unit9 = 3;
        lab9 = 0;
        payment9 = type1;
        
        }
        
        else if (subjectnine.equals ("3") || subjectnine.equals("4") ||
                 subjectnine.equals ("8"))
        
        {    
        unit9 = 3;
        lab9 = 1;
        payment9 = type2;

        }
        
        else if (subjectnine.equals ("9")) 
        
        { 
        unit9 = 2;    
        lab9 = 0;
        payment9 = type3;
            
        }     
        
        else if (subjectnine.equals ("6")) 
        
        {    
        unit9 = 2;
        lab9 = 2;
        payment9 = type4;
        
        }  
        
        else if (subjectnine.equals ("n") || subjectnine.equals ("N") ||
                subjectnine.equals ("no9"))
        {    
        unit9 = 0;
        lab9 = 0;
        payment9 = 0;

        }
            
        else {
        System.out.println("invalid entry");
        break;
        }  
 
        
        
        // ------------calculation portion------------ 
                
        paymenttotal = payment1 + payment2 + payment3 + payment4 + payment5 +
                payment6 + payment7 + payment8 + payment9;
        
        totalunits = unit1 + unit2 + unit3 + unit4 + unit5 + unit6 + unit7 +
                unit8 + unit9;        
        
        totallabs = lab1 + lab2 + lab3 + lab4 + lab5 + lab6 + lab7 +
                lab8 + lab9;        
        
        totalpayment = paymenttotal + miscellaneous + quipper;
        
        
       
        
        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        

        
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
       
        
        // ------------subject tagging and output------------      
        
        if (subjectone.equals ("1")) {
        subjectone = "ENG112"; }
        else if (subjectone.equals ("2")) {
        subjectone = "MAT112"; }      
        else if (subjectone.equals ("3")) {
        subjectone = "IT122"; }         
        else if (subjectone.equals ("4")) {
        subjectone = "IT223"; }  
        else if (subjectone.equals ("5")) {
        subjectone = "TVET112"; }  
        else if (subjectone.equals ("6")) {
        subjectone = "DFT122"; }  
        else if (subjectone.equals ("7")) {
        subjectone = "HUM121"; }  
        else if (subjectone.equals ("8")) {
        subjectone = "NS212"; }  
        else if (subjectone.equals ("9")) {
        subjectone = "PE122"; }  
        else if (subjectone.equals ("10")) {
        subjectone = "NSTP122"; }          
        
        if (subjecttwo.equals ("1")) {
        subjecttwo = "ENG112"; }
        else if (subjecttwo.equals ("2")) {
        subjecttwo = "MAT112"; }      
        else if (subjecttwo.equals ("3")) {
        subjecttwo = "IT122"; }         
        else if (subjecttwo.equals ("4")) {
        subjecttwo = "IT223"; }  
        else if (subjecttwo.equals ("5")) {
        subjecttwo = "TVET122"; }  
        else if (subjecttwo.equals ("6")) {
        subjecttwo = "DFT122"; }  
        else if (subjecttwo.equals ("7")) {
        subjecttwo = "HUM121"; }  
        else if (subjecttwo.equals ("8")) {
        subjecttwo = "NS212"; }  
        else if (subjecttwo.equals ("9")) {
        subjecttwo = "PE122"; }  
        else if (subjecttwo.equals ("10")) {
        subjecttwo = "NSTP122"; }  
        
        if (subjectthree.equals ("1")) {
        subjectthree = "ENG112"; }
        else if (subjectthree.equals ("2")) {
        subjectthree = "MAT112"; }      
        else if (subjectthree.equals ("3")) {
        subjectthree = "IT122"; }         
        else if (subjectthree.equals ("4")) {
        subjectthree = "IT223"; }  
        else if (subjectthree.equals ("5")) {
        subjectthree = "TVET122"; }  
        else if (subjectthree.equals ("6")) {
        subjectthree = "DFT122"; }  
        else if (subjectthree.equals ("7")) {
        subjectthree = "HUM121"; }  
        else if (subjectthree.equals ("8")) {
        subjectthree = "NS212"; }  
        else if (subjectthree.equals ("9")) {
        subjectthree = "PE122"; }  
        else if (subjectthree.equals ("10")) {
        subjectthree = "NSTP122"; }  

        if (subjectfour.equals ("1")) {
        subjectfour = "ENG112"; }
        else if (subjectfour.equals ("2")) {
        subjectfour = "MAT112"; }      
        else if (subjectfour.equals ("3")) {
        subjectfour = "IT122"; }         
        else if (subjectfour.equals ("4")) {
        subjectfour = "IT223"; }  
        else if (subjectfour.equals ("5")) {
        subjectfour = "TVET122"; }  
        else if (subjectfour.equals ("6")) {
        subjectfour = "DFT122"; }  
        else if (subjectfour.equals ("7")) {
        subjectfour = "HUM121"; }  
        else if (subjectfour.equals ("8")) {
        subjectfour = "NS212"; }  
        else if (subjectfour.equals ("9")) {
        subjectfour = "PE122"; }  
        else if (subjectfour.equals ("10")) {
        subjectfour = "NSTP122"; }  

        if (subjectfive.equals ("1")) {
        subjectfive = "ENG112"; }
        else if (subjectfive.equals ("2")) {
        subjectfive = "MAT112"; }      
        else if (subjectfive.equals ("3")) {
        subjectfive = "IT122"; }         
        else if (subjectfive.equals ("4")) {
        subjectfive = "IT223"; }  
        else if (subjectfive.equals ("5")) {
        subjectfive = "TVET122"; }  
        else if (subjectfive.equals ("6")) {
        subjectfive = "DFT122"; }  
        else if (subjectfive.equals ("7")) {
        subjectfive = "HUM121"; }  
        else if (subjectfive.equals ("8")) {
        subjectfive = "NS212"; }  
        else if (subjectfive.equals ("9")) {
        subjectfive = "PE122"; }  
        else if (subjectfive.equals ("10")) {
        subjectfive = "NSTP122"; }  
        else if (subjectfive.equals ("n")|| subjectfive.equals ("N")){
        subjectfive = "- - -"; } 

        if (subjectsix.equals ("1")) {
        subjectsix = "ENG112"; }
        else if (subjectsix.equals ("2")) {
        subjectsix = "MAT112"; }      
        else if (subjectsix.equals ("3")) {
        subjectsix = "IT122"; }         
        else if (subjectsix.equals ("4")) {
        subjectsix = "IT223"; }  
        else if (subjectsix.equals ("5")) {
        subjectsix = "TVET122"; }  
        else if (subjectsix.equals ("6")) {
        subjectsix = "DFT122"; }  
        else if (subjectsix.equals ("7")) {
        subjectsix = "HUM121"; }  
        else if (subjectsix.equals ("8")) {
        subjectsix = "NS212"; }  
        else if (subjectsix.equals ("9")) {
        subjectsix = "PE122"; }  
        else if (subjectsix.equals ("10")) {
        subjectsix = "NSTP122"; }  
        else if (subjectsix.equals ("no6")) {
        subjectsix = "- - -"; } 

        if (subjectseven.equals ("1")) {
        subjectseven = "ENG112"; }
        else if (subjectseven.equals ("2")) {
        subjectseven = "MAT112"; }      
        else if (subjectseven.equals ("3")) {
        subjectseven = "IT122"; }         
        else if (subjectseven.equals ("4")) {
        subjectseven = "IT1223"; }  
        else if (subjectseven.equals ("5")) {
        subjectseven = "TVET122"; }  
        else if (subjectseven.equals ("6")) {
        subjectseven = "DFT122"; }  
        else if (subjectseven.equals ("7")) {
        subjectseven = "HUM121"; }  
        else if (subjectseven.equals ("8")) {
        subjectseven = "NS212"; }  
        else if (subjectseven.equals ("9")) {
        subjectseven = "PE122"; }  
        else if (subjectseven.equals ("10")) {
        subjectseven = "NSTP122"; }  
        else if (subjectseven.equals ("no7")) {
        subjectseven = "- - -"; }         

        if (subjecteight.equals ("1")) {
        subjecteight = "ENG112"; }
        else if (subjecteight.equals ("2")) {
        subjecteight = "MAT112"; }      
        else if (subjecteight.equals ("3")) {
        subjecteight = "IT122"; }         
        else if (subjecteight.equals ("4")) {
        subjecteight = "IT223"; }  
        else if (subjecteight.equals ("5")) {
        subjecteight = "TVET122"; }  
        else if (subjecteight.equals ("6")) {
        subjecteight = "DFT122"; }  
        else if (subjecteight.equals ("7")) {
        subjecteight = "HUM121"; }  
        else if (subjecteight.equals ("8")) {
        subjecteight = "NS212"; }  
        else if (subjecteight.equals ("9")) {
        subjecteight = "PE122"; }  
        else if (subjecteight.equals ("10")) {
        subjecteight = "NSTP122"; } 
        else if (subjecteight.equals ("no8")) {
        subjecteight = "- - -"; }            

        if (subjectnine.equals ("1")) {
        subjectnine = "ENG112"; }
        else if (subjectnine.equals ("2")) {
        subjectnine = "MAT112"; }      
        else if (subjectnine.equals ("3")) {
        subjectnine = "IT122"; }         
        else if (subjectnine.equals ("4")) {
        subjectnine = "IT223"; }  
        else if (subjectnine.equals ("5")) {
        subjectnine = "TVET122"; }  
        else if (subjectnine.equals ("6")) {
        subjectnine = "DFT122"; }  
        else if (subjectnine.equals ("7")) {
        subjectnine = "HUM121"; }  
        else if (subjectnine.equals ("8")) {
        subjectnine = "NS212"; }  
        else if (subjectnine.equals ("9")) {
        subjectnine = "PE122"; }  
        else if (subjectnine.equals ("10")) {
        subjectnine = "NSTP122"; }  
        else if (subjectnine.equals ("no9")) {
        subjectnine = "- - -"; }          
        
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
          System.out.println("Subject9: " + subjectnine);  
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
            
        paymenttotal = 13940;    
        totalpayment = 22940;

        
        System.out.println("Enter your full name");
        name = sn.nextLine();

        System.out.println("Please enter downpayment amount");
        downpayment = sd.nextInt();
        balancepayment = totalpayment  - downpayment;
        perexampayment = (balancepayment) / (3);
        
        System.out.println("===========THANK YOU FOR ENROLLING===========");
        System.out.println("Name: " + name); 


    System.out.println("Subject1: ENG112");
    System.out.println("Subject2: MAT112");
    System.out.println("Subject3: IT122");
    System.out.println("Subject4: IT223");
    System.out.println("Subject5: TVET122");
    System.out.println("Subject6: DFT122");
    System.out.println("Subject7: HUM121");
    System.out.println("Subject8: NS212");
    System.out.println("Subject9: PE122");
    System.out.println("Subject10:NSTP122");


        System.out.println("---------------------------------------------");         
        System.out.println("Tuition: " + paymenttotal);
        System.out.println("Quipper = 7500");
        System.out.println("Miscellaneous = 1500");
        System.out.println("Total units: 28");
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



        


      

    




    

    

    



      


        
        
    
        
    
    
    


