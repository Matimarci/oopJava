package hu.iit.uni.miskolc.oop.geometry;

public class Barrel extends Prism {
	private double radius;
	
	public Barrel(int height, double radius){
		super(height);
		this.radius = radius;
	}
	
	public double getBaseArea(){
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public String toString(){
		return "Barrel, radius: " + radius +  ", height: " + getHeight();  
	}

}
