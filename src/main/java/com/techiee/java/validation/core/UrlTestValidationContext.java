package com.techiee.java.validation.core;

import java.util.LinkedHashSet;
import java.util.Set;

import com.techiee.java.validation.models.UrlTestDto;

/**
 * 
 * @author Tahir
 *
 */
public class UrlTestValidationContext extends AbstractValidationContext<UrlTestDto> {

	@Override
	public Set<Validator<UrlTestDto>> getValidationContext() {
		Set<Validator<UrlTestDto>> validationContext = new LinkedHashSet<Validator<UrlTestDto>>();
		for (UrlTestDataValidator validator : UrlTestDataValidator.values()) {
			validationContext.add(validator);
		}
		return validationContext;
	}
}
