
public class BookLoan {
private User user;
private Book book;
private String dueDate;
public BookLoan() {
	
}

public BookLoan(User user, Book book, String dueDate) {
	this.user = user;
	this.book = book;
	this.dueDate = dueDate;
	
}
public String toString() {
	return "\n*********User name: "
			+ user.getFirstName() + user.getLastName() +
		   "\n*********Title: "
			+ book.getTitle() +
		   "\n*********Author: "
			+ book.getAuthor() +
		   "\n*********Due Date: "
			+ dueDate + "\n";
	
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public String getDueDate() {
	return dueDate;
}
public void setDueDate(String dueDate) {
	this.dueDate = dueDate;
}

	
	
	
	
}
