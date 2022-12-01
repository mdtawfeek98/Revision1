package com.json.prj;

public class Workflow {

	private String id;
	private String status ;
	private String definitionKey;
	private String userReference;
	private String customerInternalReference;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDefinitionKey() {
		return definitionKey;
	}
	public void setDefinitionKey(String definitionKey) {
		this.definitionKey = definitionKey;
	}
	public String getUserReference() {
		return userReference;
	}
	public void setUserReference(String userReference) {
		this.userReference = userReference;
	}
	public String getCustomerInternalReference() {
		return customerInternalReference;
	}
	public void setCustomerInternalReference(String customerInternalReference) {
		this.customerInternalReference = customerInternalReference;
	}
	
	
	
}
