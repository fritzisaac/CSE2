//Fritz Isaac
//Exam 2 Practice
//hw8

import java.util.Scanner;
public class hw8{
    public static void main(String []arg){
        char input;
	    Scanner scan=new Scanner(System.in);
    	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    	input=getInput(scan.nextLine());
    	System.out.println("You entered '"+input+"'");
    	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    	input=getInput(scan,"yYnN",5); //give up after 5 attempts
    	if(input!=' '){
       	System.out.println("You entered '"+input+"'");
    	}
    	input=getInput(scan,"Choose a digit.","0123456789");
    	System.out.println("You entered '"+input+"'");
    }
  
    public static char getInput(String continueQuit){
        Scanner scan = new Scanner(System.in);
        while !(continueQuit = "C" || continueQuit = "c"){
            System.out.print("You must enter a single character from the list 'Cc'. Try again- ");
            continueQuit=scan.nextLine();
        }
        return continueQuit;
    }
      
    public static char getInput(char yesNo){
          Scanner scan = new Scanner(System.in);
          while ((yesNo != 'Y') && (yesNo != 'y') && (yesNo != 'N') && (yesNo != 'n') && (counter < 5)){
            System.out.print("You must enter a single character from the list 'YyNn'. Try again- "); 
            continueQuit=scan.next();
          }
    }
    
    
    
    
}
