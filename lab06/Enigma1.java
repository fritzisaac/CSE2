/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a proportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner; //import Scanner
public class Enigma1{
    public static void main(String []arg){
        Scanner eScanner; //instance of Scanner
        eScanner=new Scanner(System.in);
        System.out.print("Enter an int for the percent (0, 1,...99)- "); //prompt user for percentage
        
        if (eScanner.hasNextInt()){
            int percent = eScanner.nextInt();
            System.out.println("You entered "+percent+"%"); //print input as percentage
            double proportion = (double) ((100.00 - percent)/100);
            System.out.println("The proportion remaining is "+proportion+".");
        } 
        
        else{
            System.out.println("You did not enter an int.");
        }
    
        
    }

    
}

/* Error report: 
 *      program doesnt account for any input other than 7, 14, 33, 41, and 60
 *      should request int values
 *      double percent should be defined in if statement ??
 *       
 * 
 * 
 * 
 * 
 */

