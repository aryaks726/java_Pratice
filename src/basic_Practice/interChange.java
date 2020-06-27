package basic_Practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class interChange {
    Scanner sc = new Scanner(System.in);
    double pound;
    double kg;
    double a = 0.45359237;

    public void input() {
        System.out.println("Enter the value of pound you want to convert: ");
        try {
            pound = sc.nextDouble();
        } catch (InputMismatchException p) {
            System.out.println("Invalid Input. Please input again");
            System.exit(0);
        }
    }

    public void convert() {
        kg = pound * a;

        System.out.println("Value of entered pound in Kilograms = " + kg);
    }



    public static void main(String[] args) {
        interChange change = new interChange();
        change.input();
        change.convert();
    }

}
