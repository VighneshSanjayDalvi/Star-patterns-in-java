public class Starpatterneight {

    /*
     1
     01
     010
     1010
     10101
     */

    public static void main (String args[]){
        System.out.println("1\n01\n010\n1010\n10101\n\n\n");

        int counter=1;


        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print(counter);
                    if(counter==1){
                        counter=0;
                    }
                    else{
                        counter=1;
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
