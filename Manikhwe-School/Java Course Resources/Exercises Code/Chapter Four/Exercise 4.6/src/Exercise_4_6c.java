
public class Exercise_4_6c {

	public static void main(String[] args) {
		
		final double Radius = 40;
		
		// Generate random angle for the first point.
		double randomAngle = Math.toRadians(Math.random()*360);	
		// Compute x and y for the first point using the generated angle.
		double x1 = Radius*Math.cos(randomAngle);
		double y1 = Radius*Math.sin(randomAngle);
		
		// Generate random angle for the second point.
		randomAngle = Math.toRadians(Math.random()*360);
		// Compute x and y for the second point using the generated angle.
		double x2 = Radius*Math.cos(randomAngle);
		double y2 = Radius*Math.sin(randomAngle);
		
		// Generate random angle for the third point.
		randomAngle = Math.toRadians(Math.random()*360);	
		// Compute x and y for the third point using the generated angle.
		double x3 = Radius*Math.cos(randomAngle);
		double y3 = Radius*Math.sin(randomAngle);
		
		// Calculate distance between point1 and point2.
		double distance12 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		// Calculate distance between point1 and point3.
		double distance13 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
	
		
		// Calculate distance between point2 and point3.
		double distance23 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
		
		System.out.println("Incomplete : Need a formula.");
	}

}
