import java.util.Scanner;
public class NumberOfApartments {
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        while (tests-- > 0){
            int windows = sc.nextInt();
            int sevens = 0;
            int fives = 0;
            int threes = 0;
            int acc = 0;

            if  (windows >= 3 && windows != 4){
                while (windows > 0){                    
                    if (windows % 3 == 0){
                        threes += windows/3;
                        windows = 0;
                    }
                    else if (windows % 5 == 0){
                        fives += windows/5;
                        windows = 0;                    
                    }
                    else if (windows % 7 == 0){
                        sevens += windows/7;
                        windows = 0;                    
                    }
                    else{
                        acc++;
                        windows--;
                    }

                }

                while (acc-- > 0){
                    if (threes > 1){
                        threes -= 2;
                        sevens++;
                    }
                    else if (fives > 0){
                        fives--;
                        threes += 2;
                    }
                    else if (sevens > 0){
                        fives++;
                        threes++;
                        sevens--;
                    }
                }
                
                System.out.println(threes + " " + fives + " " + sevens);
            }
            else {
                System.out.println(-1);
            }

        }
    }
   
}
