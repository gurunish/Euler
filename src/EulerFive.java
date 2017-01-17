/**
 * Created by Nishant on 17/01/2017.
 */
public class EulerFive {
    public static void main(String[] args){
        long product = 2l;

        for(int i=3; i<21; i+=2){
            product*=i;
        }
        System.out.println(product);
    }
}
