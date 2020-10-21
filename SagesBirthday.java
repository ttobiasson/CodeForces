import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SagesBirthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buys = 0;
        int cakes = sc.nextInt();
        int[] arr = new int[cakes];
               
        for(int i = 0;i < cakes; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 1; i < arr.length-1; i+=2){
            if(i == 1){
                int tmp = arr[0];
                int tmp1 = arr[1];
                arr[0] = arr[2];
                arr[1] = tmp;
                arr[2] = tmp1;
            }else{
                int tmp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = tmp;
            }
            if(arr[i-1] > arr[i] && arr [i] < arr[i+1])
                buys++;
        }
        
        System.out.println(buys);
        for(int i : arr)
            System.out.print(i + " ");
    }
}
