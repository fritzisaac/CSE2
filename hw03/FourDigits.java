////////////////////////////////////////////////////////////////
//Fritz Isaac
//hw03 Four Digits Program

//program will receive double from user and print first four decimals

import java.util.Scanner; //import class

//define class
public class FourDigits{
//main method
public static void main (String [ ] args) {
    Scanner myScanner=new Scanner(System.in); //construction of class
    
    System.out.print ("Enter a double:"); //command user to enter double
        double doubleInput=myScanner.nextDouble(); //declare input variable
        
        doubleInput=doubleInput*10000; //moves decimal to include important digits
        
        String answer=""; //declares blank string for input of integer

//divide repeatedly and leave remainders only        
        answer = answer + (int) ((doubleInput/1000)%10); 
        answer = answer + (int) ((doubleInput/100)%10);
        answer = answer + (int) ((doubleInput/10)%10);
        answer = answer + (int) (doubleInput%10);
    
    System.out.println ("The four digits are "+answer); //print digits
}
}