package hu.iit.uni.miskolc.oop.geometry;

public class Cuboid extends Prism{
	private double aSide;
	private double bSide;
	
	public Cuboid(int height, double aSide, double bSide){
		super(height);
		this.aSide = aSide;
		this.bSide = bSide;
	}
	
	public double getBaseArea(){
		return aSide * bSide;
	}
	
	public String toString(){
		return "Cuboid, a side:" + aSide + ", b side: " + bSide;
	}

}
