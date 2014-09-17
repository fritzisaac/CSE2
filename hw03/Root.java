/////////////////////////////////////////
//Fritz Isaac
//hw03 Root Program

//program will receive double from user and print crude estimate of cubed root
//program will cube the crude estimate and print this value as well

import java.util.Scanner; //import class

///define class
public class Root{
//main method
public static void main (String [ ] args) {
    Scanner myScanner = new Scanner(System.in); //construction of class
        
    System.out.print ("Enter a double:"); //command user to enter double
        double doubleInput = myScanner.nextDouble(); //declare input variable
           
//declare first guess
    double guess = doubleInput/3;
//refine guesses   
    guess = (guess*guess*guess+doubleInput)/(3*guess*guess);
    guess = (2*guess*guess*guess+doubleInput)/(3*guess*guess);
    guess = (2*guess*guess*guess+doubleInput)/(3*guess*guess);
    guess = (2*guess*guess*guess+doubleInput)/(3*guess*guess);
    
    System.out.println ("The cube root is " +guess); //print cubed root
    System.out.println (+guess+"*"+guess+"*"+guess); //show math for cubing the root
    System.out.println (+guess*guess*guess); //print estimate of cubed root to the third power
    
}
}