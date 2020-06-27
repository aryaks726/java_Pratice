package MethodOverloading;
import java.util.Scanner;
public class SumOverloading {

    public void getInput() {
//        int a = getInputFromUser(1);
//        int b = getInputFromUser(2);
//        int c = getInputFromUser(3);
//        sum(a, b, c);
        float d = getInputFromUserFloat(1);
        float e = getInputFromUserFloat(2);
        float f = getInputFromUserFloat(3);
        sum(d, e, f);


    }
    private int getInputFromUser(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.print(String.format("Enter a number for #%s : ", number));
        return sc.nextInt();
    }

    private float getInputFromUserFloat(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.print(String.format("Enter a number for #%s : ", number));
        return sc.nextFloat();
    }

    public void sum(int a, int b, int c) {
        int total_sum = a + b + c;
        System.out.println("Total Sum is: " + total_sum);
    }

    public void sum(float d, float e, float f) {
        float total_sum = d + e + f;
        System.out.println("Total sum is: " + total_sum);
    }
}