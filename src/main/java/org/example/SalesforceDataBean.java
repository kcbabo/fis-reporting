package org.example;

import java.util.Random;

import org.apache.camel.Message;

public class SalesforceDataBean {

	private Random random = new Random();
	
	enum REGION {NORTH, SOUTH, EAST, WEST};
	enum CAMPAIGN {AAR, YZZ, ERS};
	
	public void setData(Message message) {
		setRegion(message);
		setCampaign(message);
	}
	
	public void setRegion(Message message) {
		message.setHeader("regionId", REGION.values()[random.nextInt(4)].toString());
	}
	
	public void setCampaign(Message message) {
		message.setHeader("campaignId", CAMPAIGN.values()[random.nextInt(3)].toString());
	}
	
}
