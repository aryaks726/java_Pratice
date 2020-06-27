package BasicProgram;


import java.util.Scanner;

public class Triangle {
    int base = 0;
    int height = 0;

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base");
        base = sc.nextInt();
        System.out.println("Enter Height");
        height = sc.nextInt();
    }
    public void area(){
        int area = (base*height)/2;
        System.out.println("Area = "+area);
    }
    public void perimeter(){
        System.out.println("This is perimeter");

    }

}
