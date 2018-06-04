package com.luv2code.springdemo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=MyConstraintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface DeptLenght {
	
	public int value() default 6;
	public String message() default "Dept name should have min. 6 char in it.";


	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
}
