//Fritz Isaac
//Array Lab 13
//

public class Ragz{
    public static void main(String[]args){
        int [][] rag = new int [5][]; //whole array length 5
        for (int a = 0; a<rag.length;a++){ 
            rag[a] = new int[(a*3)+5]; //member array lengths increment +3, starting at 5
        }
        System.out.println("The array before sorting");
        for (int x = 0;x<rag.length;x++){ //cycles through member arrays
            for (int y=0; y<rag[x].length;y++){ //cycles through member ints 
                rag[x][y]=(int) (Math.random() * 40); //random 0-39 inclusive
                System.out.print(rag[x][y]+" "); //print array member
            }
            System.out.println(""); //switch line
        }
        System.out.println(""); //gap
        System.out.println("The array after sorting");
        
        for (int z=0; z<rag.length;z++){
            for (int i=0;i<rag[z].length;i++){
                int currentMin=rag[z][i];
                int currentMinIndex=i;
                
                for(int j = i+1; j<rag[z].length;j++){
                    if (currentMin>rag[z][j]){ // if value less than current min
                        currentMin=rag[z][j]; //value becomes new min
                        currentMinIndex=j;
                    }  
                }
                if(currentMinIndex!=i){ //if there has been a change..
                    rag[z][currentMinIndex]=rag[z][i];
                    rag[z][i]=currentMin;
                }
                System.out.print(rag[z][i]+"  "); //print array member
            }
            System.out.println(""); //switch line
        }    
    }
}