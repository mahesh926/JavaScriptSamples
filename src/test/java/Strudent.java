package test;

public class Strudent  extends Address{

	private String name;
	public Strudent(String city, String state, int zip, String name, String email) {
		super(city, state, zip);
		this.name = name;
		this.email = email;
	}
	private String email;
	
	
}
