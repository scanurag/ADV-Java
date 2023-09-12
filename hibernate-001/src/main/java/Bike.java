import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Bike {
	@Id
int bid;
String name;
@OneToOne
Engine e;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}
}
