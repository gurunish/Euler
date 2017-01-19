/**
 * Created by Nish on 19/01/2017.
 */
import java.util.ArrayList;

public class EulerTwelve {
    public static void main(String[] args){
        ArrayList<Long> longer = new ArrayList<Long>();
        longer.add(1l);
        long n = 2;

        while(true){
            longer.add(n+longer.get(longer.size()-1));
            long recent = longer.get(longer.size()-1);
            n++;
            if(countDivisor(recent)){
                System.out.println(recent);
                System.exit(1);
            }
        }
    }

    public static Boolean countDivisor(long number){
        int div = 0;
        for(long i = 1; i*i<=number; i++){
            if(number%i==0){
                div++;
            }
        }
        div = div*2;
        System.out.println(number + " " + div);
        return (div >500);
    }
}