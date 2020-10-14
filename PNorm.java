import java.util.NoSuchElementException;
import java.util.Scanner;

public class PNorm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            do{
                double x1 = sc.nextDouble();
                double y1 = sc.nextDouble();
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                double p = sc.nextDouble();

                double answer = Math.abs(Math.pow( Math.pow(Math.abs(x1-x2), p)+ Math.pow(Math.abs(y1-y2),p) , 1/p));


                System.out.println(answer);
            }while(true);
        }catch (NoSuchElementException ignored){

        }



    }
}
