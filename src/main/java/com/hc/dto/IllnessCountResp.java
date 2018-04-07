package com.hc.dto;

public class IllnessCountResp {

	String id;
	String state;
	String count;
	
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IllnessCountResp [id=");
		builder.append(id);
		builder.append(", state=");
		builder.append(state);
		builder.append(", count=");
		builder.append(count);
		builder.append("]");
		return builder.toString();
	}	
}
