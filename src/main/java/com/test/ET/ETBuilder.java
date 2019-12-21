package com.test.ET;

import java.util.*;
import java.util.Map.Entry;

import com.test.utils.NewspaperBillInterface;

public class ETBuilder extends ETParam implements NewspaperBillInterface{

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
		System.out.println("Subscription plan for ET \n");
		System.out.println("Day       | "+"count |"+" Price |"+" Total ");
		// using for-each loop for iteration over Map.entrySet()
		for (Entry<String, Integer> entry : daycount.entrySet()) {
			//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			if (entry.getKey().equalsIgnoreCase("SUNDAY")) {
				//sum = sum + (entry.getValue() * getSundayPrice());
				float dayCount= entry.getValue();float Price=getSundayPrice();float Total= dayCount*Price;
				sum=sum+Total;
				System.out.println(entry.getKey()+"    |"+dayCount+"    |"+Price+"    |  "+Total);
			}
			if (entry.getKey().equalsIgnoreCase("MONDAY")) {
				//sum = sum + (entry.getValue() * getMondayPrice());
				float dayCount= entry.getValue();float Price=getMondayPrice();float Total= dayCount*Price;
				sum=sum+Total;
				System.out.println(entry.getKey()+"    |"+dayCount+"    |"+Price+"    |  "+Total);
			}
			if (entry.getKey().equalsIgnoreCase("TUESDAY")) {
				//sum = sum + (entry.getValue() * getTuesdayPrice());
				float dayCount= entry.getValue();float Price=getTuesdayPrice();float Total= dayCount*Price;
				sum=sum+Total;
				System.out.println(entry.getKey()+"   |"+dayCount+"    |"+Price+"    |  "+Total);
			}
			if (entry.getKey().equalsIgnoreCase("WEDNESDAY")) {
				//sum = sum + (entry.getValue() * getWednesdayPrice());
				float dayCount= entry.getValue();float Price=getWednesdayPrice();float Total= dayCount*Price;
				sum=sum+Total;
				System.out.println(entry.getKey()+" |"+dayCount+"    |"+Price+"    |  "+Total);
			}
			if (entry.getKey().equalsIgnoreCase("THURSDAY")) {
				//sum = sum + (entry.getValue() * getThursdayPrice());
				float dayCount= entry.getValue();float Price=getThursdayPrice();float Total= dayCount*Price;
				sum=sum+Total;
				System.out.println(entry.getKey()+"  |"+dayCount+"    |"+Price+"    |  "+Total);
			}
			if (entry.getKey().equalsIgnoreCase("FRIDAY")) {
				//sum = sum + (entry.getValue() * getFridayPrice());
				float dayCount= entry.getValue();float Price=getFridayPrice();float Total= dayCount*Price;
				sum=sum+Total;
				System.out.println(entry.getKey()+"    |"+dayCount+"    |"+Price+"    |  "+Total);
			}
			if (entry.getKey().equalsIgnoreCase("SATURDAY")) {
				//sum = sum + (entry.getValue() * getSaturdayPrice());
				float dayCount= entry.getValue();float Price=getSaturdayPrice();float Total= dayCount*Price;
				sum=sum+Total;
				System.out.println(entry.getKey()+"  |"+dayCount+"    |"+Price+"    |  "+Total);
			}

		}
		System.out.println("_________________________________");
		System.out.println("Subscription price for ET | "+ sum);
		System.out.println("_________________________________");
		return sum;
	}

}
