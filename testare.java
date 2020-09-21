import java.util.Scanner;

public class testare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split(";");
        for(String a:s){
            Double siffer = Double.parseDouble(a);

            while (siffer.floatValue() > 0.01){
                System.out.println(siffer);
                siffer -= 0.01;
            }

        }


    }
}
