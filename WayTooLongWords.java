import java.util.Scanner;

public final class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfWords = sc.nextInt();
        String[] words = new String[numberOfWords];

        for (int i = 0; i < numberOfWords; i++)
           words[i] = sc.next();

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > 10){
                int l = words[i].length();
                words[i] = words[i].substring(0,1)  +
                        ""                          +
                        (l - 2)       +
                        ""                          +
                        words[i].substring(l-1, l);
            }
            System.out.println(words[i]);
        }
    }
}
