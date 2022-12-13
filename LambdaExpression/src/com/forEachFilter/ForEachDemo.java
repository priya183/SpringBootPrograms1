package com.forEachFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		list.add("Priya");
		list.add("Neha");
		list.add("Mona");
		list.add("Ankita");
		list.add("Sonam");
		list.add("Megha");
		//simple forEach loop
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("**************");
		//for each using lambda exp
		list.stream().forEach(a->System.out.println(a));
		
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		map.forEach((key,value)->System.out.println(key+" "+value));
		//iteration using pipeline method
		System.out.println("*********8");
		map.entrySet().stream().forEach(o->System.out.println(o));
		System.out.println("*******");
		
		//ConsumerInterface
		Consumer<String> c=a->System.out.println(a);
		c.accept("Priya");
		System.out.println("******");
		//OR
		for(String s:list)
		{
			c.accept(s);
		}
		System.out.println("*******");
		list.forEach(cs->System.out.println(cs));
		System.out.println("*******");
		//get name start with m
		for(String s:list)
		{
			if(s.startsWith("M"))
			{
			System.out.println(s);
			}
		}
		System.out.println("********");
		//filter-internally uses Predicate interface
		list.stream().filter(s->s.startsWith("M")).forEach(s->System.out.println(s));
		System.out.println("*******");
		
		//print those value which having even key
		map.entrySet().stream().filter(key->key.getKey()%2==0).forEach(s->System.out.println(s));
			
	}
	

}
