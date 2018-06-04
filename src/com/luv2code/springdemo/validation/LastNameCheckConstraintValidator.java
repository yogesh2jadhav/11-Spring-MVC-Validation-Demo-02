package com.luv2code.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LastNameCheckConstraintValidator implements ConstraintValidator<LastNameCheck, String> {

	int leng ;
	
	@Override
	public void initialize(LastNameCheck constraintAnnotation) {
		// TODO Auto-generated method stub
		leng = constraintAnnotation.nameLength();
	}
	
	@Override
	public boolean isValid(String lastName, ConstraintValidatorContext theContext) {
		// TODO Auto-generated method stub
		boolean res=true;
		if(lastName!=null) {
			if(lastName.length()>leng)
				res=true;
			else
				res=false;
		}
		else
			res=false;
		return res;
	}

}
