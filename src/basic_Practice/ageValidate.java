package basic_Practice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class ageValidate {
    int age;
    String name;
    int[] voterCardNumber = new int[1];
    int[] citizenshipNumber = new int[1];
    String ans;
    String vote;
    int[] voterNumber = {123456789};
    int[] citizenship = {987654321};
    Scanner sc = new Scanner(System.in);

    public void getInput() {
        System.out.println("Enter your name:  ");
        name = sc.nextLine();
        System.out.println("Is your age above 18? Yes or No");
        ans = sc.nextLine();
    }

    public void validateInput() throws InputMismatchException {
        if (ans.equals("yes") || ans.equals("Yes") || ans.equals("YES")) {
            try {
                System.out.println("Give your age: ");
                age = sc.nextInt();
            } catch (InputMismatchException age) {
                System.out.println( "Input Error. only numbers accepted");
                System.exit(0);
            }
            if (age >= 18) {
                System.out.println("Have you casted the vote before?Yes or No");
                vote = sc.next();

                if (vote.equals("yes")||vote.equals("Yes")||vote.equals("YES")) {
                    try {
                        System.out.println("Please provide your voter card number: ");
                        for (int i = 0; i < voterCardNumber.length; i++) {
                            voterCardNumber[i] = sc.nextInt();
                        }
                    } catch (InputMismatchException vote) {
                        System.out.println("Input Error. Only numbers accepted");
                        System.exit(0);
                    }
                    if (Arrays.equals(voterNumber, voterCardNumber)) {
                        System.out.println("Congratulations!!! Your voter card number matches our database, you are eligible to cast the vote now");
                    } else {
                        System.out.println("Your voter card number is incorrect!!!");
                    }
                } else {
                    System.out.println("Please provide your Citizenship number: ");
                    try {
                        for (int i = 0; i < citizenshipNumber.length; i++) {
                            citizenshipNumber[i] = sc.nextInt();
                        }
                    }
                    catch (InputMismatchException ctzn) {
                        System.out.println("Input Error. Only numbers accepted");
                        System.exit(0);
                    }
                    if (Arrays.equals(citizenshipNumber, citizenship)) {
                        System.out.println("Congratulations!!! Your citizenship number matches our database, you are eligible to cast the vote now");
                    } else {
                        System.out.println("Your citizenship number is incorrect!!!");
                    }

                }

            } else {
                System.out.println("Dear " + name + "." + " Your age is not eligible for voting. Please be of right age and try again. Thankyou ");
                System.exit(0);
            }
        } else {
            System.out.println("Dear " + name + "." + " Your age is not eligible for voting. Please be of right age and try again. Thankyou ");
            System.exit(0);
        }

    }

    public static void main(String[] args) throws InputMismatchException {
        ageValidate pr = new ageValidate();
        pr.getInput();
        pr.validateInput();
    }
}
