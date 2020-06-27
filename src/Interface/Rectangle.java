package Interface;

public class Rectangle implements Polygon {


    @Override
    public void area() {
        int area = length * breadth;
        System.out.println("Area is: "+ area);

    }

    @Override
    public void perimeter() {
        int peri = 2*(length + breadth);
        System.out.println("Perimeter of rectangle is: "+ peri);

    }
}
