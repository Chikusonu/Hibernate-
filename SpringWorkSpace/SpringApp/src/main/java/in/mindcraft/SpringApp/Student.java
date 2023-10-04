package in.mindcraft.SpringApp;

public class Student {
	private String name;
	private int roll;
	private Address resd;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public Address getResd() {
		return resd;
	}

	public void setResd(Address resd) {
		this.resd = resd;
	}

	public Student() {
		super();
	}

	public void show() {
		System.out.println(" "+name+" "+roll+" ");
		resd.show();
	}
}





