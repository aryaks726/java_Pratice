package BasicProgram;


public class Driver {
    public static void main(String[] args) {
        SelectOption obj = new SelectOption();
        obj.menu();
        int choice = obj.getChoice();
        obj.optionSelection(choice);


        Triangle triangle = new Triangle();
        triangle.getInput();
        triangle.area();
        triangle.perimeter();
        Rectangle rectangle = new Rectangle();
        rectangle.getInput();
        rectangle.rectangleArea();
    }

}
