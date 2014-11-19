import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        //simulateOdds();
    }
  
    public static void showHands(){
        int deck[]=new int[52];
        for (int a = 0;a<deck.length;a++){
            deck[a]=a;
        }
        int hand[]=new int[5];
        for (int b=0;b<hand.length;b++){
            hand[b]=-1;
        }
        String clubs="Clubs: ";
        String diamonds="Diamonds: ";
        String hearts="Hearts: ";
        String spades="Spades: ";
        String x="";
        for (int total = 52, handz=0; total>47;total--,handz++){
            int rand = (int)(Math.random() * total);
            int val = deck[rand];
            hand[handz]=val; //set hand vals to random pick
            deck[rand]=deck[total-1]; //sets end of deck to old pick 
            int suit = val/13;
            int rank = val%13;
            
            switch(rank){
                case 0:
                    x="A";
                    break;
                case 1:
                    x="K";
                    break;
                case 2:
                    x="Q";
                    break;  
                case 3:
                    x="J";
                    break;
                case 4:
                    x="10";
                    break;  
                case 5:
                    x="9";
                    break;  
                case 6:
                    x="8";
                    break;  
                case 7:
                    x="7";
                    break;
                case 8:
                    x="6";
                    break;  
                case 9:
                    x="5";
                    break;  
                case 10:
                    x="4";
                    break;  
                case 11:
                    x="3";
                    break;  
                case 12:
                    x="2";
                    break;  
            }
            switch (suit){
                case 0:
                    clubs+="\t" +x;
                    break;
                case 1:
                    diamonds+="\t" +x;
                    break;
                case 2:
                    hearts+="\t" +x;
                    break;
                case 3:
                    spades+="\t" +x;
                    break;
            }
            
        }
        System.out.println(clubs);
        System.out.println(diamonds);
        System.out.println(hearts);
        System.out.println(spades);
    }
}

/*Clubs:    J 4 
Diamonds: 
Hearts:   J 7 4 
Spades:   

Go again? Enter 'y' or 'Y', anything else to quit- y
Clubs:    Q 2 
Diamonds: A 
Hearts:   5 
Spades:   J 

Go again? Enter 'y' or 'Y', anything else to quit- q
  rank   freq of exactly one pair
    A       312
    K       307
    Q       339
    J       325
   10       323
    9       334
    8       363
    7       312
    6       339
    5       349
    4       328
    3       293
    2       327
----------------------------
 total not exactly one pair: 5749
*/