//Fritz Isaac
//Blocked Again Program
//nest methods for modular programming

import java.util.Scanner; //import scanner class
public class BlockedAgain{
    
    public static void main(String []s){
        int m;
        m = getInt(); //force user to enter int in range 1-9, inclusive.  
        allBlocks(m);
    }

    public static int getInt(){
        Scanner nanner = new Scanner(System.in);
        System.out.print("Enter an in int between 1 and 9, inclusive: ");
        int m = nanner.nextInt();
        m=checkInt(m);
        return checkRange(m);
    }
    
    public static int checkInt(int m){
        Scanner nanner = new Scanner(System.in);
        if (m != (int) m){
            System.out.print("You did not enter an int; try again: ");
            m = nanner.nextInt();
            return m;
        }
        else {
            return m;
        }
    }
    
    public static int checkRange(int m){
        while (m > 9 || m < 1){
            Scanner nanner = new Scanner(System.in);
            System.out.print("You did not enter an int in [1,9]; try again: ");
            m = nanner.nextInt();
        }
        return m;
    }
    
    
    public static void allBlocks(int m){
        block(m);
    }
    
    public static void block(int m){
        line(m);   
    }
    
    public static void line(int m){
        for (int counter1 = 1; counter1 < (m + 1); counter1++) { //for each number group
                
                for (int counter2 = counter1; counter2 > 0; counter2--) { //for each row
                    
                    for (int spaces = 0; spaces < (m - counter1); spaces++) { // for the spaces
                        System.out.print(" ");
                    }
                    
                    for (int counter3 = 0; counter3 < counter1 + (counter1 - 1); counter3++) { //for each column
                        System.out.print(counter1); //print number
                    }
                    System.out.println(""); //end row
                }
            
                for (int spaces = 0; spaces < (m - counter1); spaces++) { //for the tab spaces
                    System.out.print(" ");
                }
                
                for (int counter3 = 0; counter3 < counter1 + (counter1 - 1); counter3++) { //for the tabs to be printed
                    System.out.print("-");
                }
                System.out.println("");
        }
    }
    
    
    
    
}
