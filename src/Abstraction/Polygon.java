package Abstraction;

public abstract class Polygon {
    int length ;
    int breadth;

    public void setProperties (int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public abstract void findRectangleArea(int length, int breadth);
    public abstract void findSquarePerimeter(int length, int breadth);
}
