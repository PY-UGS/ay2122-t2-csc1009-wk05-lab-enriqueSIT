package wk05.Q2;

import wk05.Constants;



public class Ellipse extends Shape {

    //#region Constructors 

    public Ellipse() {
        setDim1(2);
        setDim2(1);
    }

    // Like a square, dim1 and dim2 must be same.
    public Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    //#endregion

    @Override
    public double area() {
        return round(Constants.PI * getDim1() * getDim2(), 2);
    }
    

}
