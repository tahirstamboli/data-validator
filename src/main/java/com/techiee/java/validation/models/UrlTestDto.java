package com.techiee.java.validation.models;

public class UrlTestDto {


	private String jobName;
	
	private String testURL;

	private String textToSearch;

	private int pageLoadTimeOut = 7;

	private String type = "";

	private String executionStrategy;

	private String runUPA = "false";

	private String runCrawl = "false";

	public String getTestURL() {
		return testURL;
	}

	public void setTestURL(String testURL) {
		this.testURL = testURL;
	}

	public String getTextToSearch() {
		return textToSearch;
	}

	public void setTextToSearch(String textToSearch) {
		this.textToSearch = textToSearch;
	}

	public int getPageLoadTimeOut() {
		return pageLoadTimeOut;
	}

	public void setPageLoadTimeOut(int pageLoadTimeOut) {
		this.pageLoadTimeOut = pageLoadTimeOut;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExecutionStrategy() {
		return executionStrategy;
	}

	public void setExecutionStrategy(String executionStrategy) {
		this.executionStrategy = executionStrategy;
	}

	public String getRunUPA() {
		return runUPA;
	}

	public void setRunUPA(String runUPA) {
		this.runUPA = runUPA;
	}

	public String getRunCrawl() {
		return runCrawl;
	}

	public void setRunCrawl(String runCrawl) {
		this.runCrawl = runCrawl;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
