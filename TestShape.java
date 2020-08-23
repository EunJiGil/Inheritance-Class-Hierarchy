public class TestShape {
	public static void main(String[] args) {

		// create an object
		Circle cir1 = new Circle("Cir One", 3.0);
		Rectangle rec1 = new Rectangle("Rec One", 3.0, 4.0);
		Cylinder cylin1 = new Cylinder("Cylinder One", 3.0, 6.0);
		Cone Con1 = new Cone ("Cone one", 2.0, 4.0);
		Sphere sph1 = new Sphere ("Sphere one", 3.0);
		Cube cu1 = new Cube ("Cube one", 3.0);
		RectangularPrism rp1 = new RectangularPrism ("RectangularPrism one", 4.0, 2.0, 3.0);
		
		// print the object properties	
		System.out.println("1." + cir1);
		System.out.printf( "%s's area is %.2f, radius is %.2f\n", 
			cir1.getName(),cir1.getArea(), cir1.getRadious());
		
		System.out.println("2." + rec1);
		System.out.printf( "%s's area is %.2f, width is %.2f, height is %.2f\n", 
			rec1.getName(),rec1.getArea(), rec1.getWidth(), rec1.getHeight());
		
		System.out.println("3." + cylin1);
		System.out.printf( "%s's area is %.2f, radius is %.2f, height is %.2f\n", 
			cylin1.getName(), cylin1.getVolume(), cylin1.getRadious(), cylin1.getHeight());
		
		System.out.println("4." + Con1);
		System.out.printf( "%s's area is %.2f, radius is %.2f, height is %.2f\n", 
				Con1.getName(), Con1.getVolume(), Con1.getRadious(), Con1.getHeight());
	
		System.out.println("5." + sph1);
		System.out.printf( "%s's area is %.2f, radius is %.2f\n", 
				sph1.getName(), sph1.getVolume(), Con1.getRadious());	
		
		System.out.println("6." + cu1);
		System.out.printf( "%s's area is %.2f, side is %.2f\n", 
				cu1.getName(), cu1.getVolume(), cu1.getedge());	

		System.out.println("7." + rp1);
		System.out.printf( "%s's area is %.2f, length is %.2f, width is %.2f, height is %.2f\n", 
				rp1.getName(), rp1.getVolume(), rp1.getlength(),rp1.getwidth(),rp1.getheight());	

	}
}

