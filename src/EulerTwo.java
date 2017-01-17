import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nishant on 28/11/2016.
 */
public class EulerTwo {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        int sum = 2;

        while(true){
            int minusOne= integers.get(integers.size()-1);
            int minusTwo= integers.get(integers.size()-2);
            int next = minusOne+minusTwo;
            if(next<4000000){
                integers.add(next);
                if(integers.size()%2==0){
                    sum+= integers.get(integers.size()-1);
                }
            }
            else
                break;
        }

        System.out.println(sum);
    }
}