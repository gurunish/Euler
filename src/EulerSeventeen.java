/**
 * Created by Nish on 22/01/2017.
 */
public class EulerSeventeen {
    public static void main(String[] args){
        String[] ones={"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens={"ten","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String hund ="hundred";
        String and = "and";
        String thou = "thousand";

        String[] temp = new String[1000];
        int wordSum = 0;
        for(int i=1; i<1001;i++){
            temp[i-1] = ones[i];
            String tempWord = "";

            // TODO - 11-19 NOT DONE
            if(i<100){
                if(i%10==0){
                    i /= 10;
                    tempWord += ones[i];
                } else {
                    tempWord += tens[i/10 -1] + ones[i];
                }
            } else if(i%100==0){
                tempWord += ones[i/100] + hund;
            } else {
                tempWord += ones[i/100] + and + tens[i/10-1] + "-"+ ones[i];
            }
            wordSum+= temp[i-1].length();
        }

        System.out.println(wordSum);
    }
}
