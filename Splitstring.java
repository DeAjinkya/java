public class Splitstring{
    public static void main(String[] args){
        String s = "Hello,Good,Morning";
        String[] b = s.split(",");
        for(String a: b){
            System.out.println(a);
        }
    }
}