public class Starpatternsix {
    
    public static void main(String args[]){
        System.out.println("12345\n1234\n123\n12\n1\n\n\n");

            // 12345
            // 1234
            // 123
            // 12
            // 1


        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=6-i){
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
