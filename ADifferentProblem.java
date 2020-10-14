import java.util.NoSuchElementException;
import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            do {
                long a = sc.nextLong();
                long b = sc.nextLong();

                System.out.println(Math.abs(a - b));
            }while(true);
        }catch (NoSuchElementException ignored){
        }

    }
}
