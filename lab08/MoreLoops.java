//Fritz Isaac
//More Loops Program

import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;

	//System.out.print("Enter an int- ");
	//while(!scan.hasNextInt()){
	    //scan.next(); //get rid of the junk entered by user
	    //System.out.print("You did not enter an int; try again- ");
	//}
	
	//COMMENTED OUT 5 LINES AND REPLACED THE CODE WITH A 
	//DO-WHILE LOOP (below)
	
	System.out.print("Enter an int- ");
	do{
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");  
	}
	while(!scan.hasNextInt());
	
	
        
        
        n=scan.nextInt();

	//for(int j=0;j<n && j<40;j++){
	    //for(int k=0;k<j+1;k++){
		//System.out.print('*');
	    //}
	    //System.out.println();
	//}
	//COMMENTED OUT THE ABOVE SIX LINES OF CODE AND REPLACED WITH 
	//WHILE STATEMENTS (below)
      
	int j=0;
	while (j<n && j<40){
	    int k=0;
	    while(k<j+1){
	        System.out.print('*');
	        k++;
	    }
	    System.out.println();
	    j++;
	}
	
	
	int k=4;

	//do{
	  //  System.out.println("k="+k);
	    //k++;
	//}
        // while(k<4);
        //COMMENTED OUT THE ABOVE FIVE LINES AND REPLACED THE CODE
	//WITH A WHILE LOOP (below)

        while(k<4){
            System.out.println("k="+k);
            k++;
        }
        
        
        //while(true){
	    //switch(n){
	    //default: System.out.println(n + " is > 5 or <1");
		//break;
	    //case 1: 
	    //case 2: System.out.print("Case 2 "); 
		//continue;
	    //case 3: break;
	    //case 4: System.out.println("Case 4");
	    //case 5: System.out.println("Case 5");
		//break;
	    //}
	    //count++;
	    //if(count>10)
		//break;
	//}
	
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    int count=0;
    for(int x=1; x==1;count++){
    	while (n==1){
    		System.out.print("Case 2 "); 
    	}
    	while (n==2){
    		System.out.print("Case 2 "); 
    	}
    	if (n==3){
    		break;
    	}
    	else if (n==4){
    		System.out.println("Case 4");
    		System.out.println("Case 5");
			break;
    	}
    	else if (n==5){
    		System.out.println("Case 5");
			break;
    	}
    	else{
    		System.out.println(n + " is > 5 or <1");
			break;
    	}
    }

    }	
}