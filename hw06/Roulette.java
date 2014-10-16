//
//Fritz Isaac
//
//Roulette Program
//
//program will receive number choice, spin 1000 times, and tell number of times profit was made in 100 spins and amount of dollars won/lost

import java.util.Scanner;

public class Roulette{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        
        System.out.print("Enter your roulette choice (1-38)");
        
        if (myScanner.hasNextInt()) {
            int choice = myScanner.nextInt();
            
            if (choice > 0 && choice < 38){
                int counter = 0;
                int counter2 = 0;
                int luck = 0;
                int nProfit = 0;
                int nFail = 0;
                int money;
                while(counter2<1000){
                
                    while(counter<100){
                        int roulette = (int) ((Math.random()*37)+1);
                        if (choice == roulette){
                        luck++;
                        }
                        counter++;
                    }
                    
                        
                        if(luck >2){
                            nProfit++;    
                        }
                
                    if (luck == 0){
                        nFail++;
                    }
                luck = 0;
                counter = 0;
                counter2++;
                }    
                
                
                System.out.println("You made a profit on "+nProfit+" out of 1000 sessions.");
                System.out.println("You failed to win even once on "+nFail+" out of 1000 sessions.");
                System.out.println("Your total winnings came out to $"+(nProfit*36));
            }
        
            else {
                System.out.println("You did not enter a valid roulette choice.");
            }
            
        }
        
        else {
            System.out.println("You did not enter a valid roulette choice.");
        }
        
        
    }   
    
}