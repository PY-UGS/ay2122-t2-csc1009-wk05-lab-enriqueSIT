package wk05.Q1;



public class Rectangle extends GeometricObject {

    //#region Constructors 
    
    public Rectangle() {
        super();
        this.setHeight(1);
        this.setWidth(2);
    }

    public Rectangle(double width, double height) {
        super();
        this.setHeight(height);
        this.setWidth(width);
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.setHeight(height);
        this.setWidth(width);
    }

    //#endregion

    //#region Private Vars with Getters and Setters

    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    private double width;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    //#endregion


    //#region Public Methods

    public double getArea() {
        return  this.getHeight() * this.getWidth();
    }

    public double getPerimeter() {
        return (this.getHeight() + this.getWidth()) * 2;
    }

    public void printRectangle() {
        System.out.print(
            super.toString() + "\n" 
            + "Colour: " + this.getColor() + "\n" 
            + "Is this filled: " + this.isFilled() + "\n"

            + "Height: " + this.getHeight() + "\n" 
            + "Width: " + this.getWidth() + "\n"
            + "Perimeter: " + this.getPerimeter() + "\n" 
            + "Area: " + this.getArea() + "\n" 
        );
    }

    //#endregion

    
}
