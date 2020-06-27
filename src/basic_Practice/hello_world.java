package basic_Practice;
public class hello_world {
    public static void main(String[] args) {
        System.out.println("hello arya");
        int myFirstNumber = 10;
        int mySecondNumber = 50;
        int myThirdNumber = mySecondNumber*5+20;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int lastNumber = 1500-myTotal;

        System.out.println(myThirdNumber);
        System.out.println(myTotal);
        System.out.println(lastNumber);
        int myMin = 2147483647;
        byte myByte = 127;
        short myShort = -30000;
        long myLong =  50000L+ 10L*(myByte+ myShort + myMin);
        System.out.println("Long value = "+ myLong);
    }
}
