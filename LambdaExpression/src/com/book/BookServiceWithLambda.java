package com.book;

import java.util.Collections;
import java.util.List;

public class BookServiceWithLambda {
	
	
	public List<Book> getSortedBook()
	{
	List<Book> list=new BookDao().getBook();
	//Ascending order
	//Collections.sort(list,((o1,o2)->o1.getName().compareTo(o2.getName())));
	
	//Descending order
	Collections.sort(list,((o1,o2)->o2.getName().compareTo(o1.getName())));
	return list;
	}
	public static void main(String[] args) {
		
		System.out.println(new BookService().getSortedBook());
	}

}
