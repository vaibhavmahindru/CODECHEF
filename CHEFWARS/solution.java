import java.util.*;

public class solution {
    static Scanner in = new Scanner(System.in);

    private static int check() {
        int h = in.nextInt();
        int p = in.nextInt();
        while (p > 0) {
            h -= p;
            p = p / 2;
            if (h <= 0)// check if health is less then 0 or equal to 0.If yes return 1.
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(check());
        }

    }
}