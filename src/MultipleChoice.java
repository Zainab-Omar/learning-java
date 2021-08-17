import java.util.Scanner;
public class MultipleChoice {
    public static void main(String[] args){
        String question = "What is Javac?";
        String choiceOne ="println()";
        String choiceTwo ="compiler";
        String choiceThree ="null";
        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("choose from the following:");
        System.out.println("1 " + choiceOne);
        System.out.println("2 " + choiceTwo);
        System.out.println("3 " + choiceThree);

        System.out.println("type the number of correct answer");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("incorrect the correct answer is " + correctAnswer);
        }
    }
}
