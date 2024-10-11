package teachback;

public class User2 {

	private String name;
	private String surname;
	private Email email;

	public User2(String name, String surname, Email email) {
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email.getEmail();
	}

	public void greet() {
		System.out.println("Hi!");
	}
}