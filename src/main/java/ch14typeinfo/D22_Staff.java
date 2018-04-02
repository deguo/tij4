package ch14typeinfo;

import java.util.*;

/**
 * <pre>
 * Output:	
 * [D22_Position: President D22_Person: Me Last The Top, Lonely At, D22_Position: CTO NullPerson, D22_Position: Marketing Manager NullPerson, D22_Position: Product Manager NullPerson, D22_Position: Project Lead D22_Person: Janet Planner The Burbs, D22_Position: Software Engineer D22_Person: Bob Coder Bright Light City, D22_Position: Software Engineer NullPerson, D22_Position: Software Engineer NullPerson, D22_Position: Software Engineer NullPerson, D22_Position: Test Engineer NullPerson, D22_Position: Technical Writer NullPerson]
 * </pre>
 */
public class D22_Staff extends ArrayList<D22_Position> {
	public void add(String title, D22_Person person) {
		add(new D22_Position(title, person));
	}

	public void add(String... titles) {
		for (String title : titles)
			add(new D22_Position(title));
	}

	public D22_Staff(String... titles) {
		add(titles);
	}

	public boolean positionAvailable(String title) {
		for (D22_Position position : this)
			if (position.getTitle().equals(title) && position.getPerson() == D22_Person.NULL)
				return true;
		return false;
	}

	public void fillPosition(String title, D22_Person hire) {
		for (D22_Position position : this)
			if (position.getTitle().equals(title) && position.getPerson() == D22_Person.NULL) {
				position.setPerson(hire);
				return;
			}
		throw new RuntimeException("D22_Position " + title + " not available");
	}

	public static void main(String[] args) {
		D22_Staff staff = new D22_Staff("President", "CTO", "Marketing Manager", "Product Manager", "Project Lead",
				"Software Engineer", "Software Engineer", "Software Engineer", "Software Engineer", "Test Engineer",
				"Technical Writer");
		staff.fillPosition("President", new D22_Person("Me", "Last", "The Top, Lonely At"));
		staff.fillPosition("Project Lead", new D22_Person("Janet", "Planner", "The Burbs"));
		if (staff.positionAvailable("Software Engineer"))
			staff.fillPosition("Software Engineer", new D22_Person("Bob", "Coder", "Bright Light City"));
		System.out.println(staff);
	}
}
