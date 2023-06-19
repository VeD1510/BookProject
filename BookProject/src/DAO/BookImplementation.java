package DAO;

import java.util.Scanner;

import Beans.BookInfo;

public class BookImplementation implements BookDetails {

	BookInfo[] book = new BookInfo[4];
	int count;
	Scanner sc = new Scanner(System.in);

	public BookImplementation() {
		count = 0;
		// book=new BookInfo[4];
	}

	@Override
	public void search() {
		System.out.println("Enter Book ID to Search: ");
		int id = sc.nextInt();
		
		for(int i=0;i<count;i++)
		{
			if(book[i].book_id==id )
			{
				System.out.println(book[i]);
			}
		}

	}

	@Override
	public void insert() {
		System.out.println("Enter the no .of book");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Entre the book_id");
			int bid = sc.nextInt();
			System.out.println("Enter the book_name");
			String bname = sc.next();
			System.out.println("enter the Price");
			int price = sc.nextInt();
			book[count] = new BookInfo(bid, bname, price);
			count++;

		}

	}

	@Override
	public void update() {
		System.out.println("Enter Book ID to Update: ");
		int id = sc.nextInt();
		System.out.println("entre the new Price");
		int price = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (book[i].book_id == id && book[i] != null) {
				book[i].price = price;
			}
		}

	}

	@Override
	public void delete() {
		System.out.println("Enter Book ID to Delete: ");
		int id = sc.nextInt();

		for (int i = 0; i < count; i++) {
			if (book[i] != null) {
				if (book[i].book_id == id) {
					book[i] = null;
				}
			}
		}
	}

	@Override
	public void displayAllBooks() {
	
		for (int i = 0; i < count; i++) {
			
			System.out.println(book[i]);
		}

	}

}
