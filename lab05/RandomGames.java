//////////////////////////////////////
//Fritz Isaac
//
//Random Games Program
//
//program will receive choice of game (roulette, craps, or cards)
//program will output different sets of random values depending on game choice 

    import java.util.Scanner; // import the scanner class

public class RandomGames{
    
    public static void main(String[] args) {
        
    Scanner myScanner; //declare instance of scanner
    myScanner=new Scanner(System.in); //accept input to Scanner
    
    System.out.print("Enter R or r for roulette, C or c for craps, P or p for pick a card: "); //prompt game choice
        String gameChoice = myScanner.next(); //declare input as a String with choice of game
        int rouletteResult = (int)(Math.random()*36); //define the roulette's output as a random number from 0-36
    if (gameChoice.length() > 1 || gameChoice.length() < 1) //ensure user inputs one character
    {
        System.out.println("You did not enter a valid game choice.");
    }
    else
    {
        switch(gameChoice)
    {
            case "R": //if user enters R..
                System.out.println("Roulette: "+rouletteResult); //give Roulette result
                break;
            case "r": //if user enters r..
                System.out.println("Roulette: "+rouletteResult); //give Roulette result
                break;
            case "C": //if user enters C..
                System.out.println("Craps option is yet to be implemented."); //inform user that craps isn't implemented
                break;
            case "c": //if user enters c..
                System.out.println("Craps option is yet to be implemented."); //inform user that craps isn't implemented
                break;
            case "P": //if user enters P..
                System.out.println("Pick a card option is yet to be implemented."); //inform user that picking cards isn't implemented
                break;
            case "p": //if user enters p..
                System.out.println("Pick a card option is yet to be implemented."); //inform user that picking cards isn't implemented
                break;
            default:
                System.out.println("You did not enter a valid game choice.");
                break;
        
    }
    
    }
    
    }
    
    }