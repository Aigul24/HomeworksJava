package lesson31032016;

public class Task01 {

	public static void main(String[] args) {
		
		int salary = 41_560; // gloss salary
		double tax = 0.13; // income tax rate
		double netSalary = salary - tax * salary; // net salary
		
		System.out.println(netSalary);

	}
}
