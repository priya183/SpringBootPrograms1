package com.book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> getSortedBook()
	{
		List<Book> book=new BookDao().getBook();
		Collections.sort(book, new MyComparator());
		return book;
 	}
	public static void main(String[] args) {
		
		System.out.println(new BookService().getSortedBook());
	}

}

class MyComparator implements Comparator<Book>
{
	/*
    //Ascending order
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
	*/
	
	//Descending order
	@Override
	public int compare(Book o1, Book o2) {
		return o2.getName().compareTo(o1.getName());
	}
}
