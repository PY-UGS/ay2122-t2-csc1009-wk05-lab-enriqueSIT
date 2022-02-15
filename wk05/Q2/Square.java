package wk05.Q2;



public class Square extends Shape {

    //#region Constructors 

    public Square() {
        setDim1(1);
        setDim2(1);
    }

    // Square. dim1 and dim2 must be same.
    public Square(double dim1, double dim2) {
        setDim1(dim1);
        setDim2(dim1);
    }

    //#endregion

    @Override
    public double area() {
        return getDim1() * getDim2();
    }
    

}
