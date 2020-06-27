package BasicProgram;
import java.util.Scanner;
public class SelectOption {

    public void menu (){
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Exit");
    }

    public int getChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice-->");
        int choice = sc.nextInt();
        return choice;
    }

    public void optionSelection(int choice) {
        switch (choice) {
            case 1:
                Triangle tt = new Triangle();
                tt.getInput();
                tt.area();
                tt.perimeter();
                break;
            case 2:
                Rectangle rt = new Rectangle();
                rt.getInput();
                rt.rectangleArea();
                break;

            default:
                System.exit(0);
        }
    }
}
