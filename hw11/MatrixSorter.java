//Fritz Isaac
//Matrix Sorter hw11
//

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][]; 
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }

    public static int[][][] buildMat3d(){
        int[][][]matrix=new int[3][][];
        for (int a=0;a<3;a++){ //initialize 2D arrays
            matrix[a]=new int [3+2*a][]; //2D arrays sized 3,5,7; 
            for (int b=0; b<matrix[a].length;b++){ 
                matrix[a][b] = new int[ a+b+1]; 
            }
        }
        for(int z=0;z<matrix.length;z++){
            for (int x = 0;x<matrix[z].length;x++){ //cycles through member arrays
                for (int y=0; y<matrix[z][x].length;y++){ //cycles through member ints 
                    matrix[z][x][y]=(int) ((Math.random() * 99)+1); //random 1-99 inclusive
                }
            }
        }
        return matrix;
    }
    
    public static void show(int[][][]matrix){
        for(int z=0;z<matrix.length;z++){
            System.out.println("---------Slab "+(z+1));
            for (int x = 0;x<matrix[z].length;x++){ //cycles through member arrays
                for (int y=0; y<matrix[z][x].length;y++){ //cycles through member ints 
                    System.out.print(matrix[z][x][y]+" ");
                }
                System.out.println("");
            }
        }
    }
    
    public static int findMin(int[][][]matrix){
        int currentMin=matrix[0][0][0];
        for(int z=0;z<matrix.length;z++){
            for (int x = 0;x<matrix[z].length;x++){ //cycles through member arrays
                for (int y=0; y<matrix[z][x].length;y++){ //cycles through member ints 
                    if(matrix[z][x][y]<currentMin){
                        currentMin=matrix[z][x][y];    
                    }
                }
            }
        }
        return currentMin;
    }
    
    public static void sort(int[][]twoDee){
        for (int z=0; z<twoDee.length;z++){
            for (int i=0;i<twoDee[z].length;i++){
                int currentMin=twoDee[z][i];
                int currentMinIndex=i;
                
                for(int j = i+1; j<twoDee[z].length;j++){
                    if (currentMin>twoDee[z][j]){ // if value less than current min
                        currentMin=twoDee[z][j]; //value becomes new min
                        currentMinIndex=j;
                    }  
                }
                if(currentMinIndex!=i){ //if there has been a change..
                    twoDee[z][currentMinIndex]=twoDee[z][i];
                    twoDee[z][i]=currentMin;
                }
                
            }
            
        }
        
        /*for (int p = 1; p <= twoDee.length; p++){ //cycle rows
            int currentMin = twoDee[0][0];
            int currentMinIndex=0;
            
                if (twoDee[p][0]<currentMin){
                    currentMin=twoDee[p][0];
                    currentMinIndex=p;
                }
                if(currentMinIndex!=0){ //if there has been a change..
                    twoDee[currentMinIndex]=twoDee[p-1];
                    twoDee[p]=twoDee[currentMinIndex];
                }
            
        }
        */
        
        
    }
          
}

/*Sample output :
---------------------------Slab 1
27
68 45
76 13  4
---------------------------Slab 2
32 11
20 81 68
34 74 18 46
79 20 22 11  9
91 30 55 21 28 40
---------------------------Slab 3
33 54 74
54 59 65 47
42 41 98 31  5
13 90  6  1 29  3
39 40 58 62 33 23 14
32  4 12 72 11 27 95 78
39 16 84 66 20  9 34  2 62
---------------------------
The smallest entry in the 3D matrix is 1
After sorting the 3rd slab we get
---------------------------Slab 1 unsorted
27
68 45
76 13  4
---------------------------Slab 2 unsorted
32 11
20 81 68
34 74 18 46
79 20 22 11  9
91 30 55 21 28 40
---------------------------Slab 3 sorted
 1  3  6 13 29 90
 2  9 16 20 34 39 62 66 84
 4 11 12 27 32 72 78 95
*/