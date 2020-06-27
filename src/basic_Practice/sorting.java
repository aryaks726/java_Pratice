package basic_Practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sorting {
    int num, i, j, temp;
    Scanner input = new Scanner(System.in);
    int array[] = new int[num];

    public void input() {
        System.out.println("Enter the number of integers to sort:");

        try {
            num = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input error. Please enter again  ");
            System.exit(0);
        }

    }

    public void sort() {
        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++)
            array[i] = input.nextInt();

        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }


    public static void main(String[] args) {
        sorting sor = new sorting();
        sor.input();
        sor.sort();

    }

}
