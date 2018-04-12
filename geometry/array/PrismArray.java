package hu.iit.uni.miskolc.oop.geometry.array;

import java.util.Iterator;

import hu.iit.uni.miskolc.oop.geometry.Barrel;
import hu.iit.uni.miskolc.oop.geometry.Prism;

public class PrismArray {
	private Prism[] prismArray;

	public PrismArray(int size) {
		prismArray = new Prism[size];
	}

	public void setElement(int index, Prism prism) {
		prismArray[index] = prism;
	}

	public int getSize() {
		return prismArray.length;
	}

	public Prism getElement(int index) {
		return prismArray[index];
	}

	public int getNotNull() {
		int count = 0;
		for (Prism prism : prismArray) {
			if (prism != null) {
				count++;
			}
		}
		return count;
	}

	public double getAverageVolume() {
		double average = 0;
		for (Prism prism : prismArray) {
			if (prism != null) {
				average += prism.getVolume();
			}
		}
		average = average / getNotNull();
		return average;
	}

	public int getBarrelCount() {
		int count = 0;
		for (Prism prism : prismArray) {
			if (prism instanceof Barrel) {
				count++;
			}
		}
		return count;
	}
	
	
	
}