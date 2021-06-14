import java.util.Scanner;

/**
 * @author JieKe
 *
 */
public class AppDriver {

private static final int APP_EXIT = 0;
private static final int APP_ADD_BOOK = 1;
private static final int APP_MOD_BOOK = 2;
private static final int APP_FIND_BOOK = 3;
private static final int APP_LIST_BOOKS = 4;
private static final int APP_ADD_USER = 5;
private static final int APP_MOD_USER = 6;
private static final int APP_FIND_USER = 7;
private static final int APP_LIST_USERS = 8;
private static final int APP_ADD_LOAN = 9;
private static final int APP_MOD_LOAN = 10;
private static final int APP_FIND_LOAN = 11;
private static final int APP_LIST_LOANS = 12;

private static Scanner input = new Scanner(System.in);
LendingLibraryController appController = new LendingLibraryController();

public void startApp() {
	int i = -1;
	while (i != 0 ) {
	    i = displayAppMenu();
		executeMenuItem(i);
	}  

}
private static int displayAppMenu() {
	System.out.printf
	("Enter a selection from the following menu:\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s",
			
			APP_ADD_BOOK + ". Enter a new book",
			APP_MOD_BOOK + ". Modify book details. Enter the book isbn number",
			APP_FIND_BOOK + ". Find a book by isbn number",
			APP_LIST_BOOKS + ". Display list of all books\n",
			APP_ADD_USER + ". Add a new user",
			APP_MOD_USER + ". Modify user details",
			APP_FIND_USER + ". Find a user by name",
			APP_LIST_USERS + ". Display all users\n",
			APP_ADD_LOAN + ". Add a loan. Link a user name to a book by isbn number",
			APP_MOD_LOAN + ". Modify a loan. Loan is identified by isbn number",
			APP_FIND_LOAN + ". Find a loan. Loan is identified by isbn number",
			APP_LIST_LOANS + ". Dispaly all loans\n",
			APP_EXIT + ". Exit program");

	return(input.nextInt());
	
}
private void executeMenuItem(int choice) {

	switch(choice) {
	case APP_ADD_BOOK:
		appController.addBook();
		break;
	case APP_MOD_BOOK:
		appController.changeBook();
		break;
	case APP_FIND_BOOK:
		appController.findBook();
		break;
	case APP_LIST_BOOKS:
		appController.listBooks();
		break;
	case APP_ADD_USER:
		appController.addUser();
		System.out.println("User was added");
		break;
	case APP_MOD_USER:
		appController.changeUser();
		break;
	case APP_FIND_USER:
		appController.findUser();
		break;
	case APP_LIST_USERS:
		appController.listUsers();
		break;
	case APP_ADD_LOAN:
		appController.addBookLoan();
		System.out.println("Loan added.");
		break;
	case APP_MOD_LOAN:
		appController.changeBookLoan();
		break;
	case APP_FIND_LOAN:
		appController.findBookLoan();;
		break;
	case APP_LIST_LOANS:
		appController.listBookLoans();
		break;
	case APP_EXIT:
		System.out.println("Good Bye!");
		break;
		

	}
}

}