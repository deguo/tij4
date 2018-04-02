package ch14typeinfo;

class D22_Position {
	private String title;
	private D22_Person person;

	public D22_Position(String jobTitle, D22_Person employee) {
		title = jobTitle;
		person = employee;
		if (person == null)
			person = D22_Person.NULL;
	}

	public D22_Position(String jobTitle) {
		title = jobTitle;
		person = D22_Person.NULL;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String newTitle) {
		title = newTitle;
	}

	public D22_Person getPerson() {
		return person;
	}

	public void setPerson(D22_Person newPerson) {
		person = newPerson;
		if (person == null)
			person = D22_Person.NULL;
	}

	public String toString() {
		return "D22_Position: " + title + " " + person;
	}
}