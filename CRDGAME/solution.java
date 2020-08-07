
import java.util.*;

public class solution {
    private static int cscore;
    private static int mscore;

    private static void check(int c, int m) {
        int sum = 0;
        while (c > 0) {
            sum += (c % 10);
            c = c / 10;
        }
        while (m > 0) {
            sum -= (m % 10);
            m = m / 10;
        }
        /*
         * Subtracting morty's power directly from the sum of chef's digit and then
         * comparing. By this I am saved from using another variable.
         */
        if (sum > 0)
            cscore++;
        else if (sum < 0)
            mscore++;
        else {
            cscore++;
            mscore++;
        }

    }

    private static void display() {
        if (mscore > cscore) {
            System.out.println("1 " + mscore);
        } else if (cscore > mscore) {
            System.out.println("0 " + cscore);
        } else if (cscore == mscore) {
            System.out.println("2 " + mscore);
        }
        mscore = 0;
        cscore = 0;
        // reinitialize for the next test case
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();// number of test cases
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();// number of rounds played in that case
            for (int j = 0; j < n; j++) {
                int c = in.nextInt();
                int m = in.nextInt();
                check(c, m);
            }
            display();
        }
        in.close();
    }
}