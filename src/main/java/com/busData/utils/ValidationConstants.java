package com.busData.utils;

public enum ValidationConstants {
	
	BUS_NOT_FOUND("bus.not.found"), BUS_ALREADY_EXIST("bus.already.exist"),

	DIRECTOR_FIRST_NAME_NOT_EMPTY("director.firstName.notEmpty"),
	DIRECTOR_LAST_NAME_NOT_EMPTY("director.lastName.notEmpty"),
	DIRECTOR_CONTACT_NUMBER_PATTERN("director.contactNumber.pattern"), 
	DIRECTOR_EMAIL_PATTERN("director.email.pattern"),

	ROUTE_NOT_FOUND("Route.not.Found"),
	SOMETHING_WENT_WRONG("somthing.went.wrong");

	private final String messageKey;

	ValidationConstants(String messageKey) {
		this.messageKey = messageKey;
	}

	public String getMessageKey() {
		return messageKey;
	}
	
	@Override
	public String toString() {
		return this.messageKey;
	}
}
