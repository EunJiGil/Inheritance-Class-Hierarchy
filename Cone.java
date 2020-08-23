package javapro;


class Cone extends ThreeDShape{
	static final String CLASS_NAME = "Cone";
	Circle circle1;//composition
	public Cone(String name, double rad, double height) {
		super(name,rad,rad,height); // I need radius and height to calculate Volume of Cone
		circle1 = new Circle(name, rad);
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
	}
	
	public double getHeight() {
		return super.getDimension3();
	}
	
	public void setHeight(double Height) {
		super.setDimension3(Height);
		
	}
	
	public double getVolume() {
		return Math.PI* 1/3 * super.getDimension1()*super.getDimension2()*super.getDimension3();
	} // get + set methods for every element
	
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
}
	
}



