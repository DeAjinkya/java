public class pattern9{
    public static void main(String[] args){
        //outer loop
        int n = 5;
        for(int i = 1; i<=n; i++){
            //inner loop
            for(int j = 1; j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

/** floyd's triangle
 *  1 
    0 1 
    1 0 1 
    0 1 0 1 
    1 0 1 0 1
 */