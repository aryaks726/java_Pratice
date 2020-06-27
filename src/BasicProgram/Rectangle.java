package BasicProgram;

import java.util.Scanner;

public class Rectangle {
    int length = 0;
    int breadth = 0;

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        length = sc.nextInt();
        System.out.println("Enter Breadth");
        breadth = sc.nextInt();
    }
    public void rectangleArea(){
        int area = length*breadth;
        System.out.println("Area of Rectangle is "+area);
    }
}
