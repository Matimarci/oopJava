
public class Pitagorasz {
	
	
		public static void main(String[] args) {
			
			/*
			 2. 1 és 100 közötti számokból képezzük a Pitagoraszi számhármasokat és írjuk ki táblázatos formában 
			(megoldás: 14 ilyen számhármas van). A Pitagoraszi számhármasok egy derékszögû háromszög oldalainak egész mérõszámai, 
			azaz teljesül rájuk, hogy a2 + b2 = c2.
			 
			Több, mint 14 ilyen számhármas van!
			 */
		
			int n=0;
			for (int i = 1; i < 100; i++) {
				for (int j = 1; j < 100; j++) {
					for (int k = 1; k < 100; k++) {
						if (((i*i)+(j*j)) == (k*k) && (i<=j)) {
							n++;
							System.out.println(n +". a = " + i + ", b = " + j + ", c = " + k);
						}
					}
				}
			}
		
		
		}

}
