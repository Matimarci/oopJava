package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		Employee marci = new Employee();
		marci.setName("Matiscsak Marton");
		marci.setSalary(0);
		System.out.println("Employee toString: "+marci.toString());
		marci.raiseSalary(500);
		System.out.println("Employee toStrign toString ki�rsa n�lk�l "+marci);
		System.out.println(marci.getName()+" fizet�se 200 �s 1000 k�z�tt: "+marci.isBetweenSalary(200, 1000));
		System.out.println(marci.isBetweenSalary(1000, 2000));
		System.out.println(marci.getTax());
		Employee dani = new Employee();
		dani.setName("G�ti Dani");
		dani.setSalary(20000);
		System.out.println(marci.getName()+" fizet�se nagyobb: "+ marci.hasBiggerSalary(dani));
	}

}
