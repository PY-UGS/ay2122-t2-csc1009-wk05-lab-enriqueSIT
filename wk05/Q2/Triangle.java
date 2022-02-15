package wk05.Q2;



// Assumes right-angled triangle.
public class Triangle extends Shape {

    //#region Constructors 

    public Triangle() {
        setDim1(2);
        setDim2(1);
    }

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    //#endregion

    @Override
    public double area() {
        return 0.5 * getDim1() * getDim2();
    }
    

}
