//Fritz Isaac
//hw11
//Poker Hands Program

import java.util.Scanner;

public class PokerHands{
    public static void main(String[]args){
        Scanner drone=new Scanner(System.in);
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- "); //prompt choice to enter hand
        String yes = drone.nextLine(); //intialize variable for yes
        if(yes.equals("y")||yes.equals("Y")){ //if user chooses to continue
            int [] hand = new int[5];
            for(int five=0;five<5;five++){
                int card=0;
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); //prompt suit entry
                String suit=drone.next();
                switch(suit){
                    case "c": card=0;
                    break;
                    case "d": card=13;
                    break;
                    case "h": card=26;
                    break;
                    case "s": card=39;
                    break;
                    default: System.out.println("You did not enter a valid response.");
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); //prompt suit entry
                    suit=drone.next();
                    switch(suit){
                        case "c": card=0;
                        break;
                        case "d": card=13;
                        break;
                        case "h": card=26;
                        break;
                        case "s": card=39;
                        break;
                    }
                }
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
                String rank = drone.next();
                switch(rank){
                    case "a": card+=0;
                    break;
                    case "k": card+=1;
                    break;
                    case "q": card+=2;
                    break;
                    case "j": card+=3;
                    break;
                    case "10": card+=4;
                    break;
                    case "9": card+=5;
                    break;
                    case "8": card+=6;
                    break;
                    case "7": card+=7;
                    break;
                    case "6": card+=8;
                    break;
                    case "5": card+=9;
                    break;
                    case "4": card+=10;
                    break;
                    case "3": card+=11;
                    break;
                    case "2": card+=12;
                    break;
                    default: System.out.println("Invalid input");
                    continue;
                }
                
                hand[five]=card;
            }  
            
            showOneHand(hand);
            
            int x=0,y=0;
            for (int i=0;i<hand.length;i++){ //
                for (int j=i+1;j<hand.length;j++){
                    if (hand[j]%4==hand[i]%4){
                        x++;
                    }
                    else if((hand[j]%4)==(hand[i]%4)){
                       y++; 
                    }
                }
            }
            
            
            
            
            switch(x){
                case 1: System.out.println("One Pair");
                break;
                case 2: System.out.println("Two Pair");
                break;
                case 3: System.out.println("Full House");
                break;
                case 4: System.out.println("Four of a Kind");
                break;
                default:
                break;
            }
            
            switch(y){
                case 5:
                    int p=0;
                    for(int f=0;f<hand.length;f++){
                        if((hand[f]%13)==0){
                            p++;
                        }
                        if((hand[f]%13)==1){
                            p++;
                        }
                        if((hand[f]%13)==2){
                            p++;
                        }
                        if((hand[f]%13)==3){
                            p++;
                        }
                        if((hand[f]%13)==4){
                            p++;
                        }
                    }
                if(p==5){
                    System.out.println("Royal Flush");
                }
                break;
                case 2: System.out.println("Two Pair");
                break;
                
            }
            
        }
        
    }
    
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
    	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      	    "4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){
      	out+=suit[s];
      	for(int rank=0;rank<13;rank++)
        	for(int card=0;card<5;card++)
         	if(hand[card]/13==s && hand[card]%13==rank)
          	out+=face[rank];
      	out+='\n';
    	}
    	System.out.println(out);
    }
}
