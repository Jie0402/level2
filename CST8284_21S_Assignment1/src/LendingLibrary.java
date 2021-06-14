/**
 * @author JieKe
 *
 */
public class LendingLibrary {
	private static final int MAX_BOOK_NUMBER = 10;
	private static final int MAX_USER_NUMBER = 5;
	private static final int MAX_LOAN_NUMBER = 5;
	private static final int MAX_LOAN_PER_USER = 2;

	private static int lastBookIndex = 0;
	private static int lastUserIndex = 0;
	private static int lastLoanIndex = 0;

	private Book[] bookReg = new Book[10] ;
	private User[] userReg = new User[5] ;
	private BookLoan[] loanReg = new BookLoan[5];

	public LendingLibrary() {

	}
	public User makeUser(int id, String firstName, 
			String lastName, String address, int age){

		User u = new User();
		u.setId(u.getId());
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setAddress(address);
		u.setAge(age);
		addUser(u);

		return u;

	}
	public boolean addUser(User u) {
		int i = -1;
		setLastUserIndex(i);
		i = getLastUserIndex();
		if(i >= MAX_USER_NUMBER) {

			//		i = MAX_USER_NUMBER;
			return false; 
		}
		userReg[i] = u;
		userReg[i].setId(userReg[i].getId() + i + User.getUserNextId());

		return true;
	}
	public boolean addBook(Book b) {
		int i = -1;
		setLastBookIndex(i);
		i = getLastBookIndex();
		if(i >= MAX_BOOK_NUMBER -1) {
			System.out.println("");
			i = MAX_BOOK_NUMBER -1;
			return false; // can't add a new book
		}
		bookReg[i] = b; // book add in the last index of array
		return true;

	}
	public boolean addLoan(BookLoan l) {
		int i = -1;
		setLastLoanIndex(i);
		i = getLastLoanIndex();
		if (i >= MAX_LOAN_NUMBER-1) { 
			i = MAX_LOAN_NUMBER-1;   
			return false;			
		}	
		if (!userCanBorrow(l.getUser())) {
			return false;
		}
		if (!isBookLoaned(l.getBook())){
			return false;
		}
		if(userCanBorrow(l.getUser()) || isBookLoaned(l.getBook())){			

			loanReg[i] = l;
			loanReg[i].setBook(l.getBook()); 
			loanReg[i].setUser(l.getUser()); 
			return true;
		}

		return true;
	}
	public User findUser(String firstName, String lastName){

		for(User user : userReg) {
			if ((firstName.equals(user.getFirstName())) && 
					(lastName.equals(user.getLastName())))
				return user;
		}
		System.out.println("No user with this name!");
		return null;
	}

	public Book findBook(String isbnNumber) {

		for(Book book : bookReg) {
			if(book.getIsbnNumber().equals(isbnNumber)) 
				return book;
		}
		return null;
	}	

	public BookLoan findLoan(String isbnNumber) {
		int i = -1;
		int j = 0;
		for(BookLoan loan : loanReg) {
			if(loan.getBook().getIsbnNumber().equals(isbnNumber)) {
				i = j;
				break;
			}	System.out.println("No book loan found with this isbn number");

			j++;
		}
		return loanReg[i];

	}

	public boolean userCanBorrow(User u) {
		int limit = 0;
		for (BookLoan loan: loanReg) {
			if(loan == null) break;
			if(u.getId() == loan.getUser().getId()) {
				limit++;
			}
		}				
		if(limit >= MAX_LOAN_PER_USER) {	
			System.out.println("Can not loan more");
			return false;  
		}else {
			return true;  	
		}
	}
	public boolean isBookLoaned(Book b) {
		for(BookLoan loan : loanReg) {
			if (loan == null) {
				break;
			}
			if((loan.getBook().getIsbnNumber()).equals(b.getIsbnNumber())){
				loan.setBook(b);
				return true;  
			}
		}	
		return false;
	}
	public int getLastBookIndex() {
		return lastBookIndex;
	}
	public void setLastBookIndex(int lastBookIndex) {

		int i = 0;
		for(Book book : bookReg) {
			if(book == null) {
				lastBookIndex = i;
				break;}
			i++;	
		}
		LendingLibrary.lastBookIndex = lastBookIndex;
	}
	public int getLastUserIndex() {
		return lastUserIndex;
	}
	public void setLastUserIndex(int lastUserIndex) {
		int i = 0;
		for(User user : userReg) {
			if(user == null) {
				lastUserIndex = i;
				break;
			}
			i++;
		}
		LendingLibrary.lastUserIndex = lastUserIndex;
	}
	public int getLastLoanIndex() {
		return lastLoanIndex;
	}
	public void setLastLoanIndex(int lastLoanIndex) {

		for(int i = 0; i < loanReg.length; i++) {
			if(loanReg[i] == null)
				lastLoanIndex =i;
			//break;

		}
		LendingLibrary.lastLoanIndex = lastLoanIndex;
	}
	public Book[] getBookReg() {
		return bookReg;
		//	Book[] book = new Book[lastBookIndex];
		//	for(int i = 0;i < lastBookIndex; i++) {
		//		book[i] = bookReg[i];
		//	}
		//return book;
	}
	public void setBookReg(Book[] bookReg) {
		this.bookReg = bookReg;
	}
	public User[] getUserReg() {
		return userReg;
	}
	public void setUserReg(User[] userReg) {
		this.userReg = userReg;
	}
	public BookLoan[] getLoanReg() {
		return loanReg;
	}
	public void setLoanReg(BookLoan[] loanReg) {
		this.loanReg = loanReg;
	}

}
