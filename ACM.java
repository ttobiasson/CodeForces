import java.util.Scanner;

public class ACM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseNumber = 1;

        while (true) {

            int w = sc.nextInt();
            int l = sc.nextInt();


            char[][] room = new char[l][w];
            int doorI = 0, doorJ = 0;

            boolean up = false,
                    down = false,
                    left = false,
                    right = false;

            sc.nextLine(); //Flush polluting input.

            for (int i = 0; i < l; i++) { //Fill the matrix "room" with its layout.
                room[i] = sc.nextLine().toCharArray();
            }

            if(room.length == 0 || room[0].length == 0) //Check if we haven't been supplied a room.
                break;

            for (int i = 0; i < l; i++) { //Find where the entrance is.
                for (int j = 0; j < w; j++) {
                    if (room[i][j] == '*') {
                        doorI = i;
                        doorJ = j;
                    }
                }
            }
            if (doorI == 0)  //We need to find out which direction we are currently facing
                down = true; //which depends on which wall we have entered the room from.
            else if (doorI == l - 1)
                up = true;
            else if (doorJ == 0)
                right = true;
            else if (doorJ == w - 1)
                left = true;


            int i = doorI;
            int j = doorJ;

            while (true) {

                if (up)         //Each loop we take another step in the current "direction".
                    i--;
                if (down)
                    i++;
                if (left)
                    j--;
                if (right)
                    j++;


                if (room[i][j] == '/') { //After one step has been taken, we check if we stand on a mirror. If so, we check
                                        // which direction we are heading, and change it according to the type of mirror.
                    if (up) {
                        up = false;
                        right = true;
                    } else if (down) {
                        down = false;
                        left = true;
                    } else if (left) {
                        left = false;
                        down = true;
                    } else if (right) {
                        right = false;
                        up = true;
                    }
                } else if (room[i][j] == '\\') {
                    if (up) {
                        up = false;
                        left = true;
                    } else if (down) {
                        down = false;
                        right = true;
                    } else if (right) {
                        right = false;
                        down = true;
                    } else if (left) {
                        left = false;
                        up = true;
                    }

                } else if (room[i][j] == 'x') { //If we stand on a 'x', then we have hit a wall
                                                // and need to place an exit here.
                    room[i][j] = '&';
                    break;
                }
            }

            System.out.println("HOUSE " + houseNumber);
            for (int row = 0; row < l; row++) {         //Print the room with the exit placed.
                for (int col = 0; col < w; col++) {
                    System.out.print(room[row][col]);
                }
                System.out.println();
            }

            houseNumber++;
        }

    }

}
