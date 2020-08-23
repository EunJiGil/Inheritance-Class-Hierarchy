package javapro;


class Cylinder extends ThreeDShape{
	static final String CLASS_NAME = "Cylinder"; //This Class name is Cylinder
	Circle circle1;//composition
	public Cylinder(String name, double rad, double height) {
		super(name,rad,rad,height);//I need radius and height to calculate the volume of Cylinder
		circle1 = new Circle(name, rad);	}
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
		//get + set methods
	}
	
	public double getVolume() {
		return Math.PI* super.getDimension1()*super.getDimension2()*super.getDimension3();
	}
	
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
}
	
}


