//Fritz Isaac
//Arrays Program
//

import java.util.Scanner;
public class Arrays{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        final int NUM_INPUTS = 10;
        int [] arrayLab; //declare array
        arrayLab = new int [NUM_INPUTS]; //allocation of array
        System.out.println("Enter 10 ints- "); //prompt user input
        
        //initialize array data
        for (int i = 0; i <10;i++){
        arrayLab[i]=scan.nextInt();
        }
        //search for highest
        int max=arrayLab[0];
        for (int j = 0; j<arrayLab.length; j++){
            if (arrayLab[j] > max){
                max = arrayLab[j];
            } 
        }
        //search for lowest
        int min=arrayLab[0];
        for (int k = 0; k<arrayLab.length; k++){
            if (arrayLab[k] < min){
                min = arrayLab[k];
            } 
        }
        //find sum
        int sum = 0;
        for (int f = 0; f<arrayLab.length; f++){
            sum+=arrayLab[f];
        }
        
        System.out.println("The highest entry is "+max); //print max
        System.out.println("The lowest entry is "+min); //print min
        System.out.println("The sum is "+sum); //print sum
        
        for (int x = 0, y=9; x<arrayLab.length; x++, y--){
            System.out.println (arrayLab[x]+"\t"+arrayLab[y]);
        }
    }
}