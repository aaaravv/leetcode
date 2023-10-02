// Java code to find maximum Area
import java.io.*;
import java.util.*;

// Pair class
class Rectangle {

	// length and
	int length;
	int breadth;

	// Rectangle Constructor
	public Rectangle(int x, int y)
	{
		this.length = x;
		this.breadth = y;
	}
}

// Class Area to calculate Area of rectangles
class Area {

	// Function to calculate area
	static int calculate_Area(Rectangle arr[])
	{

		int max_Area = Integer.MIN_VALUE;

		// loop to iterate through all rectangles
		// and keep track of max area
		for (int i = 0; i < arr.length; i++) {
			int temp_area = arr[i].length * arr[i].breadth;
			if (temp_area > max_Area) {
				max_Area = temp_area;
			}
		}
		return max_Area;
	}
}

// Driver class with main function
class GFG {

	// Driver code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// Creating an array of Pair
		Rectangle arr[] = new Rectangle[3];

		int x = 10, y = 20;
		arr[0] = new Rectangle(x, y);

		x = 5;
		y = 25;
		arr[1] = new Rectangle(x, y);

		x = 15;
		y = 10;
		arr[1] = new Rectangle(x, y);

		x = 12;
		y = 12;
		arr[2] = new Rectangle(x, y);

		Area obj = new Area();
		System.out.println(obj.calculate_Area(arr));
	}
}
