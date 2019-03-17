import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Введите любое число от 1 до 15");

        int inputedNumber = inputScanner.nextInt();

        if (inputedNumber > 15) {
            System.out.println("невозможно");
        } else if (inputedNumber < 0) {
            System.out.println("невозможно");
        } else {
            int prevFibonacci = 1;
            int lastFibonacci = 1;

            for (int i = 2; i < inputedNumber; i++) {
                int number = prevFibonacci + lastFibonacci;

                prevFibonacci = lastFibonacci;
                lastFibonacci = number;
            }

            System.out.println(lastFibonacci);
        }
    }
}