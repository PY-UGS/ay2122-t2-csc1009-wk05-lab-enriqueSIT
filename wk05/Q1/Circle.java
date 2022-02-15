package wk05.Q1;



public class Circle extends GeometricObject {

    // Prefer to define PI in here, or externally in a lib to call?

    //#region Constructors 

    public Circle() {
        super();
        setRadius(1);
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    //#endregion

    
    //#region Private variables with Getters and Setters

    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //#region Constructors 

    
    //#region Public Methods

    public double getArea() {
        return 3.14159265358979323 * this.getRadius() * this.getRadius();
    }

    public double getPerimeter() {
        return 3.14159265358979323 * this.getDiameter();
    }

    public double getDiameter() {
        return this.getRadius() * 2;
    }

    public void printCircle() {
        System.out.print(
            super.toString() + "\n" 
            + "Colour: " + this.getColor() + "\n" 
            + "Is this filled: " + this.isFilled() + "\n"
            
            + "Radius: " + this.getRadius() + "\n" 
            + "Area: " + this.getArea() + "\n" 
            + "Diameter: " + this.getDiameter() + "\n"
            
            + "Perimeter: " + this.getPerimeter() + "\n" 
        );
    }

    //#endregion

    
}
