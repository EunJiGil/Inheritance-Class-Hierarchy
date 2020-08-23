package javapro;


public class ThreeDShape {
	private static String CLASS_NAME = "3D Shape";
	protected String Name;
	protected double dimension1;
	protected double dimension2;
	protected double dimension3;
	public ThreeDShape(String name, double dim1, double dim2, double dim3) {
		Name = name;
		dimension1 = dim1;
		dimension2 = dim2;
		dimension3 = dim3;
	} //These are detailed properties for Three Dimensional Shape

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
	public double getDimension3() {
		return dimension3;
	}
	public void setDimension3(double dimension3) {
		this.dimension3 = dimension3;
	}
	// get + set methods for every element
	double getVolume() {
		return 0;
	}
	
}
