package basic_Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class userGivenInput {
    String name;
    int age;

    public void takeInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name = sc.nextLine();
        try {
            System.out.println("Enter Age");
            age = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e +" Only Number valid");
        }
    }

    public void isEligibleToVote(){
        if (age>=18){
            System.out.println("Dear "+name + " You are Eligible to vote");
        }else {
            System.out.println("Dear "+name + " You are not eligible to vote. Only 18 or above  " +
                    "can vote. You are only "+age);

        }
    }

    public static void main(String[] args) {
        userGivenInput run = new userGivenInput();
        run.takeInput();
        run.isEligibleToVote();

    }
}
