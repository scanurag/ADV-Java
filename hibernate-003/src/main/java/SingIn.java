import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class SingIn {
	@EmbeddedId
	private MyKey mk;
	private String name;
	private int age;
	private String Password;
	public MyKey getMk() {
		return mk;
	}
	public void setMk(MyKey mk) {
		this.mk = mk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
