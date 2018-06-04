package com.luv2code.springdemo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.luv2code.springdemo.validation.DeptLenght;
import com.luv2code.springdemo.validation.LastNameCheck;
 
public class Customer {

	@NotNull(message="This can't be null.")
	public String firstName;
	
	@LastNameCheck(message="Customer Last name should be min. 6 char.")
	public String lastName;
	
	@Min (value=18, message="Minimum 18")
	public Integer age;
	
	@NotNull(message="This can't be null. Please Enter your dept")
	@DeptLenght(value=6, message="Dempt name must have min. 6 Char.")
	public String dept;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
