import java.util.Scanner;

public class Soccer {
    static int length;
    static int[] pole;
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        length = in.nextInt();

        pole = new int[length];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = in.nextInt();
        }

        for (int i = 0; i < pole.length; i++) {
            builder.append(game(i, new int[length]));
        }
        System.out.println(builder);
    }

    private static String game(int player, int[] ints) {
        if (ints[player] == 1) {
            return "U";
        }
        int q = pole[player];
        if (player + q < 0) {
            return "L";
        }
        if (player + q > pole.length) {
            return "R";
        }
        ints[player] = 1;
        return game(player + q, ints);
    }
}
