package basic_Practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class swap {
    Scanner sc = new Scanner(System.in);
    double number1;
    double number2;
    double temp;

    public void input() {
        System.out.println("Enter first number: ");
        try {
            number1 = sc.nextDouble();
        } catch (InputMismatchException b) {
            System.out.println("Invalid Input. Please input again");
            System.exit(0);
        }
        System.out.println("Enter Second number: ");
        try {
            number2 = sc.nextDouble();
        } catch (InputMismatchException b) {
            System.out.println("Invalid Input. Please input again");
            System.exit(0);
        }

    }

    public void swapping() {
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Swapped number result are " + number1 + " and " + number2);

    }


    public static void main(String[] args) {
    swap sw = new swap();
    sw.input();
    sw.swapping();

    }
}
