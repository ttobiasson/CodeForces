import java.util.Scanner;
import java.util.stream.*;
import java.math.*;
import java.util.ArrayList;

public class NumbersOnWhiteboard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
    
        while(tests-- > 0){
            int n = sc.nextInt();
            int[] arr = IntStream.rangeClosed(1,n).toArray();
            int i = arr.length-1;
            ArrayList<Integer> AandB = new ArrayList<Integer>();

            while (i > 0){
                AandB.add(arr[i]);
                AandB.add(arr[i-1]);
                arr[i-1] = (int)Math.ceil((arr[i] + arr[i-1])/2.0);
                
               
                i--;
            }


            System.out.println(arr[0]);
            for(int k = 0; k < AandB.size()-1; k+=2)
               System.out.println(AandB.get(k) + " " + AandB.get(k+1));
        }
    }
}
