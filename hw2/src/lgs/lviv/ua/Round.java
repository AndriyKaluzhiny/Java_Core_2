package lgs.lviv.ua;

public class Round {
	private double radius;
	private double diameter;
	private double square;
	private double length;
	
	Round() {
		this.radius = 10;
		this.diameter = 10;
		
		RoundSquare(radius, square);
		RoundLenght(radius,square);
	}
	
	public double RoundSquare(double radius, double square) {
		square = Math.PI*(radius*radius);
		return square;
	}
	
	public double RoundLenght(double radius, double length) {
		length = 2*Math.PI*radius;
		return length;
	}

	@Override
	public String toString() {
		return "Round [radius=" + radius + ", diameter=" + diameter + ", square=" + square + ", length=" + RoundLenght(radius, length) + "]";
	}


	
	
}	
