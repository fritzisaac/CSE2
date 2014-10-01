//
//Fritz Isaac
//Burger King Program
//program will receive choice of burger, soda, or fries
//program will prompt user to choose options depending on original choice
//program will display total choice

    import java.util.Scanner; //import scanner class

    public class BurgerKing
    {
        public static void main (String [] args)
        {
        Scanner myScanner; //declare instance of Scanner
        myScanner = new Scanner(System.in); //declare input
        //prompt first choice
        System.out.println("Enter one letter to indicate a choice of:"); 
        System.out.println("   Burger (B or b)");
        System.out.println("   Fries (F or f)");
        System.out.println("   Soda (S or s)");
        String choice1 = myScanner.next(); //name first input 
        
        //ensure user enters one character
        if (choice1.length() > 1 || choice1.length() < 1) 
        {
        System.out.println("Single character expected.");
        }
        
        //generate secondary prompts to possible choices    
        else
        {   
            switch(choice1)
            {
            
            case "B":
                {
                System.out.println("Enter A or a for all the fixins");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above");
                String choice2 = myScanner.next();
                
                //ensure user enters one character
                if (choice2.length() > 1 || choice2.length() < 1) 
                {
                System.out.println("Single character expected.");
                }
                
                //generate total choice
                else
                {
                    switch(choice2)
                    {
                    case "A":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    
                    case "a":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                      
                    case "C":
                        System.out.println("You ordered a burger with cheese.");
                        break;
                        
                    case "c":
                        System.out.println("You ordered a burger with cheese.");
                        break;
                        
                    case "N":
                        System.out.println("You ordered a plain burger.");
                        break;
                    
                    case "n":
                        System.out.println("You ordered a plain burger.");
                        break; 
                    
                    default:
                        System.out.println("You did not enter A, a, C, c, N, or n.");
                        break;
                    }
                }
                break;
                }
                
            case "b":
                {
                System.out.println("Enter A or a for all the fixins");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above");
                String choice2 = myScanner.next();
                //ensure user enters one character
                if (choice2.length() > 1 || choice2.length() < 1) 
                {
                System.out.println("Single character expected.");
                }
                
                //generate total choice
                else
                {
                    switch(choice2)
                    {
                    case "A":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    
                    case "a":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                      
                    case "C":
                        System.out.println("You ordered a burger with cheese.");
                        break;
                        
                    case "c":
                        System.out.println("You ordered a burger with cheese.");
                        break;
                        
                    case "N":
                        System.out.println("You ordered a plain burger.");
                        break;
                    
                    case "n":
                        System.out.println("You ordered a plain burger.");
                        break; 
                    
                    default:
                        System.out.println("You did not enter A, a, C, c, N, or n.");
                        break;
                    }
                }
                break;
                }
            
            case "F":
                {
                System.out.println("Do you want a large (L or l) or small (S or s) order of fries?");
                String choice2 = myScanner.next();
                //ensure user enters one character
                if (choice2.length() > 1 || choice2.length() < 1) 
                {
                System.out.println("Single character expected.");
                }
                
                //generate total choice
                else
                
                    switch(choice2)
                    {
                    case "L":
                        System.out.println("You ordered a large order of fries.");
                        break;
                    
                    case "l":
                        System.out.println("You ordered a large order of fries.");
                        break;
                      
                    case "S":
                        System.out.println("You ordered a large order of fries.");
                        break;
                        
                    case "s":
                        System.out.println("You ordered a large order of fries.");
                        break;
                    
                    default:
                        System.out.println("You did not enter L, l, S, or s.");
                        break;
                }
                break;
                }
            
            case "f":
                {
                System.out.println("Do you want a large (L or l) or small (S or s) order of fries?");
                String choice2 = myScanner.next();
                
                //ensure user enters one character
                if (choice2.length() > 1 || choice2.length() < 1) 
                {
                System.out.println("Single character expected.");
                }
                
                //generate total choice
                else
                
                    switch(choice2)
                    {
                    case "L":
                        System.out.println("You ordered a large order of fries.");
                        break;
                    
                    case "l":
                        System.out.println("You ordered a large order of fries.");
                        break;
                      
                    case "S":
                        System.out.println("You ordered a large order of fries.");
                        break;
                        
                    case "s":
                        System.out.println("You ordered a large order of fries.");
                        break;
                    
                    default:
                        System.out.println("You did not enter L, l, S, or s.");
                        break;
                    }
                break;    
                }
            
            case "S":
                {
                System.out.println("Do you want Sprite (S or s), Pepsi (P or p), Coke (C or c), or Mountain Dew (M or m)?");
                String choice2 = myScanner.next();
                //ensure user enters one character
                if (choice2.length() > 1 || choice2.length() < 1) 
                {
                System.out.println("Single character expected.");
                }
                
                //generate total choice
                else
                
                    switch(choice2)
                    {
                    case "S":
                        System.out.println("You ordered a Sprite.");
                        break;
                    
                    case "P":
                        System.out.println("You ordered a Pepsi.");
                        break;
                      
                    case "C":
                        System.out.println("You ordered a Coke.");
                        break;
                        
                    case "M":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite.");
                        break;
                    
                    case "p":
                        System.out.println("You ordered a Pepsi.");
                        break;
                      
                    case "c":
                        System.out.println("You ordered a Coke.");
                        break;
                        
                    case "m":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    default:
                        System.out.println("You did not enter S, s, P, p, C, c, M, or m.");
                        break;
                }
                break;
                }
            
            case "s":
                {
                System.out.println("Do you want Sprite (S or s), Pepsi (P or p), Coke (C or c), or Mountain Dew (M or m)?");
                String choice2 = myScanner.next();
                //ensure user enters one character
                if (choice2.length() > 1 || choice2.length() < 1) 
                {
                System.out.println("Single character expected.");
                }
                
                //generate total choice
                else
                
                    switch(choice2)
                    {
                    case "S":
                        System.out.println("You ordered a Sprite.");
                        break;
                    
                    case "P":
                        System.out.println("You ordered a Pepsi.");
                        break;
                      
                    case "C":
                        System.out.println("You ordered a Coke.");
                        break;
                        
                    case "M":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite.");
                        break;
                    
                    case "p":
                        System.out.println("You ordered a Pepsi.");
                        break;
                      
                    case "c":
                        System.out.println("You ordered a Coke.");
                        break;
                        
                    case "m":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    default:
                        System.out.println("You did not enter S, s, P, p, C, c, M, or m.");
                        break;
                }
                break;
                }
                
            default: 
                System.out.println("You did not enter B, b, F, f, S, or s.");
                break;
            }
            
            
            
        }
        
        }
   
    }