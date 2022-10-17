package Employee.Employee1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee 
{
long id;
String name;
int password;
String Address;
@Id
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="password")
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
@Column(name="address")
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
}
