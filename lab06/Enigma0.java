//
//Fritz Isaac
//Enigma0 Bug Fix
//
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
    
    switch(k+p+q+r){
      case 25: 
        System.out.println("sum is 25");
      
      default:
        System.out.println("To repeat, you entered "+n);
        break;
    }
    }
    else{
      System.out.println("You did not enter an int.");
    }
  }
}

/* Error report:
 *  compiler error where final statement was not in same scope as initialization of variable "n"  
 *  original program had fallthrough so that if case 24 occurred, 
        the result of case 25 would occur as well (runtime error)
 *   
 */  

