package Abstraction;

public class Rectangle extends Polygon {
    @Override
    public void findRectangleArea(int l, int b) {
        length = l;
        breadth = b;
        int area = length * breadth;
        System.out.println("Area of Rectangle "+area);

    }

    @Override
    public void findSquarePerimeter(int l, int b) {
        length = l;
        breadth = b;
        int peri = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle "+peri);

    }

}
