/**
 * Created by Nishant on 17/01/2017.
 */
public class EulerFour {
    public static void main(String[] args){
        int max = 0;
        for(int i=100; i<1000; i++){
            for(int j=100; j<1000; j++){
                int product = i*j;
                if(isPalindrome(product) && product>max){
                    max = product;
                }
            }
        }

        System.out.println(max);
    }
    public static Boolean isPalindrome(int a){
        if(a/10<1){
            return false;
        } else{
            String original = ""+ a;
            int digits = 0;
            while(true){
                if((a/10)>=1){
                    digits++;
                    a = a/10;
                } else {
                    break;
                }
            }

            String reverse = "";
            for(int i=original.length()-1; i>=0;i--){
                reverse+= original.charAt(i);
            }

            if(reverse.equals(original)){
                return true;
            } else {
                return false;
            }
        }
    }
}
