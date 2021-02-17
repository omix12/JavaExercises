
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();


        while (true) {

            System.out.println("First: " + first.toString());
            System.out.println("Second " + second.toString());

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int inputValue = Integer.valueOf(parts[1]);

            if (inputValue > 0) {

                if (command.equals("add")) {
                    first.add(inputValue);
                } else if (command.equals("move")) {

                    if (inputValue > first.contains()) {
                        inputValue = first.contains();
                        first.container = 0;
                    } else {
                        first.remove(inputValue);
                    }

                    second.add(inputValue);

                } else if (command.equals("remove")) {
                    second.remove(inputValue);
                }

            }
        }
    }

}
