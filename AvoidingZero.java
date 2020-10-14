import java.security.PrivilegedExceptionAction;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class AvoidingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int tests = sc.nextInt();
        for(int i = 0; i < tests;i++){
            int numbers = sc.nextInt();
            int[] arr = new int[numbers];

            for(int n = 0; n < numbers; n++){
                arr[n] = sc.nextInt();
            }
            int sum = Arrays.stream(arr)
                    .reduce(0, Integer::sum);

            if(sum == 0)
                System.out.println("NO");
            else {
                System.out.println("Yes");
                rearrangeAndPrint(arr);
            }
            System.out.println("");
        }
    }
    static void rearrangeAndPrint(int[] arr){
        int whilesum = 0;
        boolean between = false;

        do {
            whilesum = 0;
            between = true;
            for (int i = 1; i < arr.length; i++) {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = tmp;
            }
            for (int p : arr) {
                whilesum += p;
                if (whilesum == 0)
                    between = false;
            }

        } while (!between);
        for(int t: arr)
            System.out.print(t + " ");
    }
}
