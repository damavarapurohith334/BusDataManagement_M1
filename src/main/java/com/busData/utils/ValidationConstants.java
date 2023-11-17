package com.busData.utils;

public enum ValidationConstants {

	BUS_NOT_FOUND("bus.not.found"), BUS_ALREADY_EXIST("bus.already.exist"),

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
