package com.techiee.java.validation.core;

/**
 * 
 * @author Tahir
 *
 */
public class ValidationResult {
	private boolean valid = true;
	private String errorMessage;

	public ValidationResult() {
	}

	public ValidationResult(String errorMessage) {
		this.errorMessage = errorMessage;
		this.valid = false;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public void setErrorMessage(String errorMessage) {
		this.valid = false;
		this.errorMessage = errorMessage;
	}

	public boolean isValid() {
		return valid;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public String toString() {
		return "ValidationResult [valid=" + valid + ", errorMessage=" + errorMessage + "]";
	}

}
