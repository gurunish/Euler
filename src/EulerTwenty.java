import java.math.BigInteger;

/**
 * Created by Nishant on 17/01/2017.
 */
public class EulerTwenty {
    public static void main(String[] args){
        BigInteger l = BigInteger.valueOf(1);
        for(int i=2; i<=100;i++){
            l = l.multiply(BigInteger.valueOf(i));
        }
        String string = ""+l;

        System.out.println(string);
        int sum=0;
        for(int i=0;i<string.length(); i++){
            String temp = "";
            temp += string.charAt(i);
            sum+= Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}