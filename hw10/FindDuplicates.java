import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); //prompt input
      for(int j=0;j<10;j++){ 
        num[j]=scan.nextInt(); //set array values equal to input values
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has "; //duplicates present
      }
      else{
        out+="does not have "; //duplicates not present
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has "; //exactly one duplicate present
      }
      else{
        out+="does not have ";  //not exactly one duplicate present
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int num[]){ //check for duplicates
    for (int i=0;i<num.length;i++){ //
      for (int j=i+1;j<num.length;j++){
        if (num[j]==num[i]){
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean exactlyOneDup(int num[]){
    int x=0;
    for (int i=0;i<num.length;i++){ //
      for (int j=i+1;j<num.length;j++){
        if (num[j]==num[i]){
          x++;
        }
      }
    }
    if (x==1){
      return true;  
    }
    else{
      return false;
    }
  } 
}


/*Sample Output:

Enter 10 ints- 1 23 1 3 4 5 6 7 8 9 
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has duplicates.
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 3 4 5 6 7 8 9 0
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have duplicates.
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 1 2 3 4 5 8 9 7
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} has duplicates.
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- n
*/
