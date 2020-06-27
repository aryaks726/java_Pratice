package FindSumEvenTotalSum;

import BasicProgram.Rectangle;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.menu();
        int choice = driver.getChoice();
        driver.selectOption(choice);
    } //End of main function

// Menu list
    public void menu() {
        System.out.println("1. Total Sum");
        System.out.println("2. Sum of Even Numbers");
        System.out.println("3. sum of Odd numbers");
        System.out.println("4. Exit");
    }

    //For Choice to select operation
    public int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Operation do you want to run?");
        int choice = sc.nextInt();
        return choice;

    }
    public void selectOption(int choice){
        switch (choice){
            case 1: //TotalSum
                FindSumOperation gettotalsum = new FindSumOperation();
                gettotalsum.getInput();
                gettotalsum.totalSum();
                break;
            case 2: //Sum of even numbers
                FindSumOperation sumofeven = new FindSumOperation();
                sumofeven.getInput();
                sumofeven.sumOfEven();
                break;
            case 3: //sum of odd numbers
                FindSumOperation sumofodd = new FindSumOperation();
                sumofodd.getInput();
                sumofodd.sumOfOddNumbers();
            default:
                System.exit(0);
        }

    }
}