import java.util.Scanner;
/**
 * 
 * @author JieKe
 *
 */
public class LendingLibraryController{
LendingLibrary bookLib = new LendingLibrary();
private static Scanner input = new Scanner(System.in);

public LendingLibraryController(){
	
}
/**
 * Call getResponseTo() and makeUser() methods to
 * add the users information
 *  
 */

public void addUser() {
	String l = getResponseTo("New User Entry\nLast name:");
	String f = getResponseTo("First name:");
	String ages = getResponseTo("Age:");
	String address = getResponseTo("address:");	
	int age = Integer.valueOf(ages);
	User u = new User();
	bookLib.makeUser(u.getId(), f, l, address, age);
 
}
public void changeUser(){
	String last = getResponseTo("Change User\nLast name");
	String first = getResponseTo("First name");
	User user = new User();
	user = bookLib.findUser(first, last);
	String address = getResponseTo("Change address");
	user.setAddress(address);
	
}
public void findUser(){
	
	String last = getResponseTo("Find User\nLast name");
	String first = getResponseTo("First name");
	System.out.println(bookLib.findUser(first, last).toString());

	
}
public void listUsers() {
	int i = 0;
	
	for(User user : bookLib.getUserReg()) {		
		if(user == null) break;
		System.out.printf("User #%d\n",i+1);
		System.out.println(user.toString());				
		i++;

		}
}

public void addBook() {
	
	String t = getResponseTo("New Book Entry\nTitle:");
	String a = getResponseTo("Author:");
	String d = getResponseTo("Publication date (year in NNNN format)");
	String i = getResponseTo("ISBN number(10 digits):");
	Book b = new Book(t, a, d, i);
	bookLib.addBook(b);

}
	
public void changeBook() {
	Book book = new Book();
	book = bookLib.findBook(getResponseTo("ISBN:"));
	String t = getResponseTo("Change Book\nChange title:");
	book.setTitle(t);
	String a = getResponseTo("Change author:");
	book.setAuthor(a);
	String d = getResponseTo("Change publication date:");
	book.setPublicationDate(d);
	
}
public void findBook() {

	String isbn = getResponseTo("Find Book\nISBN:");
	bookLib.findBook(isbn);
	System.out.println(bookLib.findBook(isbn).toString());
	
}
public void listBooks() {

	int i = 0;
	
	for(Book book : bookLib.getBookReg()) {		
		if(book == null) break;
		System.out.printf("Book #%d\n",i+1);
		System.out.println(book.toString());				
		i++;

		}
}
public void addBookLoan() {
	User user = new User();
	Book book = new Book();
	user.setLastName(getResponseTo("New Loan Entry\nUser last name:"));
	user.setFirstName(getResponseTo("User first name:"));
	book.setIsbnNumber(getResponseTo("Book isbn number"));	
//	user = bookLib.findUser(getResponseTo("User last name:"), getResponseTo("User first name:"));
//	book = bookLib.findBook(getResponseTo("Book isbn number"));
	String date = getResponseTo("Loan date (format yyyy-mm-dd)");
	BookLoan Loan = new BookLoan(user, book, date);
	bookLib.addLoan(Loan);

	
}
public void changeBookLoan() {
	
	String isbn = getResponseTo("Modify loan details\nISBN number for the loan you want to modify:");
	
	String date = getResponseTo("Change due date(Hit Enter key for no change):");
	bookLib.findLoan(isbn).setDueDate(date);
	
}
public void findBookLoan() {
	String isbn = getResponseTo("Find a book loan. Enter ISBN nubmer");
	bookLib.findLoan(isbn);
	System.out.println(bookLib.findLoan(isbn).toString());

}
public void listBookLoans() {
	
	int i = 0;
	for(BookLoan loan : bookLib.getLoanReg()) {
		if(loan == null) break;
		   System.out.printf("Book loan #%d\n",i+1);
		   System.out.println(loan.toString());
		   i++;
	}
}

	
private static String getResponseTo(String s)	{
	System.out.println(s);
	return (input.nextLine());
}

private static boolean isValidNumber(String input) {
//	int testInput = Integer.valueOf(input);
//	
//	if( testInput < 18) {
//		
//		System.out.println("This age is not allowed.");
//	return false;
//}
			
		return true;
	
}

	
	
	
}
