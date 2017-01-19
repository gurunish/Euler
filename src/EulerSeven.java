/**
 * Created by Nish on 19/01/2017.
 */
public class EulerSeven {
    public static void main(String[] args){
        long[] primes = new long[10001];
        long number = 2;
        int pos = 0;
        while(true){
            if(isPrime(number)){
                primes[pos] = number;
                pos++;
            }
            number++;
            if(primes[10000]!=0)
                break;
        }
        System.out.println(primes[10000]);
    }

    public static Boolean isPrime(long n) {
        long numD = 0;

        for (long i = 1; i <= n; i++) {
            if (n % i == 0) {
                numD++;
            }
        }
        if (numD == 2)
            return true;
        else
            return false;
    }
}