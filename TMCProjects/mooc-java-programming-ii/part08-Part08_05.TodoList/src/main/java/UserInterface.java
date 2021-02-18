import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        loop: while(true) {
            System.out.print("Command: ");

            String command = scanner.nextLine();

            switch (command) {

                case "stop": break loop;

                case "add":
                    System.out.print("To add: ");
                    String addTask = scanner.nextLine();
                    todoList.add(addTask);
                    break;

                case "list": todoList.print();
                    break;

                case "remove":
                    System.out.println("Which one is removed? ");
                    int taskNumber = Integer.parseInt(scanner.nextLine());
                    todoList.remove(taskNumber);
                    break;

            }

        }

    }


}
