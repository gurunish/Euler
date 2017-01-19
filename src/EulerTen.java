/**
 * Created by Nish on 19/01/2017.
 */
public class EulerTen {
    public static void main(String[] args){
        long i = 3;
        long sum = 2;
        while(true){
            if(isPrime(i)) {
                sum += i;
            }
            i+=2;

            if(i>=2000000){
                System.out.println(sum);
                break;
            }
        }
    }

    public static Boolean isPrime(long i){
        if(i%2==0 || i<2)
            return false;
        else {
            for (int x = 3; x <= Math.sqrt(i); x += 2) {
                if (i % x == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
