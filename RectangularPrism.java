package javapro;


class RectangularPrism extends ThreeDShape{
	static final String CLASS_NAME = "RectangularPrism";

	public RectangularPrism(String name, double length, double width, double height) {
		super(name,length, width, height);
	}
	public String getClassName() {
		return CLASS_NAME;
	}
	
    // get, set methods for each element
	public double getlength() {
		return super.getDimension1();
	}
	
	public void setlength(double length) {
		super.setDimension1(length);
			}
	
	public double getwidth() {
		return super.getDimension2();
	}
	
	public void setwidth(double width) {
		super.setDimension2(width);
			}
	
	public double getheight() {
		return super.getDimension3();
	}
	
	public void setheight(double height) {
		super.setDimension3(height);
			}
	
	
	public double getVolume() {
		return super.getDimension1()*super.getDimension2()*super.getDimension3();
	}// Calculate Volume of RectangularPrism
	
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
}
	Rectangle rectangle1;//composition
}


