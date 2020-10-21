import java.util.ArrayList;
import java.util.Scanner;

public class CubesSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        boolean isReversed;
        for(int t = 0; t < tests; t++){
            isReversed = true;
            int cubes = sc.nextInt();
            ArrayList<Integer>volumes=new ArrayList<Integer>();
            for(int n = 0; n < cubes; n++){
                volumes.add(sc.nextInt());
            }
            for(int i = 1; i < volumes.size(); i++){
                if(volumes.get(i-1) <= volumes.get(i))
                    isReversed = false;
            }
            if(!isReversed)
                System.out.println("YES");
            else
                System.out.println("NO");


        }
    }
}
