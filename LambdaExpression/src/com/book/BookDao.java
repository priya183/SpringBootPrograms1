package com.book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBook()
	{
		List<Book> list=new ArrayList<>();
		list.add(new Book(1,"CSS",1000));
		list.add(new Book(2,"HTML",800));
		list.add(new Book(3,"JAVA",1200));
		list.add(new Book(4,"C++",700));
		list.add(new Book(5,"C",1500));
		return list;
	}

}
