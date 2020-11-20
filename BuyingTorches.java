import java.math.BigInteger;
import java.util.Scanner;

public class BuyingTorches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for(int i = 0; i < tests; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            BigInteger trades = BigInteger.valueOf(0);
            BigInteger sticksNeeded = BigInteger.valueOf(y*k + k);
            BigInteger sticks = BigInteger.valueOf(1);
            int coal = 0;

            while (sticksNeeded.compareTo(sticks) > 0) {
                sticks = sticks.add(BigInteger.valueOf(x-1));
                trades = trades.add(BigInteger.valueOf(1));
                
            }
            while(coal < k){
                coal++;
                trades = trades.add(BigInteger.valueOf(1));
            }
            System.out.println(trades);
        }

    }
}
