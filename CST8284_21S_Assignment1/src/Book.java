
public class Book {
	private String title;
	private String author;
	private String publicationDate;
	private String isbnNumber;
	
	public Book() {
		
	}
	public Book (String title, String author, String publicationDate, 
			String isbnNumber) {
		
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.isbnNumber = isbnNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
//		if(verifyISBNNumber(isbnNumber))
		this.isbnNumber = isbnNumber;
	}
	public boolean verifyISBNNumber(String s) {

//		if(s.length() == 10) {  
		return true;
//		}
//		return false;
//			
	}

	
	public String toString() {
         return( "\n*************Title: "
        		 + title + 
        		 "\n*************Author: "
        		 + author +
        		 "\n*************Publication Year: "
        		 + publicationDate +
        		 "\n*************ISBN: "
        		 + isbnNumber + "\n ");
	}
	public Book getBook() {
		return this;
	}
}
