package com.techiee.java.validation.core;

/**
 * 
 * @author Tahir
 *
 */
public interface Validator<T> {
	public ValidationResult validate(T input);
}
