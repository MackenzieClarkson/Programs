
// Author: Mackenzie Clarkson
// Date: September 26 2016
// Assignment Number: 1

import static java.lang.Math.sqrt; //Importing math libraries used later on to get geometric data
import static java.lang.Math.pow;
import static java.lang.Math.acos;

public class TriangleU2710 { // Declaring coordinate, perimeter, and area
								// variables

	public double coordX1, coordY1, coordX2, coordY2, coordX3, coordY3, area, perimeter;

	public void DefaultTriangle() 
	{																						 // Creating default triangle coordinates
		coordX1 = 0;
		coordY1 = 0;
		coordX2 = 2;
		coordY2 = 2;
		coordX3 = 4;
		coordY3 = 4;

	}

	public double Side1(double coordX1, double coordX2, double coordY1, double coordY2) 
	{																						 // Calculating
																							// side
																							// distances
																							// using
																							// coordinate
																							// points
																							// &
																							// Pythagorean
																							// principles
		double x1 = sqrt(pow((coordX1 - coordX2), 2) + pow((coordY1 - coordY2), 2));
		return x1;
	}

	public double Side2(double coordX1, double coordX3, double coordY1, double coordY3) 
	{
		double y1 = sqrt(pow((coordX1 - coordX3), 2) + pow((coordY1 - coordY3), 2));
		return y1;
	}

	public double Side3(double coordX3, double coordX2, double coordY3, double coordY2) 
	{
		double z1 = sqrt(pow((coordX3 - coordX2), 2) + pow((coordY3 - coordY2), 2));
		return z1;
	}

	public double angleOfPoints1(double X, double Y, double Z) 
	{															 	// Calculating
																	// angles in
																	// triangle
		double a1 = ((Y * Y) + (Z * Z) - (X * X)) / (2 * Y * Z);
		return acos(a1);
	}

	public double angleOfPoints2(double X, double Y, double Z) {
		double a2 = ((X * X) + (Z * Z) - (Y * Y)) / (2 * X * Z);
		return acos(a2);
	}

	public double angleOfPoints3(double X, double Y, double Z) {
		double a3 = ((X * Y) + (X * X) - (Z * Z)) / (2 * Y * X);
		return acos(a3);
	}

	public double getArea(double X, double Y, double Z) { // Calculating area
		double preArea = (X+Y+Z)/2;
		area = sqrt(preArea*(preArea-X)*(preArea-Y)*(preArea-Z));
		return area;

	}

	public double getPerimeter(double X, double Y, double Z) { 	// Calculating
																// perimeter
		perimeter = (X + Y + Z);
		return perimeter;

	}

	public boolean Isosceles(double X, double Y, double Z) 
	{														// Boolean check for
															// Isosceles
		if (X == Y) {
			return true;
					}
		else if (X == Z) 
		{

			return true;
		} 
		else if (Y == Z) 
		{
			return true;
		} else 
		{
			return false;
		}

	}

	public boolean Equilateral(double X, double Y, double Z) 
	{ // Boolean check
																// for
																// Equilateral
		if (X == Y && Y == Z) 
			{
			return true;
			} else 
		{
			return false;
		}
	}

	public boolean Scalene(double X, double Y, double Z) 
	{ // Boolean check for
															// Scalene
		if (X == Y || X == Z || Y == Z) 
			{
			return false;
			}

		else 
		{
			return true;
		}
	}

	public boolean rightTriangle(double a1, double a2, double a3) { // Boolean
																	// check for
																	// Right
																	// Triangle
		if (a1 == 90 || a2 == 90 || a3 == 90) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Acute(double a1, double a2, double a3) { // Boolean check for
															// acute angles
		if (a1 < 90 && a2 < 90 && a3 < 90) {
			return true;
		} else {
			return false;
		}

	}

}
