import java.util.Scanner;

public final class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        boolean existed = false;
        int[] perm;
        int[] foundPerm = new int[]{};
        while(tests-- > 0){



            //------------
            existed = false;
            perm = new int[sc.nextInt()];
            for(int i = 0; i < perm.length; i++)
                perm[i] = sc.nextInt();

            for(int i = 1; i < perm.length-1; i++){
                if(perm[i-1] < perm[i] && perm[i] > perm[i+1]){
                    existed = true;
                    foundPerm = new int[]{i, i+1, i+2};
                    break;
                }
            }
            System.out.println(existed ? "YES" : "NO");
            if(existed){
                for(int p : foundPerm)
                    System.out.print(p + " ");
                System.out.println();
            }

            //------------
        }
    }
}