package javapro;

class Rectangle extends TwoDShape{
	static final String CLASS_NAME = "Rectangle";

	public Rectangle(String name, double Width, double Height) {
		super(name,Width,Height);
	}// I need Width and Height to calculate the area of Rectangle
	
	public String getClassName() {
		return CLASS_NAME;
	}
	
	public double getWidth() {
		return super.getDimension1();
	}
	
	public void setWidth(double Width) {
		super.setDimension1(Width);
	}
	public double getHeight() {
		return super.getDimension2();
	}
	
	public void setHeight(double Height) {
		super.setDimension1(Height);
	}
	
	public double getArea() {
		return super.getDimension1()* super.getDimension2();
	}
	// get + set methods for every element
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
}
}





