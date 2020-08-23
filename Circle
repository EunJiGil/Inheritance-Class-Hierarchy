package javapro;

class Circle extends TwoDShape{
	static final String CLASS_NAME = "Circle";// For last line of Circle class

	public Circle(String name, double rad) {
		super(name,rad,rad);
	}
	public String getClassName() {
		return CLASS_NAME;
	}
	
	public double getRadious() {
		return super.getDimension1();
	}
	
	public void setRadious(double rad) {
		super.setDimension1(rad);
		super.setDimension2(rad);
	} // get + set method
	public double getArea() {
		return Math.PI* getDimension1()* getDimension2();
	} //Calculate Area of Circle
	
	
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
} // to express output sentence ex) Circle one is a [Circle], and is a [2D Shape]
}

