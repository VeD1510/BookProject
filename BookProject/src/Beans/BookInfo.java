package Beans;

public class BookInfo {
	
	public int book_id;
	public String bookName;
	public int price;
	
	public BookInfo(int book_id,String bookName,int price)
	{
		this.book_id=book_id;
		this.bookName=bookName;
		this.price=price;
	}
	public String toString()
	{
		return book_id+" "+bookName+" "+price;
	}
	
	
	
	

}

