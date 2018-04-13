/**
 * 
 * @author Sébastien Vignoud
 *
 */
public class User implements Comparable<User> {
	String name;
	int age;
	boolean isMale;
	
	public User(String n, int a, boolean b) {
		this.name=n;
		this.age=a;
		this.isMale=b;
	}
	
	/**Constructeur "vide" */
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
	
	/**Permet de trier les lists avec Collections.sort*/
	public int compareTo(User u) {
		return this.name.compareTo(u.name);	
	}
}
