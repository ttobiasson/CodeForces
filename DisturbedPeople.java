import java.util.Scanner;

public final class DisturbedPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfFlats = sc.nextInt();
        int[] flats = new int[numberOfFlats];
        int answer = 0;
        for(int i = 0; i < numberOfFlats; i++)
            flats[i] = sc.nextInt();
        for(int i = 1; i < numberOfFlats-1; i++){
            if(flats[i-1] == 1 && flats[i] == 0 && flats[i+1] == 1){
                flats[i+1] = 0;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
