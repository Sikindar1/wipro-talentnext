package com.mile1.exception;

public class NullStudentobjectException extends Exception{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	public NullStudentobjectException () {
		super("NullStudentObjectException occurred");
	}
	public String toString() {
		return "object is null";
	} 
}
