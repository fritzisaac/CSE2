//////////////////////////////////////////////////////////////
//Fritz Isaac
//
//Income Tax Program
// program will receive income in thousands of dollars and display:
    //tax rate
    //tax amount
    
    import java.util.Scanner; //import Scanner
    
    public class IncomeTax{
    
    public static void main(String [] args){
        
    Scanner myScanner; //declare instance of Scanner
    myScanner=new Scanner(System.in); //
    
    System.out.print("Enter an int giving the number of thousands-");
    
    if (Scanner.hasNextInt()) {
        int nBands = myScanner.nextInt(); 
        
        if ( nBands > 0 && nBands < 20 ) {
        int taxRate = 05;
        System.out.println("The tax rate on $" +(nBands*1000)+ " is %"+(taxRate)+", and the tax is $"+(nBands*10*taxRate));
        }
    else
        if ( nBands >= 20 && nBands < 40) {
        int taxRate = 07;
        System.out.println("The tax rate on $" +(nBands*1000)+ " is %"+(taxRate)+", and the tax is $"+(nBands*10*taxRate));
        }
    else
        if ( nBands >= 40 && nBands < 78) {
        int taxRate = 12;
        System.out.println("The tax rate on $" +(nBands*1000)+ " is %"+(taxRate)+", and the tax is $"+(nBands*10*taxRate));
        }
    else
        if ( nBands >= 78 ) {
        int taxRate = 14;
        System.out.println("The tax rate on $" +(nBands*1000)+ " is %"+(taxRate)+", and the tax is $"+(nBands*10*taxRate));
      }}
        
    }
    }