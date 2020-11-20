import java.util.Scanner;

public class DigitGame {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int digits = sc.nextInt();
            String n = sc.next();
            
            if(digits < 2 && Integer.parseInt(n) % 2 == 0)
                System.out.println(2);
            else if(digits % 2 == 0)
                System.out.println(2);
            else
                System.out.println(1);   
        }
    }
}
