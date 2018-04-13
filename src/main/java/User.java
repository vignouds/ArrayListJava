/**
 * 
 * @author Sébastien Vignoud
 *
 */
public class User {
	String name;
	int age;
	boolean isMale;
	
	public User(String n, int a, boolean b) {
		this.name=n;
		this.age=a;
		this.isMale=b;
	}
	
	public User() {
		this("", 0, true);
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean getIsMale() {
		return this.isMale;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public void setAge(int a) {
		this.age=a;
	}
	
	public void setIsMale(boolean b) {
		this.isMale=b;
	}
	
	public String toString() {
		String hf;
		if(this.isMale)
			hf=" est un homme ";
		else
			hf=" est une femme ";
		return this.name + hf +"de " + this.age + " ans.";
	}
}
