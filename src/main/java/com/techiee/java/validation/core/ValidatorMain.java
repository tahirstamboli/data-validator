package com.techiee.java.validation.core;

import com.techiee.java.validation.models.UrlTestDto;

public class ValidatorMain {
	public static void main(String[] args) {
		ValidationContext<UrlTestDto> context = new UrlTestValidationContext();
		UrlTestDto dto = new UrlTestDto();
		dto.setTestURL("http://google.com");
		dto.setTextToSearch("Gmail");
		dto.setPageLoadTimeOut(10);
		ValidationResult result = context.execute(dto);
		System.out.println(result);
	}
}
