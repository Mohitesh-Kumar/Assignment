package com.test.utils;

import java.util.HashMap;

public interface NewspaperBillInterface {
	
	public void setPrices(float mondayPrice, float tuesdayPrice, float wednesdayPrice, float thursdayPrice,
	float fridayPrice, float saturdayPrice, float sundayPrice);
	
	public float calculateMonthlyBill(HashMap<String, Integer> dayCountHashMap);
}
