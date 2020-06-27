package Abstraction;

public class Square extends Polygon {
    @Override
    public void findRectangleArea(int l, int b) {
        length = l;
        breadth = b;
        int area = l * b;
        System.out.println("Area of Square : "+ area);

    }

    @Override
    public void findSquarePerimeter(int l, int b) {
        length = l;
        int peri = 4 * l;
        System.out.println("Perimeter of Square : "+peri);

    }
}
