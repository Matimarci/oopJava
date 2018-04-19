package hu.iit.uni.miskolc.oop;

public class Main {
	public static void main(String[] args) {
		Person marton = new Person(new Person.Name("Matiscsak", "Marton"), 24);
		System.out.println(marton);
		Person.Name daniName = new Person.Name("Gati", "Dani");
		Person dani = new Person(daniName, 23);
		System.out.println(dani.getName());
	}
}