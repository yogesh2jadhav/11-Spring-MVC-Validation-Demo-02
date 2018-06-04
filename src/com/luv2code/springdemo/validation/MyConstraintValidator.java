package com.luv2code.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyConstraintValidator implements ConstraintValidator<DeptLenght, String>{

	int a;
	
	
	@Override
	public void initialize(DeptLenght constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
		a=constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(String dataFromForm, ConstraintValidatorContext theContext) {
		// TODO Auto-generated method stub
		boolean result=false ; 
		if(dataFromForm==null) {
			result=false;
		}
		else if(dataFromForm.length()<a){
			result=false;
		}
			 
		return result;
		
	}

}
