package com.Predefined.functional;

public final class CustomImmutable {

	private int id;
	private String data;

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public CustomImmutable(int id, String data) {
		this.id = id;
		this.data = data;
	}

}
