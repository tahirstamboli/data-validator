package com.techiee.java.validation.core;

import java.util.List;

/**
 * 
 * @author Tahir
 *
 */
public interface ValidationContext<T> {
	public ValidationResult execute(T input);

	public List<ValidationResult> executeAndGetList(T input);
}
