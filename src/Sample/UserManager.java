package Sample;

import User.User;

public class UserManager {
	
	private User U=new User();
	
	public UserManager(){
		InputName();
		InputAge();
		GetInfo();
		PlusAge();
		GetInfo();
	}
		
	
	public void InputName() {
		String name = "ȫ����";
		U.Inputname(name);
	}
	
	public void InputAge() {
		int age = 29;
		U.Inputage(age);
	}
	
	public void GetInfo() {
		U.prt();
	}
	
	public void PlusAge() {
		U.plusAge();
	}
	

}
