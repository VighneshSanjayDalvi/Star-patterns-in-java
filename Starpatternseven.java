public class Starpatternseven {
    
    public static void main(String args[]){
        System.out.println("1\n23\n456\n78910\n1112131415\n\n\n\n");

        /*
            1
            2  3
            4  5  6
            7  8  9  10
            11  12  13  14  15
         */

        int counter=1;

        for (int i=1;i<=5 ; i++){
            for(int j=1; j<=5;j++){
                if (j<=i){
                    System.out.print(" "+counter+" ");
                    counter++;
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
