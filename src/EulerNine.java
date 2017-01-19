/**
 * Created by Nish on 19/01/2017.
 */
public class EulerNine {
    public static void main(String[] args) {
        int first = 3;
        int second = 4;

        for (int i = 3; i < 995; i++) {
            for (int j = 4; j < 996; j++) {
                double k = Math.sqrt(i * i + j * j);
                if (k == (int) k && (i + j + k == 1000)) {
                    System.out.println("Numbers are " + i + " " + j + " "  + k);
                    System.out.println(i*j*k);
                    System.exit(0);
                }
            }
        }
    }
}