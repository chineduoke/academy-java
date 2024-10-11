package teachback;

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
	}
}
