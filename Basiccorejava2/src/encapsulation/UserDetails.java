package encapsulation;

public class UserDetails {

	

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0)
		this.age = age;
	}
	

}
