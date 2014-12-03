//////////////////////////////////////////////
//Fritz Isaac
//Return of the Big Mac Program
//
//program will receive number of Big Macs and whether user orders fries or not
//program will only run with certain input and will print total meal cost

    import java.util.Scanner; //import the Scanner class
    
    public class BigMacAgain{
     
    //main method required for every Java program   
    public static void main(String [] args) {
    
    Scanner myScanner; //declares instance of scanner
    myScanner = new Scanner(System.in);
    
    System.out.print("Enter the number of Big Macs (an integer > 0) : "); //prompt user for # of BigMacs
        int nBigMacs = myScanner.nextInt(); //reaccept user response to prompt
        double bigMac$ = 2.22;
        double totalMac$=(nBigMacs*bigMac$); //redefine total Big Mac cost variable
        double meal$=(totalMac$+2.15)*100; //add fry cost to Big Mac cost
        int mealInt$ = (int) meal$; //cast meal cost to int so as to remove extraneous decimals 
        double totalMeal$ = (double) mealInt$/100; //return to actual dollar.cent cost of meal
    
    System.out.println("You ordered " +nBigMacs+" Big Macs at a cost of $"+(totalMac$)); //print number and cost of Big Macs
    
    System.out.print("Do you want an order of fries (Y/y/N/n)? "); //prompt user for fry order
        String answer = myScanner.next(); //declare input as String
        switch(answer) 
        {
            case "Y": //if Y is entered..
            System.out.println("The total cost of the meal is $" +totalMeal$);
            break;

            case "y": //if y is entered..
            System.out.println("The total cost of the meal is $" +totalMeal$);
            break;

            case "N": //if N is entered..
            System.out.println("The total cost of the meal is $" +totalMac$);
            break;

            case "n": //if n is entered
            System.out.println("The total cost of the meal is $" +totalMac$);
            break;
        
         
            default: //if anything other than Y,y,N, or n is entered..
            System.out.println("You did not enter (Y/y/N/n).");
            break;
    
    
    }
    
    
    

    
    
    
    
   
    
    
    
    
    }
    }