import java.util.Scanner;

public class DigitGame {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        String[] strings = new String[]{"0","1","2","3","4","5","6","7","8","9"};


        for (int k = 0; k < t; k++){
            boolean hasOdd = false;
            boolean hasEven = false;
            int digits = sc.nextInt();
            String n = sc.next();

            for (String i : strings){
                if (n.indexOf(i) != -1 && Integer.parseInt(i) % 2 != 0)
                    hasOdd = true;
                if (n.indexOf(i) != -1 && Integer.parseInt(i) % 2 == 0)
                    hasEven = true;
            }
            if (digits % 2 == 0){
                if(hasEven)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
            else {
                if(hasOdd)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
            
        }
    }
}
