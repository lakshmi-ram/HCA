package com.hc.dto;

public class StateMetaData {
	String id;
	String state;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StateMetaData [id=");
		builder.append(id);
		builder.append(", state=");
		builder.append(state);
		builder.append("]");
		return builder.toString();
	}
	
}
