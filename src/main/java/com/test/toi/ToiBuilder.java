package com.test.toi;

import java.util.HashMap;
import java.util.Map.Entry;

import com.test.utils.NewspaperBillInterface;

public class ToiBuilder extends ToiParam implements NewspaperBillInterface{

	public void setPrices(float mondayPrice, float tuesdayPrice, float wednesdayPrice, float thursdayPrice,
			float fridayPrice, float saturdayPrice, float sundayPrice) {
		setSundayPrice(sundayPrice);
		setMondayPrice(mondayPrice);
		setTuesdayPrice(tuesdayPrice);
		setWednesdayPrice(wednesdayPrice);
		setThursdayPrice(thursdayPrice);
		setFridayPrice(fridayPrice);
		setSaturdayPrice(saturdayPrice);

	}

	public float calculateMonthlyBill(HashMap<String, Integer> dayCountHashMap) {
		HashMap<String, Integer> daycount = new HashMap<String, Integer>();
		daycount.putAll(dayCountHashMap);
		float sum = 0;
		// using for-each loop for iteration over Map.entrySet()
		for (Entry<String, Integer> entry : daycount.entrySet()) {
			//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			if (entry.getKey().equalsIgnoreCase("SUNDAY")) {
				sum = sum + (entry.getValue() * getMondayPrice());
			}
			if (entry.getKey().equalsIgnoreCase("MONDAY")) {
				sum = sum + (entry.getValue() * getSundayPrice());
			}
			if (entry.getKey().equalsIgnoreCase("TUESDAY")) {
				sum = sum + (entry.getValue() * getTuesdayPrice());
			}
			if (entry.getKey().equalsIgnoreCase("WEDNESDAY")) {
				sum = sum + (entry.getValue() * getWednesdayPrice());
			}
			if (entry.getKey().equalsIgnoreCase("THURSDAY")) {
				sum = sum + (entry.getValue() * getThursdayPrice());
			}
			if (entry.getKey().equalsIgnoreCase("FRIDAY")) {
				sum = sum + (entry.getValue() * getFridayPrice());
			}
			if (entry.getKey().equalsIgnoreCase("SATURDAY")) {
				sum = sum + (entry.getValue() * getSaturdayPrice());
			}

		}
		return sum;
	}

}
