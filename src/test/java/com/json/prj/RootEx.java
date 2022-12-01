package com.json.prj;

import java.util.List;

public class RootEx {

	private Workflow workflow;
	private Account account;
	private String createdAt;
	private String completedAt;
	private List<Credentials> credentials;
	private Decision decision;
	private Steps steps;
	private Capabilities capabilities;
	
	public Workflow getWorklfow() {
    	return workflow;
    }
	
    public void setWorkFlow(Workflow name){
        this.workflow = name;
    }



    public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(String completedAt) {
		this.completedAt = completedAt;
	}

	public List<Credentials> getCredentials() {
		return credentials;
	}

	public void setCredentials(List<Credentials> credentials) {
		this.credentials = credentials;
	}

	public Decision getDecision() {
		return decision;
	}

	public void setDecision(Decision decision) {
		this.decision = decision;
	}

	public Steps getSteps() {
		return steps;
	}

	public void setSteps(Steps steps) {
		this.steps = steps;
	}

	public Capabilities getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

}
