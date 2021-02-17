import java.util.Scanner;

public class CountCubes {

    public void countCube() {

        Scanner scanner = new Scanner(System.in);

        String end = "end";

        while (true) {

            String userInput = scanner.nextLine();

            if (userInput.equals(end)) {
                break;
            }

            int userInputNumber = Integer.parseInt(userInput);

            int countCube = (int) Math.pow(userInputNumber, 3);
            System.out.println(countCube);
        }
    }
}