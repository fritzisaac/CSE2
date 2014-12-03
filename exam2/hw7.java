//Fritz Isaac
//Exam 2 Practice
//hw7

import java.util.Scanner;

public class hw7{
    public static void main(String [] args){
        Scanner sithLord = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9- ");
        if (sithLord.hasNextInt()){
            int input = sithLord.nextInt();
            
            for (int digit = 1; digit < input+1; digit++){ //each number group
                
                for (int counter1 = digit; counter1 > 0; counter1--){ //each row
                    for (int spaces = 0; spaces < (input - digit); spaces++){    
                        System.out.print(" ");
                    }
                    for (int counter2 = 0; counter2 < digit + (digit - 1); counter2++){ //each column
                        System.out.print(digit);
                    }
                    System.out.println(""); //switch lines
                    
                }
                
                for (int spaces = 0; spaces < (input - digit); spaces++){    
                    System.out.print(" ");
                }
                for (int counter2 = 0; counter2 < digit + (digit - 1); counter2++){ //each column
                    System.out.print("-");
                }
                System.out.println("");
                
            }
        }
        else{
            System.out.println("You did not enter a valid input. Restart the program.");
        }
    }
}