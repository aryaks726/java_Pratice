package basic_Practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class largestNumber {
    Scanner sc = new Scanner(System.in);
    double firstNumber;
    double secondNumber;
    double thirdNumber;

    public void input(){
        System.out.println("Enter the first number ");
        try {
            firstNumber = sc.nextDouble();
        }
        catch (InputMismatchException num){
            System.out.println("Input Error . PLease enter again");
            System.exit(0);
        }

        System.out.println("Enter the Second number ");
        try {
            secondNumber = sc.nextDouble();
        }
        catch (InputMismatchException num){
            System.out.println("Input Error . PLease enter again");
            System.exit(0);
        }

        System.out.println("Enter the first number ");
        try {
            thirdNumber = sc.nextDouble();
        }
        catch (InputMismatchException num){
            System.out.println("Input Error . PLease enter again");
            System.exit(0);
        }
    }
    public  void print(){
        double i = firstNumber;
        double j = secondNumber;
        double k = thirdNumber;
        if (i>j && i>k){
            System.out.println(" The largest number among the numbers you have entered is: " +i);
        }
        else if (j>i && j>k){
            System.out.println(" The largest number among the numbers you have entered is: " +j);
        }
        else{
            System.out.println(" The largest number among the numbers you have entered is: " +k);
        }

    }
    public static void main(String[] args) {
        largestNumber ln = new largestNumber();
        ln.input();
        ln.print();
    }
}
