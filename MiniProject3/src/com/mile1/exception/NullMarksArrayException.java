package com.mile1.exception;

public class NullMarksArrayException extends Exception{
  /**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
  public NullMarksArrayException () {
	  super("NullMarksArrayException occurred");
  }
	public String toString() {
		return "marks arry is null";
	}
}