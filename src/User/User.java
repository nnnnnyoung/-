package User;

public class User {
	private String name;
	private int age;
	
	public User() {
		
	}
			
	public void Inputname(String a) {
		this.name=a;
	}
	
	public void Inputage(int a) {
		this.age=a;
	}
	
	public void prt() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public void plusAge() {
		age++;
	}
}
