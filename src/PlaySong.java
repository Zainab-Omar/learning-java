import java.util.Scanner;
public class PlaySong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("would you like to play next song?");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("playing next song");
    }
}
