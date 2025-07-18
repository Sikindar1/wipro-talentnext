package com.mile1.exception;

public class NullnameException extends Exception{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	public NullnameException() {
        super("NullNameException occurred");
    }
	public String toString() {
		
		return "name is null";
	}
}