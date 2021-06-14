
public class User {
private static int userNextId = 1000;
private int id;
private String firstName;
private String lastName;
private String address;
private int age;
public User() {
	
}
public User(int id, String firstName, String lastName, 
		String address,int age) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.age = age;
	
}
public User(String firstName, String lastName, 
		String address,int age) {
	this(1000,firstName,lastName,address,age);
	
}
public User(String firstName, String lastName, 
		String address) {
	this(firstName, lastName, address, 18);
	
}
public String toString() {
	return "\n*********User id: "
			+ getId() +
			"\n*********User name: "
			+ getFirstName() + getLastName() +
			"\n*********Age: "
			+ getAge() +
			"\n*********Address: "
			+ getAddress();
	
}
/**
 * 
 * @return
 */
public static int getUserNextId() {
	return userNextId;
}
public static void setUserNextId(int userNextId) {
	User.userNextId = userNextId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

	
	
	
}
