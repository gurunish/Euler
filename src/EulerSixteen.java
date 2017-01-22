import java.math.BigInteger;

/**
 * Created by Nish on 22/01/2017.
 */
public class EulerSixteen {
    public static void main(String[] args){
        BigInteger n = BigInteger.valueOf(2);
        BigInteger two = n;

        for(int i=1;i <1000;i++){
            n = n.multiply(two);
        }

        String s = ""+n;
        int sumDigits = 0;
        for(int i=0; i<s.length();i++){
            String temp = ""+s.charAt(i);
            sumDigits += Integer.parseInt(temp);
        }
        System.out.println(sumDigits);
    }
}
