import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public final class helloworld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();

        int[] numbers = new int[] {0,2,4,6,8};
        ArrayList<Integer>numbas = new ArrayList<Integer>();

        for(int i: numbers)
            numbas.add(i);
        if(weight == 4 || weight == 6|| weight == 8){
            System.out.println("YES");
            return;
        }

        if(weight > 9){
            if(numbas.contains(weight % 10)){
                System.out.println("YES");
                return;
        }

        }
        System.out.println("NO");
        return;
    }
}