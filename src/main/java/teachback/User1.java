package teachback;

class User1 {
	private String name;
	private String surname;
	private String email;

	public User1(String name, String surname, String email) {
		if (validateEmail(email)) {
			this.name = name;
			this.surname = surname;
			this.email = email;
		} else {
			throw new IllegalArgumentException("Invalid email!");
		}
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	////////

	public void greet() {
		System.out.println("Hi!");
	}

	private boolean validateEmail(String email) {

		return email.contains("@") && email.contains(".");
	}

}
