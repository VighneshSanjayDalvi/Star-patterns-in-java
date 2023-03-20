public class Starpattern {
    public static void main(String args[]){
        System.out.println("*****\n*****\n*****\n*****\n\n\n");


        for(int i =1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(j<=5 && j>=1){
                    System.out.print("*");
                }
                else{
                    System.out.println(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
}
