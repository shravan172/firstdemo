package com.ojas.model;



import lombok.Data;

@Data
public class Response {
	private String dept;
	private long sumsal;
	public Response( ) {
		
	}
	public Response(String dept, long sumsal) {
		//super();
		this.dept = dept;
		this.sumsal = sumsal;
	}
	@Override
	public String toString() {
		return "Response [dept=" + dept + ", sumsal=" + sumsal + "]";
	}
	
	

}
