package basic_Practice;
import java.util.Scanner;

public class Average {
    Scanner sc = new Scanner(System.in);
    int number[]= new int[10];
    int sum = 0;
     public void input(){
         System.out.println("Enter any Ten numbers: ");
         for (int i=0;i<number.length;i++) {
             number[i] = sc.nextInt();
             sum = sum + number[i];
         }
     }
     public void avg(){
         int avg = sum /10;
         System.out.println(" The average of numbers you have entered is :  " + avg);
     }

    public static void main(String[] args) {
        Average aver = new Average();
        aver.input();
        aver.avg();
    }
}
