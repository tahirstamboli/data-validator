package com.techiee.java.validation.core;

import org.apache.commons.lang3.StringUtils;

import com.techiee.java.validation.models.UrlTestDto;

/**
 * Validator class that validates all required fields for url test.
 * 
 * @author Tahir
 *
 */

public enum UrlTestDataValidator implements Validator<UrlTestDto> {
	NAME {

		@Override
		public ValidationResult validate(UrlTestDto input) {
			ValidationResult result = new ValidationResult();
			if (StringUtils.isEmpty(input.getJobName()))
				result.setErrorMessage("Name can not be empty for url test.");
			return result;
		}

	},

	URL {
		@Override
		public ValidationResult validate(UrlTestDto input) {
			ValidationResult result = new ValidationResult();
			boolean empty = StringUtils.isEmpty(input.getTestURL());
			if (empty) {
				result.setErrorMessage("Application url can not be empty for url test.");
			} else if (!ValidationUtils.validateUrl(input.getTestURL())) {
				result.setErrorMessage("Application url is not valid.");
			}

			return result;
		}
	},

	TEXT_TO_SEARCH {

		@Override
		public ValidationResult validate(UrlTestDto input) {
			ValidationResult result = new ValidationResult();
			if (StringUtils.isEmpty(input.getTextToSearch()))
				result.setErrorMessage("Text to search can not be empty for url test.");
			return result;
		}

	},
	PAGE_LOAD_TIMEOUT {

		@Override
		public ValidationResult validate(UrlTestDto input) {
			ValidationResult result = new ValidationResult();
			boolean valid = ValidationUtils.checkNumberWithRangeInclusive(0, 600, input.getPageLoadTimeOut());
			if (!valid)
				result.setErrorMessage("Page load timeout for url test must be between 0 to 600.");
			return result;
		}
	};

}
