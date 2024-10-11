package teachback;

class Email {
	private String email;

	public Email(String email) {
		if (validateEmail(email)) {
			this.email = email;
		} else {
			throw new IllegalArgumentException("Invalid email!");
		}
	}

	public String getEmail() {
		return email;
	}

	private boolean validateEmail(String email) {

		return email.contains("@") && email.contains(".");
	}
}
