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
		return this.name + this.age+this.isMale;
	}
}
