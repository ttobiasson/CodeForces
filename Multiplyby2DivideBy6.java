import java.util.Scanner;

public class Multiplyby2DivideBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int moves = 0;
        int tests = sc.nextInt();

        while(tests-- > 0){
            n = sc.nextInt();
            moves = 0;
            while (true){
                if(n == 1){
                    System.out.println(moves);
                    break;
                }
                else if(n%6==0)
                    n = n/6;
                else if((2*n) % 6 == 0)
                    n = 2*n;
                else {
                    System.out.println(-1);
                    break;
                }
                moves++;
            }


        }
    }
}
