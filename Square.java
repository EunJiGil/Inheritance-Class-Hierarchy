package javapro;

class Square extends Rectangle {
	static final String CLASS_NAME = "Square";

	public Square(String name, double side) {
		super(name,side,side);
	}
	public String getClassName() {
		return CLASS_NAME;
	}
	
	public double getside() {
		return super.getDimension1();
	}
	
	public void setside(double side) {
		super.setDimension1(side);
		super.setDimension2(side);
	}
	
	
	public double getArea() {
		return super.getDimension1()* super.getDimension2();
	}
	
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
}
}





