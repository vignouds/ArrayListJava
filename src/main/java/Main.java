import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/** 
 * 
 * @author Sébastien Vignoud
 *
 */
public class Main {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList();
		
		User u=new User();
		users.add(u);
		
		User u2=new User("seb",28,true);
		users.add(u2);
		
		User u3=new User("julie", 35, false);
		users.add(u3);
		
		User u4=new User("bob", 55, true);
		users.add(u4);
		
		User u5=new User("lisa", 17, false);
		users.add(u5);
		
		User u6=new User("home", 45, true);
		users.add(u6);
		
		User u7=new User("marge", 41, false);
		users.add(u7);

		User u8=new User("donald", 62, true);
		users.add(u8);

		User u9=new User("toto", 8, true);
		users.add(u9);
		
		User u10=new User("clara", 12, false);
		users.add(u10);
		
		Collections.sort(users);
		users.remove(0);
		
/*		for(int i=0;i<users.size();i++)
		{
			System.out.println(users.get(i));
		}
		*/
		
		ArrayList<User> users2 = new ArrayList();
		User u11=new User("aa", 2, true);
		users2.add(u11);
		User u12=new User("bb", 3, false);
		users2.add(u12);
		
		ArrayList<User> users3 = new ArrayList();	
		users3.addAll(users);
		users3.addAll(users2);
		
		ListIterator li = users3.listIterator();
		
		while(li.hasNext())
			System.out.println(li.next());

	}
}
