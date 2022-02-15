package wk05.Q2;

import wk05.Constants;



public class Circle extends Shape {

    //#region Constructors 

    public Circle() {
        setDim1(1);
        setDim2(1);
    }

    // Like a square, dim1 and dim2 must be same.
    public Circle(double dim1, double dim2) {
        setDim1(dim1);
        setDim2(dim1);
    }
    
    //#endregion

    @Override
    public double area() {
        return round(Constants.PI * getDim1() * getDim1(), 1);
    }
    

}
