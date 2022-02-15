package wk05.Q2;



public abstract class Shape {
    
    public Shape() {}
    
    public Shape(double dim1, double dim2) {
        setDim1(dim1);
        setDim2(dim2);
    }
    
    public abstract double area();
    
    private double dim1;
    public double getDim1() {
        return dim1;
    }
    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }
    
    private double dim2;
    public double getDim2() {
        return dim2;
    }
    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    // To round a value to necessary precision.
    protected static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
