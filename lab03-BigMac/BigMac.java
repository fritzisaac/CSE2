///////////////////////////////////////
//Fritz Isaac
//Big Mac Java Program
//
//program will compute cost of buying Big Macs depending on data input by user of program
//
    //first, import the Scanner class
    import java.util.Scanner;
    
    public class BigMac{

    //main method required for every Java program
    public static void main(String[ ] args) {

    //declare an instance of the Scanner to accept input
    Scanner myScanner;
    //tell Scanner that instance will take input from STDIN
    myScanner = new Scanner( System.in );
    
    //prompt user for number of Big Macs
    System.out.print("Enter the number of Big Macs (an integer > 0) : ");
    //accept user response to prompt
    int nBigMacs = myScanner.nextInt( );

    //prompt user for price and percent
    System.out.print ("Enter the cost per Big Mac as"+
        " a double (in the form xx.xx) : " );
    double bigMac$ = myScanner.nextDouble ();
    System.out.print(
        "Enter the percent tax as a whole number (xx) : ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100;   //user enters percent, but I want proportion
    
    double cost$;
    int dollars,    //dollar amount of cost
    dimes, pennies; //for storing digits
                    //to the right of the decimal point
                    //for the cost$
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount, etc.
    //  (int) (6.73*10) % 10 -> 67% 10 -> 7
    // % (mod) operator gives remainder value
    dimes=(int) (cost$*10)%10;
    pennies=(int) (cost$*100)%10;
    System.out.println ("The total cost of " +nBigMacs+" Big Macs, at $"+bigMac$+" per Big Mac, with a sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        
        
        
    } //end of main method
    } //end of class