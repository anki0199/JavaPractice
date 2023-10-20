package com.app.core;

//ServicePlan charges : 
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000
public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private int servicePlanCost;
	
	private ServicePlan(int cost) {
		servicePlanCost=cost;
	}

	public int getServicePlanCost() {
		return servicePlanCost;
	}

	public void setServicePlanCost(int servicePlanCost) {
		this.servicePlanCost = servicePlanCost;
	}
	
	@Override
	public String toString() {
		return name()+" service plan cost is "+ servicePlanCost;
	}
}
