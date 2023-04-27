package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {
	
	public void addList() {
//		List<Integer> list = new ArrayList<>();
//		list.add(90);
//		list.add(56);
//		list.add(569);
//		list.add(789);
//        Collections.sort(list);
//		System.out.println(list);
		
		List<Employee> list =new ArrayList<>();
		list.add(new Employee(25,"Reena Mule",456789520));
		list.add(new Employee(16,"shivani dixit",1098765441));
		list.add(new Employee(13,"revati sharma",876789011));
		System.out.println(list);
//		Collections.sort(list);
		Collections.sort(list,new IdComparator());
		System.out.println(list);
		
		
	}
	
	
	public static void main(String[] args) {
		Arraylist al = new Arraylist();
		al.addList();
	}

}
