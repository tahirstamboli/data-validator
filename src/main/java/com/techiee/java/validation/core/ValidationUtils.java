package com.techiee.java.validation.core;

import java.net.URL;

public class ValidationUtils {
	public static boolean checkNumberWithRangeInclusive(int from, int to, int number) {
		if (number >= from && number <= to) {
			return true;
		}
		return false;
	}

	/**
	 * Validate if test url is provided.
	 * 
	 * @param testURL
	 */
	public static boolean validateUrl(String testURL) {
		boolean valid = true;
		try {
			URL u = new URL(testURL);
			u.toURI();
		} catch (Exception e) {
			valid = false;
		}
		return valid;
	}
}
