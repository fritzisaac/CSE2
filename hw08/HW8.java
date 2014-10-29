//
//Fritz Isaac
//
//HW8 Program
//

import java.util.Scanner; //import Scanner class

public class HW8{
    public static void main(String []arg){
	    String input;
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //prompt input
	    input=getInput(scan.next()); //defines input as getInput method for string values
	    System.out.println("You entered '"+input+"'"); //print input
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //prompt input
	    char input2;
	    input2=getInput(scan.next().charAt(0)); //defines input as getInput method for char values
	    if(input2 !=' '){ //if input was y,Y,n,N
   	        System.out.println("You entered '"+input2+"'"); //print input
	    }
	    System.out.print("Choose a digit-");
	    int input3;
	    input3=getInput(scan.nextInt());
	    System.out.println("You entered '"+input3+"'");
    }
    
    public static String getInput(String continueQuit){
        while(!(continueQuit.equals("C") || continueQuit.equals("c"))){
                Scanner scan=new Scanner(System.in);
                System.out.print("You did not enter a character from the list 'Cc'; try again-");
                continueQuit=scan.next();
        }
        return continueQuit;
    }
        
    public static char getInput(char yesNo){
        int counter = 0; 
        while( (yesNo != 'Y') && (yesNo != 'y') && (yesNo != 'N') && (yesNo != 'n') && (counter < 5) ){
            Scanner scan=new Scanner(System.in);
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
            yesNo= scan.next().charAt(0);
            counter++;
            if (counter>4){
                System.out.println("You failed after 5 tries.");
                yesNo = ' ';
                return yesNo;
            }
        }
            return yesNo;
    }
    
    public static int getInput(int digit){
        while (digit < 0 || digit > 9){
            Scanner scan=new Scanner(System.in);
            System.out.println("You did not enter a valid choice. Try again.");
            System.out.print("Choose a digit-");
            digit = scan.nextInt(); 
        }
        return digit;
    }
    
  
}
