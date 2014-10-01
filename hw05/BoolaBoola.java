//
//Fritz Isaac
//Boola Boola Program
//program will receive choice of burger, soda, or fries
//program will prompt user to choose options depending on original choice
//program will display total choice

//not sure if variables were to be literally named true or false

    import java.util.Scanner; //import scanner class

    public class BoolaBoola
    {
        public static void main (String [] args)
        {
        Scanner myScanner; //declare instance of Scanner
        myScanner = new Scanner(System.in); //declare input
        //prompt first choice
        boolean money = true;
        boolean power = false;
        boolean respect = true;
        boolean result = (money && power || respect);
        
        System.out.print("Is money && power || respect true (T/t) or false (F/f)? ");
        String answer = myScanner.next();
        
        switch(answer)
        {
            case "T":
                System.out.println("Correct");
                break;
                
            case "t":
                System.out.println("Correct");
                break;
                
            case "F":
                System.out.println("Wrong! Try again.");
                break;
                
            case "f":
                System.out.println("Wrong! Try again.");
                break;
                
            default:
                System.out.println("Wrong! Try again.");
        }
        
        }
        
    }