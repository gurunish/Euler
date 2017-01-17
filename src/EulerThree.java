/**
 * Created by Nishant on 16/01/2017.
 */
public class EulerThree {
    public static void main(String[] args){
        long l = 600851475143l;
        long max = 0;
        if(isPrime(l)){
            System.out.println("1");
        } else {
            for(int i = 3; i<Math.sqrt(l); i+=2){
                if(l%i==0 && i>max & isPrime(i)){
                    max = i;
                }
            }
            System.out.println(max);
        }
    }

    public static Boolean isPrime(long i){
        if(i%2==0)
            return false;
        else{
            for(int x=3; x< Math.sqrt(i); x+=2){
                if(i%x ==0){
                    return false;
                }
            }
        }
        return true;
    }
}
