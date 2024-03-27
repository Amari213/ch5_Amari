import java.util.Scanner;

public class GetInput {

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }
}