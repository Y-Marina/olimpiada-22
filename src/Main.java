import java.util.Scanner;

public class Main {

    static long a;
    static long b;
    static long c;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();

        long result = start(a, b, c);
        System.out.println(result);
    }

    static long start(long x, long y, long z) {
        long step = 0;
        while (isTreugolnik(x, y, z)) {
            x--;
            y--;
            z--;
            step++;
        }
        return step;
    }

    static boolean isTreugolnik(long x, long y, long z) {
        if (x + y > z && y + z > x && x + z > y) {
            return true;
        } else {
            return false;
        }
    }
}