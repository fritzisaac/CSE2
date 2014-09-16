//////////////////////////////////////
//Fritz Isaac
//hw03 Bicycle

//program will receive input from user 
    //(number of counts on a cyclometer, then number of seconds)
//output is distance traveled and average miles per hour

import java.util.Scanner; //import class

//define class
public class Bicycle{
//main method    
public static void main (String [ ] args) {
    Scanner myScanner = new Scanner(System.in); //construction of class
    
    System.out.print ("Enter the number of seconds:"); //command user to enter seconds
        int timeSeconds = myScanner.nextInt(); //declare number of seconds variable
    System.out.print ("Enter the number of counts:"); //command user to enter number of counts  
        int numberCounts = myScanner.nextInt(); //declare number of counts variable
        
//declare values of variables for calculations
    double wheelDiameter=27.0, //diameter of wheel
    PI=3.14159, //value of PI
    feetPerMile=5280, //# of feet in a mile
    inchesPerFoot=12, //# of inches in a foot
    secondsPerMinute=60; //# of seconds in a minutes

    double timeMinutes= (double) (timeSeconds/secondsPerMinute); //cast seconds to minutes
//declare variables for distance in miles and speed in mph
    double distance, speedMPH;
    
//calculations
    distance=(numberCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile)*100; //calculate distance
    speedMPH=(distance/(timeMinutes/60)); //calculate speed 
    
    
    int distanceInt= (int) distance;
    int speedInt= (int) speedMPH;
    double distanceFinal= (double) distanceInt/100; //rounds distance to two decimal places
    double speedFinal= (double) speedInt/100; //rounds speed to two decimal places

//print results
    System.out.println ("The distance was "+(distanceFinal)+" miles and took "+(timeMinutes)+" minutes.");
    System.out.println ("The average mph was "+(speedFinal));
    
    
} //end of main method
} //end of class