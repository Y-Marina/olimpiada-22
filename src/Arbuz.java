import java.util.Scanner;

public class Arbuz {

    static int n;
    static int m;
    static int d;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        d = in.nextInt();

        Pair[] p = new Pair[d];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Pair(
                    in.nextLong(),
                    in.nextLong()
            );
        }

        int[][] pole = new int[n][m];

        for (int k = 0; k < p.length; k++) {
            Pair currentPair = p[k];
            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[0].length; j++) {
                    if (i <= currentPair.m - 1 && j <= currentPair.n - 1) {
                        pole[i][j] = pole[i][j] + 1;
                    }
                }
            }
        }

//        for (int i = 0; i < pole.length; i++) {
//            for (int j = 0; j < pole[0].length; j++) {
//                System.out.print(pole[i][j] + " ");
//            }
//            System.out.println();
//        }

        int max = 0;

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[0].length; j++) {
                if (pole[i][j] > max) max = pole[i][j];
            }
        }

        long count = 0;

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[0].length; j++) {
                if (pole[i][j] == max) count++;
            }
        }
        System.out.println(count + " " + max);
    }

    public static class Pair {
        long n;
        long m;

        public Pair(long n, long m) {
            this.n = n;
            this.m = m;
        }
    }
}


