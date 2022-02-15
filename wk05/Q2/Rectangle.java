package wk05.Q2;



public class Rectangle extends Shape {

    //#region Constructors 

    public Rectangle() {
        setDim1(2);
        setDim2(1);
    }

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    //#endregion

    @Override
    public double area() {
        return getDim1() * getDim2();
    }
    

}
