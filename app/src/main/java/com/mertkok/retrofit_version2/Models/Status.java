package com.mertkok.retrofit_version2.Models;

public class Status{
	private Object errorMessage;
	private int elapsed;
	private int totalCount;
	private int creditCount;
	private int errorCode;
	private String timestamp;
	private Object notice;

	public void setErrorMessage(Object errorMessage){
		this.errorMessage = errorMessage;
	}

	public Object getErrorMessage(){
		return errorMessage;
	}

	public void setElapsed(int elapsed){
		this.elapsed = elapsed;
	}

	public int getElapsed(){
		return elapsed;
	}

	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public void setCreditCount(int creditCount){
		this.creditCount = creditCount;
	}

	public int getCreditCount(){
		return creditCount;
	}

	public void setErrorCode(int errorCode){
		this.errorCode = errorCode;
	}

	public int getErrorCode(){
		return errorCode;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}

	public void setNotice(Object notice){
		this.notice = notice;
	}

	public Object getNotice(){
		return notice;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"error_message = '" + errorMessage + '\'' + 
			",elapsed = '" + elapsed + '\'' + 
			",total_count = '" + totalCount + '\'' + 
			",credit_count = '" + creditCount + '\'' + 
			",error_code = '" + errorCode + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			",notice = '" + notice + '\'' + 
			"}";
		}
}
