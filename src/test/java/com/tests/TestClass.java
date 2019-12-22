package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.*;

import com.test.utils.TestUtils;


public class TestClass {

	@Test
	public void Test() {
		TestUtils util=new TestUtils();
		// Total Price of all subcriptions
		float subscriptionPrice = 0;
		String subscriptionList="TOI,HINDU,BM,ET,HT";
		HashMap<String, Float> subcriptionList = new HashMap<String, Float>();
		subcriptionList.putAll(util.getSubscriptionPrice(subscriptionList));
		for (Map.Entry<String, Float> entry : subcriptionList.entrySet()) {
			System.out.println("Monthy subcription price for :" + entry.getKey() + " is " + entry.getValue());
			subscriptionPrice = subscriptionPrice + entry.getValue();
		}
		System.out.println("Total Subscription Price for "+subscriptionList+" is : " + subscriptionPrice);
	}
}
