public class MyMain {
	public static void main(String[] args) {

		TriangleU2710 Call = new TriangleU2710(); // Constructor for calling
													// functions
		double x1 = Call.Side1(2.5, 5, 2, 3.5); // Calculating sides using
												// methods to input data
		double y1 = Call.Side2(2.5, 4.2, 2, 3);
		double z1 = Call.Side3(4.2, 5, 3, 3.5);
		double a1 = Call.angleOfPoints1(x1, y1, z1); // Getting angle1

		double a2 = Call.angleOfPoints2(x1, y1, z1); // Getting angle2
		double a3 = Call.angleOfPoints3(x1, z1, x1); // Getting angle3
		double area = Call.getArea(x1, y1, z1); // Calling area function and
		System.out.printf("%nArea = %s", area); // assigning variable to
												// returned value, using side
												// values in method
		double perimeter = Call.getPerimeter(x1, y1, z1);
		System.out.printf("%nPerimeter = %s", perimeter);
		boolean Iso = Call.Isosceles(x1, y1, z1); // Calling Isosceles function
													// and assigning variable to
													// returned boolean value,
													// using side values in
													// method
		System.out.println(Iso);
		boolean Eq = Call.Equilateral(x1, y1, z1); // Calling
													// Equilateral/Equiangular
													// function and assigning
													// variable to returned
													// boolean value, using side
													// values in method
		System.out.printf("%nEquiangular/Equilateral: %s", Eq);
		boolean Sc = Call.Scalene(x1, y1, z1);	// Calling Scalene
												// function and assigning
												// variable to returned
												// boolean value, using side
												// values in method
		System.out.printf("%nScalene %s :", Sc);
		boolean Ac = Call.Acute(a1, a2, a3);// Calling Acute
											// function and assigning
											// variable to returned
											// boolean value, using side
											// values in method
		System.out.printf("%nAcute %s :", Ac);
		boolean RT = Call.rightTriangle(a1, a2, a3);// Calling Right triangle check
													// function and assigning
													// variable to returned
													// boolean value, using side
													// values in method
		System.out.printf("%nRight Triangle %s:", RT);

											}	
				}
