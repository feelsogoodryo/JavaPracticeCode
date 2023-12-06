package dokoJavaPractice;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> {
	//DokoJava2PracticeOne
	private String title;
	private Date publishDate;
	private String comment;
	
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
	    return this.publishDate;
	}
	public void setPublishDate(Date publishDate) {
	    this.publishDate = publishDate;
	}
	public String getComment() {
	    return this.comment;
	  }
	public void setComment(String comment) {
	    this.comment = comment;
	}
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if(!(o instanceof Book)) return false;
	    	Book r = (Book) o;
	 	if (!this.title.trim().equals(r.title.trim())) {
	 		return false;
	 	}
	 	if(!this.publishDate.equals(r.publishDate)) {
	 		return false;
	 	}
	   		return true;
	}
	public int compareTo(Book obj) {
		return this.publishDate.compareTo(publishDate);
	}
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = this.publishDate;
		result.comment = this.comment;
		return result;
	}
}
