////////////////////////////////////////////////////////////
//Fritz Isaac
//Cyclometer Java Program
//NOTE-ENTIRE PROGRAM COMPLETED BEFORE SAVE ERROR.-THIS VERSION COPIED THEN EDITED
// program will print

//      # of mins each trip
//      # of counts each trip
//      distance of trip in miles
//      distance of two trips combined

//  javac Cyclometer.java

//  java Cyclometer//

//  define class
    public class Cyclometer{
//  main method required for every Java program
    public static void main(String [] args){

    int secsTrip1=480; // # of secs for Trip1
    int secsTrip2=3220; // # of secs for Trip2
    int countsTrip1=1561; // # of counts for Trip1
    int countsTrip2=9037; //# of counts for Trip2 
    double wheelDiameter=27.0, //diameter of wheel to calculate distance
    PI=3.14159, // value of pi to calculate distance
    feetPerMile=5280, // # of feet in a mile    
    inchesPerFoot=12, // # of inches in a foot
    secondsPerMinute=60; // # of seconds in a minute
    double distanceTrip1, distanceTrip2,totalDistance;
System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");

//  equations for trip distance
distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Converts to distance in miles 
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
// above calculates distance in inches and converts to miles using constants
totalDistance=distanceTrip1+distanceTrip2;
System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
System.out.println("Trip 2 was "+distanceTrip2+" miles"); 
System.out.println("The total distance was "+totalDistance+" miles");
} //end of method 
} //end of class
    
    

