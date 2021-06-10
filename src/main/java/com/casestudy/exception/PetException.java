package com.casestudy.exception;

public class PetException  extends Exception{
	private String exceptionMsg;
	   
	   public PetException(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }
	   public String getExceptionMsg(){
	      return this.exceptionMsg;
	   }
	   public void setExceptionMsg(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }

}
