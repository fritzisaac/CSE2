///////////////////////////////////////////////
//Fritz Isaac
//Time Padding Program
//program will receive number of seconds as an int and print conventional time in hours minutes and seconds

    import java.util.Scanner; //import the Scanner class
    
    public class TimePadding{
    public static void main(String[] args){
        
        Scanner myScanner; //declares instance of scanner
        myScanner = new Scanner(System.in); 
        
        System.out.print("Enter the number of seconds: ");
        int second = myScanner.nextInt(); //gives number of seconds a variable
        int hours = second/3600; //divides seconds into hours
        int remainder = second%3600; //gives seconds left after division into hours
        int minutes = remainder/60; //divides remaining seconds into minutes
        int seconds = second%60; //gives seconds left after division into minutes
        
        System.out.println("The time is "+hours+": "+minutes+": "+seconds); //output time
    }
    }