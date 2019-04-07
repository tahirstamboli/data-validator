package com.techiee.java.validation.main;

import com.techiee.java.validation.core.UrlTestValidationContext;
import com.techiee.java.validation.core.ValidationContext;
import com.techiee.java.validation.core.ValidationResult;
import com.techiee.java.validation.models.UrlTestDto;

public class ValidatorMain {
	public static void main(String[] args) {
		ValidationContext<UrlTestDto> context = new UrlTestValidationContext();
		
		UrlTestDto dto = new UrlTestDto();
		dto.setJobName("TestJob");
		dto.setTestURL("http://google.com");
		dto.setTextToSearch("Gmail");
		dto.setPageLoadTimeOut(10);
		ValidationResult result = context.execute(dto);
		System.out.println(result);
	}
}
