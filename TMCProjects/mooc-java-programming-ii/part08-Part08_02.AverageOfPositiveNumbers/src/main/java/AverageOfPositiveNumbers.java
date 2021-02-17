import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumOfThePositiveNumbers = 0;
        boolean positiveNumberInputted = false;
        int countPositiveNumbers = 0;

        while (true) {

            int userInputNumber = scanner.nextInt();

            if (userInputNumber == 0) {
                break;
            } else if (userInputNumber > 0) {
                sumOfThePositiveNumbers += userInputNumber;
                positiveNumberInputted = true;
                countPositiveNumbers++;
            }

        }



        if (positiveNumberInputted == false) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumOfThePositiveNumbers / countPositiveNumbers);
        }

    }
}