import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrayCancellation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for(int t = 0; t < tests; t++){
            int numbers = sc.nextInt();
            BigInteger coins;
            int[] arr = new int[numbers];

            for(int k = 0; k < numbers; k++){
                arr[k] = sc.nextInt();
            }

            doAllFreeOperations(arr);
            coins = doAllCostingOperations(arr);

            System.out.println(coins.toString());
        }

    }
    static void doAllFreeOperations(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length-1; j++){
                while(arr[i] > 0 && arr[j] < 0){
                    arr[i]--;
                    arr[j]++;
                }
                    
            }
        }
    }
    static BigInteger doAllCostingOperations(int[] arr){
        BigInteger coins = BigInteger.ZERO;
        for(int j = 0; j < arr.length; j++){
            for(int i = j+1; i < arr.length; i++){
                while(arr[j] < 0 && arr[i] > 0){
                    arr[i]--;
                    arr[j]++;
                    coins = coins.add(BigInteger.ONE);
                }
                    
            }
        }
        return coins;
    }
}
