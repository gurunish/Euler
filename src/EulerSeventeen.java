/**
 * Created by Nish on 22/01/2017.
 */
public class EulerSeventeen {
    public static void main(String[] args){
        String[] less={"","one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens={"ten","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String hund ="hundred";
        String and = "and";
        String thou = "thousand";

        int wordSum = 0;
        for(int i=1; i<1000;i++){
            String tempWord = "";
            if(i<100){
                if(i<20) {
                    //1-19
                    tempWord += less[i];
                } else {
                    //20-99
                    tempWord += tens[(i/10)-1] + less[i%10];
                }
            } else if(i%100==0){
                //100,200,...,900
                tempWord += less[i/100] + hund;
            } else {
                int tensAndOnes = (i-(i/100*100));
                if(tensAndOnes<20) {
                    //101-119, 201-219,...,901-919
                    if(tensAndOnes==10){
                        tempWord += less[i/100] + hund + less[tensAndOnes];
                    } else {
                        tempWord += less[i / 100] + hund +"-"+ less[tensAndOnes];
                    }
                } else if(tensAndOnes%10==0){
                    //110,120,...,990
                    tempWord += less[i/100] + hund + tens[ tensAndOnes/10 -1];
                } else {
                    //All else
                    System.out.println(i);
                    tempWord += less[i/100]+ hund + and + tens[tensAndOnes/10-1] + "-"+less[i%10];
                }
            }
            wordSum+= tempWord.length();
        }
        String s = "onethousand";
        wordSum += s.length();
        System.out.println(wordSum);
    }
}
