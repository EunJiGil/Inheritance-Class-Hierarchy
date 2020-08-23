package javapro;

class Sphere extends ThreeDShape{
	static final String CLASS_NAME = "Sphere";
	Circle circle1; //composition
	public Sphere(String name, double rad) {
		super(name,rad,rad,rad);
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
		super.setDimension3(rad);
	} //It's because Sphere needs radius three times
	
	public double getVolume() {
		return Math.PI* 4/3 * super.getDimension1()*super.getDimension2()*super.getDimension3();
	}
	
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
}
	
	}



