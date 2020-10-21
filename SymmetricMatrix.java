import java.util.ArrayList;
import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goodTiles = 0;
        int tests = sc.nextInt();

        for (int t = 0; t < tests; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            goodTiles = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {

                for (int k = 0; k < 4; k++) {
                    int ts = sc.nextInt();
                    list.add(ts);
                }

                if (list.get(1).equals(list.get(2)))
                    goodTiles++;
                list = new ArrayList<Integer>();

            }
            if (goodTiles >= 1 && m % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }


}

