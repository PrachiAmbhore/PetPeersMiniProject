package com.casestudy.exception;

public class UserException extends Exception {

	private String exceptionMsg;
	   
	   public UserException(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }
	   public String getExceptionMsg(){
	      return this.exceptionMsg;
	   }
	   public void setExceptionMsg(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }
}
