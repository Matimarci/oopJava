package my.first;

public class Euler {
	
	
	public static void main(String[] args) {
		
		
		/*
		 Adjon k�zel�t�st az Euler-f�le e sz�mra (e=2,718 281 828) az al�bbi sorozat els� 100 / 1000 tagj�nak kisz�m�t�s�val
		 */
		
		double e=1;
		for (double i = 1; i < 1000; i++) {
			e=e+(1/(factor(i)));
		}
		
			System.out.println("Az e �rt�ke:"+e);
	
	}
	
	private static double factor(double n) {
		double factor=1;
		for (int i = 1; i <= n; i++) {
			factor*=i;
		}
		return factor;
	}
}
