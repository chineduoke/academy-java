package teachback;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		try {
			User1 person = new User1("John", "Oke", "testexample.com");
			person.greet();
			System.out.println("Name: " + person.getName());
			System.out.println("Surname: " + person.getSurname());
			System.out.println("Email: " + person.getEmail());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------");

		try {
			Email email = new Email("testexample.com");
			User2 person = new User2("John", "Oke", email);
			person.greet();
			System.out.println("Name: " + person.getName());
			System.out.println("Surname: " + person.getSurname());
			System.out.println("Email: " + person.getEmail());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		nums.add(2);

		int val1 = 0;
		int val2 = 5;

		boolean isEqual = (!nums.get(val1).equals(nums.get(val2)));

		System.out.println(isEqual);
	}
}
