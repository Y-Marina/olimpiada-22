import java.util.Scanner;

public class Spotify {
    static int month;
    static int amaunt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
        amaunt = in.nextInt();

        System.out.println("ответ: " + start(1, 1, 0, false));
    }

    public static int start(int a, int d, int count, boolean aChange) {
        System.out.println("a = " + a + ", d = " + d + " = " + (a + (month - 1) * d));
        if ((a + (month - 1) * d) > amaunt && !aChange) {
            return start(++a, 1, count, true);
        }
        if ((a + (month - 1) * d) > amaunt && aChange) {
            return count;
        }
        return start(a, ++d, ++count, false);
    }
}
