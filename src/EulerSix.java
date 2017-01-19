/**
 * Created by Nish on 19/01/2017.
 */
public class EulerSix {
    public static void main(String []args){
        long sum = 0;
        long sqSum = 0;
        for(int i =1; i<101; i++){
            sum += i*i;
        }
        for(int i =1; i<101; i++){
            sqSum += i;
        }
        sqSum = sqSum * sqSum;
        System.out.println(sqSum - sum);
    }
}