package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		Employee marci = new Employee();
		marci.setName("Matiscsak Marton");
		marci.setSalary(0);
		System.out.println("Employee toString: "+marci.toString());
		marci.raiseSalary(500);
		System.out.println("Employee toStrign toString kiírsa nélkül "+marci);
		System.out.println(marci.getName()+" fizetése 200 és 1000 között: "+marci.isBetweenSalary(200, 1000));
		System.out.println(marci.isBetweenSalary(1000, 2000));
		System.out.println(marci.getTax());
		Employee dani = new Employee();
		dani.setName("Gáti Dani");
		dani.setSalary(20000);
		System.out.println(marci.getName()+" fizetése nagyobb: "+ marci.hasBiggerSalary(dani));
	}

}
