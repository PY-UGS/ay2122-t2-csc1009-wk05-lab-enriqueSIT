package wk05.Q2;


public class Q2 {
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        Shape figref; // This is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area() + " for Rectangle");
        figref = t;
        System.out.println("Area is " + figref.area() + " for Triangle");
        figref = c;
        System.out.println("Area is " + figref.area() + " for Circle");
        figref = e;
        System.out.println("Area is " + figref.area() + " for Ellipse");
        figref = s;
        System.out.println("Area is " + figref.area() + " for Square");
    }
}
