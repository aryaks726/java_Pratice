package basic_Practice;
import java.util.Scanner;

public class even_Odd {
    Scanner sc = new Scanner(System.in);
    int num;
    public void input()
    {
        System.out.println(" Enter any number you want to check: ");
        num= sc.nextInt();
    }
    public void calculate(){
        if(num%2==0) {
            System.out.println("The number you have entered is even.");
        }
        else{
            System.out.println("The number you have entered is odd.");
        }

    }
    public static void main(String[] args) {
        even_Odd disp = new even_Odd();
        disp.input();
        disp.calculate();
    }
}
