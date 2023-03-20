public class Starpatternfive {

    public static void main (String args[]){
        System.out.print("1\n12\n123\n1234\n\n");

        // 1   
        // 12
        // 123
        // 1234


        for(int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }



    }
    
}
