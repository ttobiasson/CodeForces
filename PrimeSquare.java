import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PrimeSquare{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        
        int tests = sc.nextInt();

        while(tests--> 0){
            int index = 0;
            int n = sc.nextInt();
            int[][] m1 = new int[n][n];
            int[][] m2 = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    m1[i][j] = i == j ? 1 : 0;
                }
            }
            
            for(int[] arr : m1){
                m2[index] = reverse(arr);
                index++;
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    m1[i][j] = m1[i][j] ==1 || m2[i][j] == 1 ? 1 : 0;
                }
                
            }
            for(int[]arr:m1){
                System.out.println();
                for(int m : arr){
                    System.out.print(m + " ");
                }
            }
        }
    }
    static int[] reverse(int[] arr) {
        int[] arr_copy = arr.clone();
        int i = 0;
        int j = arr.length-1;
        while(j > i){
            int tmp = arr_copy[j];
            arr_copy[j] = arr_copy[i];
            arr_copy[i] = tmp;

            i++;
            j--;
        }
        return arr_copy;
    }
}