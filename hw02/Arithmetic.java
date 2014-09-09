/////////////////////////////////////////////////
//Fritz Isaac
//hw02 Arithmetic Program

//program will calculate total cost of Wal-Mart items including sales tax

//javac Arithmetic.java

//java Arithmetic//

//define class
    public class Arithmetic{
        
    public static void main(String [ ] args){

//number of pairs of socks
    int nSocks=3;
//cost per pair of socks
//('$' is part of the variable name)
    double sockCost$=2.58;

//number of drinking glasses
    int nGlasses=6;
//cost per glass
    double glassCost$=2.29;
    
//number of boxes of envelopes
    int nEnvelopes=1;
//cost per box of envelopes
    double envelopeCost$=3.25;

//sales tax percentage
    double taxPercent=0.06;

//eequations
    double taxSock$=taxPercent*sockCost$*100, //tax on socks
    taxGlass$=taxPercent*glassCost$*100, //tax on glasses
    taxEnvelope$=taxPercent*envelopeCost$*100, //tax on envelopes
   
    noTaxCostSock$=nSocks*sockCost$, //total cost of socks without tax
    noTaxCostGlass$=nGlasses*glassCost$, //total cost of glasses without tax
    noTaxCostEnvelope$=nEnvelopes*envelopeCost$, //total cost of envelopes without tax
   
    noTaxTotalCost$=(noTaxCostEnvelope$+noTaxCostGlass$+noTaxCostSock$)*100, //total cost of items without tax
    taxTotalCost$=((taxPercent*noTaxTotalCost$)+noTaxTotalCost$); //total amount paid for items plus sales tax
    
    int tS$ = (int)taxSock$;
    int tG$=(int)taxGlass$;
    int tE$=(int)taxEnvelope$;
    int nTTC$=(int)noTaxTotalCost$;
    int tTC$=(int)taxTotalCost$;
    
    double tS1$= (double)tS$/100;
    double tG1$=(double)tG$/100;
    double tE1$=(double)tE$/100;
    double nTTC1$=(double)nTTC$/100;
    double tTC1$=(double)tTC$/100;

    
    
//print no tax item costs
System.out.println("I purchased "+nSocks+" socks at a price of "+sockCost$+" dollars each. "); //# of socks purchased & ind. price
System.out.println("I purchased "+nGlasses+" glasses at a price of "+glassCost$+" dollars each. "); //# of glasses purchased & ind. price
System.out.println("I purchased "+nEnvelopes+" envelope at a price of "+envelopeCost$+" dollars. "); //# of envelopes purchased & ind. price

System.out.println("The socks cost "+noTaxCostSock$+" dollars plus "+tS1$+" in tax dollars."); //total cost of socks and tax for this cost
System.out.println("The glasses cost "+noTaxCostGlass$+" dollars plus "+tG1$+" in tax dollars."); //total cost of glasses and tax for this cost
System.out.println("The envelope cost "+noTaxCostEnvelope$+" dollars plus "+tE1$+" in tax dollars."); //total cost of envelopes and tax for this cost
System.out.println("The purchase cost "+nTTC1$+" dollars total without tax."); //total purchase cost without tax
System.out.println("The total cost of my purchase with tax was "+tTC1$+" dollars." ); //total purchase cost with tax
        
    }
    }