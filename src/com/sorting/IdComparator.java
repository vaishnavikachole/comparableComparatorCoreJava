package com.sorting;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getEmployeeCode()-o2.getEmployeeCode();
	}

}
