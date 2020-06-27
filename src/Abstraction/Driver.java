package Abstraction;

public class Driver {

    public static void main(String[] args) {
        Square square = new Square();
        square.findRectangleArea(10,20);
        square.findSquarePerimeter(5, 30);

        Rectangle rectangle = new Rectangle();
        rectangle.findRectangleArea(5,20);
        rectangle.findSquarePerimeter(8, 6);


    }
}
