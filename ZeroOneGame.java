import java.util.Scanner;

public class ZeroOneGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean TAFB = false;
        int tests = scanner.nextInt();
        char[] s = new char[]{};
        int zero = 0;
        int one = 0;
        while(tests-->0){
            TAFB = false;
            s = scanner.next().toCharArray();

            for(char c:s){
                if(c=='0')
                    zero++;
                else
                    one++;
            }
            if (zero % 2 == 0 && one % 2 == 1)
                TAFB = true;
            if(zero+one == 2)
                TAFB = true;


            System.out.println(TAFB ? "DA" : "NET");
        }

    }
}
