import java.util.Scanner;

public class Kub {
    static int d;
    static int t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        d = in.nextInt();
        t = in.nextInt();
        switch (t) {
            case 3:
                System.out.println(8);
                break;
            case 2:
                long r2 = (d - 2) * 12L;
                System.out.println(r2);
                break;
            case 1:
                long r1 = (long) (Math.pow(d - 2, 2) * 6L);
                System.out.println(r1);
                break;
            case 0:
                long r0 = (long) (Math.pow(d - 2, 3));
                System.out.println(r0);
                break;
        }
    }
}
