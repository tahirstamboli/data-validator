package com.techiee.java.validation.core;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Tahir
 *
 */
public abstract class AbstractValidationContext<T>
		implements ValidationContext<T> {

	public ValidationResult execute(T input) {
		Set<Validator<T>> validationContext = getValidationContext();
		for (Validator<T> validator : validationContext) {
			ValidationResult result = validator.validate(input);
			if (!result.isValid())
				return validator.validate(input);
		}
		return new ValidationResult();
	}

	public List<ValidationResult> executeAndGetList(T input) {
		Set<Validator<T>> validationContext = getValidationContext();
		List<ValidationResult> results = new LinkedList<ValidationResult>();
		for (Validator<T> validator : validationContext) {
			results.add(validator.validate(input));
		}
		return results;

	}

	public abstract Set<Validator<T>> getValidationContext();
}
