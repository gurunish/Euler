/**
 * Created by Nish on 19/01/2017.
 */
public class EulerFourteen {
    public static void main(String[] args){
        long longestChain = 1;
        int chainHolder = 1;
        for(int i =1; i<1000000; i++){
            long collatz = collatzNumber(i);
            System.out.println(i + " collatz is " + collatz);
            if(collatz>longestChain) {
                longestChain = collatz;
                chainHolder = i;
            }
        }
        System.out.print("Final answer is" + chainHolder);
    }

    public static long collatzNumber(long i){
        long total = 1;
        while(i!=1){
            if(i%2==0){
                i=i/2;
            }else {
                i= 3*i +1;
            }
            total++;
        }
        return total;
    }
}