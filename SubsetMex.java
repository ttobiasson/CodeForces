import java.util.ArrayList;
import java.util.Scanner;

public class SubsetMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        

        for (int i = 0; i < tests; i++) {
            int numbers = sc.nextInt();
            
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            int min = 0;

            for(int j = 0; j < numbers; j++){
                
                int n = sc.nextInt();
                
                if(A.contains(n)) {
                    B.add(n);
                }
                else{
                    A.add(n);
                }
            }

            for(int a = 0; a <= 100; a++){
                if(!A.contains(a)){
                    min += a;
                    break;
                }
                    
            }
            for(int b = 0; b <= 100; b++){
                if(!B.contains(b)){
                    min += b;
                    break;
                }
            }
            System.out.println(min);
            
        }
    }
}
