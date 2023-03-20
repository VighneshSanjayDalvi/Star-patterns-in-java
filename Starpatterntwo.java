public class Starpatterntwo {

    public static void main(String args[]){


        /*
        
        *   
        **
        ***
        ****

         */

        System.out.println("*\n**\n***\n****\n\n\n\n");


        int n=4 , m=4;

        for (int i=1 ; i<=n;i++ ){
            for(int j=1; j<=m;j++){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
