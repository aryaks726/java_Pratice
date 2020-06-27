package FindSumEvenTotalSum;
import java.util.Scanner;
public class FindSumOperation {
    int num;
    int sum = 0;
    int oddsum = 0;
    int evensum = 0;
    int i;


    //To get input numbers
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?");
        num = sc.nextInt();
        System.out.println("Enter Numbers");
        for (i = 1; i <= num; i++) {
            int inputvalue = sc.nextInt();
        }
    }

    //To get total sum of numbers
    public void totalSum() {

        for (i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Total Sum is " + sum);

    }

    // To get Sum of even numbers
    public void sumOfEven() {
        for (i = 1; i <= num; ++i) {
            if (i % 2 == 0) {
                evensum = evensum + i;
            }
        }
            System.out.println("Sum of Even Number is : " + evensum);

    }

    //To get sum of Odd numbers
    public void sumOfOddNumbers() {
        for (i = 1; i <= num; i++) {
            if(i % 2 != 0)
            {
                oddsum = oddsum + i;
            }

        }
        System.out.println("Total Odd Number sum is " + oddsum);
    }
}


