public class Starpatternnine {


    /*
        1                  *****
     0 1                *****
     1 0 1              *****  
     0 1 0 1            *****
     1 0 1 0 1          *****

     i   j   x   
     1   1   1   i+j- even - 1  
     2   1   0   i+j - odd - 0
     2   2   1
      
    */


    /*
        1    
        01
        101
        0101
        10101
     */
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int k=i+j;
                if(j<=i){
                    if(k%2==0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
        
    }
     
}
