package javapro;

public class TwoDShape {
	private static String CLASS_NAME = "2D Shape";
	protected String Name;
	protected double dimension1;
	protected double dimension2;
	public TwoDShape(String name, double dim1, double dim2) {
		Name = name;
		dimension1 = dim1;
		dimension2 = dim2;
	}////These are detailed properties for Two Dimensional Shape
	
	public String getClassName() {
		return CLASS_NAME;
	}

	public String getName() {
		return Name;
	}
	public double getDimension1() {
		return dimension1;
	}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimension2() {
		return dimension2;
	}
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	//get + set methods for every element
	
	double getArea() {
		return 0;
	}
	
}
