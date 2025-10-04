public class pattern7{
    public static void main(String[] args){
        //outer loop
        int n = 5;
        for(int i = 1; i<=n; i++){
            //inner loop
            for(int j = 1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/** inverted half pyramid with numbers
 *  1 2 3 4 5 
    1 2 3 4
    1 2 3
    1 2
    1
 */