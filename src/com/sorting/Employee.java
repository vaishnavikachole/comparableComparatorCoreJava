package com.sorting;

public class Employee //implements Comparable<Employee>{
{
	private int employeeCode;
    private String employeeName;
    private long mobileNumber;
    
    public int getEmployeeCode() {
    	return employeeCode;
    }
    public String getEmployeeName() {
    	return employeeName;
    }
    public long getMobileNumber() {
    	return mobileNumber;
    }
    
    public Employee(int employeeCode, String employeeName, long mobileNumber) {
    	this.employeeCode = employeeCode;
    	this.employeeName = employeeName;
    	this.mobileNumber = mobileNumber;
    }
    
	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", mobileNumber="
				+ mobileNumber + "]";
	}
//	public int compareTo(Employee o) {
//	
//		 return this.employeeCode-o.employeeCode;
//		 
//	}
	
    
}
