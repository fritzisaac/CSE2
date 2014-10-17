//
//Fritz Isaac
//
//Root Program
//
//program will receive double > 0 and use bisection algorithm to print square root


import java.util.Scanner;

public class Root{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter a double greater than 0: ");
        
        if(myScanner.hasNextDouble()){
            double x = myScanner.nextDouble();
            
            if(x>0){
                double low = 0;
                double high = 1+x;
                
                
                while((high-low)>(.1)){
                    double middle = (((high-low)/2)+low);
                    
                    if((middle*middle)>x){
                    high = middle;
                    }
                
                    else{
                    low = middle;
                    }
                }
            System.out.println(+(((high-low)/2)+low));    
            }
            
            else{
                System.out.println("Double input must be positive.");
            }
        }
        
        else{
            System.out.println("nput must be a double.");
        }
    }
}