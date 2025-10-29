class palin {
    public static void isPalindrome(int x) {
        if(x<0){
            System.out.println(x+" not a palindrome");
        }

        int n = x;

        int revNum = 0;

        while(n>0){
            int d = n%10;

            revNum = revNum*10 + d;

            n = n/10;
        } 

        if(revNum == x){
            System.out.println(revNum +" is a palindrome");
        }else{
            System.out.println(revNum +" not a palindrome");
        }
    }

    public static void main(String args[]){
        isPalindrome(121);
        isPalindrome(10);
        isPalindrome(-121);
    }
}