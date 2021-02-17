
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
            int inputValue = Integer.parseInt(parts[1]);

            switch (command) {

                case "add":
                    first.add(inputValue);
                    break;

                case "move":
                    if (inputValue > first.contains()) {
                        inputValue = first.contains();
                    }

                    first.remove(inputValue);
                    second.add(inputValue);
                    break;

                case "remove":
                    second.remove(inputValue);
                    break;
            }

        }
    }

}
