package javapro;


class Cube extends ThreeDShape{
	static final String CLASS_NAME = "Cube";
	Square square1;//composition
	public Cube(String name, double edge) {
		super(name,edge,edge,edge);// Each edge is same, so every dimension has same value
		square1 = new Square(name, edge);
	}
	public String getClassName() {
		return CLASS_NAME;
	}
	

	public double getedge() {
		return super.getDimension1();
	}
	
	public void setRadious(double edge) {
		super.setDimension1(edge);
		super.setDimension2(edge);
		super.setDimension3(edge);
	}
	
	public double getVolume() {
		return super.getDimension1()*super.getDimension2()*super.getDimension3();
	}//Calculating volume
	
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				super.getName(), getClassName(), super.getClassName());
}
	//composition
}




