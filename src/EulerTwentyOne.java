import java.util.ArrayList;

/**
 * Created by Nishant on 17/01/2017.
 */
public class EulerTwentyOne {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> ints = new ArrayList<Integer>();

        for (int i = 1; i < 10000; i++) {
            int dOfi = sumDivisor(i);
            if(sumDivisor(dOfi)==i && !ints.contains(i) && i!= dOfi){
                ints.add(i);
                sum+=i;
                System.out.println("When i is " + i + ", d(i) is " + dOfi);
            }
        }
        System.out.println(sum);
    }

    public static int sumDivisor(int n){
        int sum = 0;
        for(int i =1; i<=n/2; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}