//
// Program
//
//program will receive number choice and print a number tower of sorts
import java.util.Scanner;

public class NumberStack{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter a number from 1-9: ");
        
        if (myScanner.hasNextInt()) {
            int x = myScanner.nextInt(); //Here we prompt the user to enter a value
            System.out.println("Using for loops: "); // Here we print which method we are using to create this stack of numbers

            for (int a = 1; a < (x + 1); a++) { //for each number group
                
                for (int c = a; c > 0; c--) { //for each row
                    
                    for (int spaces = 0; spaces < (x - a); spaces++) { // for the spaces
                        System.out.print(" ");
                    }
                    
                    for (int b = 0; b < a + (a - 1); b++) { //for each column
                        System.out.print(a); //print number
                    }
                    System.out.println(""); //end row
                }
            
                for (int spaces = 0; spaces < (x - a); spaces++) { //for the tab spaces
                    System.out.print(" ");
                }
                
                for (int b = 0; b < a + (a - 1); b++) { //for the tabs to be printed
                    System.out.print("-");
                }
                System.out.println("");
            }

            System.out.println("Using while loops: "); //Declaring what method is used
            int a = 1; // Declaring the variables outside the loop as it is a while loop
            int b = 0;
            int c = a;
            int spaces = 0;
            
            while (a < (x + 1)) { // For each number group
                c = a; // setting the variables inside the loop as it is  while loop
            
                while (c > 0) { // For each row
                    spaces = 0;
                    
                    while (spaces < (x - a)) { // for the spaces
                        System.out.print(" "); //print space
                        spaces++;
                    }
                    b = 0;

                    while (b < a + (a - 1)) { //for each column
                        System.out.print(a); // print number
                        b++;
                    }
                    System.out.println(""); //end row
                    c--;
                }
                spaces = 0;
                
                while (spaces < (x - a)) { // for the tab spaces
                    System.out.print(" ");
                    spaces++;
                }
                b = 0;

                while (b < a + (a - 1)) { // for the tabs
                    System.out.print("-"); //printing the tabs
                    b++;
                }
                System.out.println("");
                a++;
            }

        System.out.println("Using do while loop"); // declaring what method  is used
        a = 1; // resetting the variables
        b = 0;
        c = a;
        spaces = 0;

            do { // setting the output
                c = a;
                do {
                    spaces = 0; // setting the output
                    
                    do {
                        System.out.print(" "); 
                        spaces++;
                    } while (spaces < (x - a)); // for the spaces
                    b = 0;
                    
                    do {
                        System.out.print(a);
                        b++;
                    } while (b < a + (a - 1)); // for each column
                    System.out.println("");
                    c--;
                    spaces = 0;
                } while (c > 0); // for each row
    
                do {
                    System.out.print(" ");
                    spaces++;
                } while (spaces < (x - a)); // for each tab spaces
                b = 0;
                
                do {
                    System.out.print("-");
                    b++;
                } while (b < a + (a - 1)); //for the tabs
                System.out.println("");
                a++;
            } while (a < (x + 1)); //for each number group
        }        
                
        else{
            System.out.println("You did not enter an int.");
        }
    } //end method
} //end class
