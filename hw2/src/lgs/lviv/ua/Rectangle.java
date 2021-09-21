package lgs.lviv.ua;

public class Rectangle {
	int length;
	int width;
	
	int result;
	int result2;
	//без параметрів
	Rectangle() {
		this.length = 10;
		this.width = 10;
		this.result = 0;
		
		RectanglePerimeter(length, width, result);
	}
		//З параметрами
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int RectanglePerimeter(int lenght,int width, int result) {
		result = length + width;
		return result; 
	}
	
	public int RectangleSquare(int length, int width, int result2) {
		result2 = length* width;
		return result2;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", perimeter=" + RectanglePerimeter(length, width, result) + " " + "Square=" + RectangleSquare(length, width, result2) + "]";
	}
	

	
	
}
