package com.test.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.testng.annotations.BeforeSuite;

import com.test.ET.ETBuilder;
import com.test.Hindu.HinduBuilder;
import com.test.toi.ToiBuilder;
import com.test.toi.ToiParam;

public class TestUtils extends ToiParam {
	NewspaperBillInterface toiBuilder = new ToiBuilder();
	NewspaperBillInterface hinduBuilder = new HinduBuilder();
	NewspaperBillInterface etBuilder = new ETBuilder();

	@BeforeSuite
	public void setup()
	{
		toiBuilder.setPrices(3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 5.0f, 6.0f);
		hinduBuilder.setPrices(3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 5.0f, 6.0f);
		etBuilder.setPrices(3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 5.0f, 6.0f);
	}
	private Date getFirstDateofMonth() throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DATE));
		Date date = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formattedDate = formatter.format(date);
		Date firstDateofMonth = formatter.parse(formattedDate);
		return firstDateofMonth;

	}

	private Date getLastDateofMonth() throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
		Date date = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formattedDate = formatter.format(date);
		Date LastDateofMonth = formatter.parse(formattedDate);
		return LastDateofMonth;

	}

	private HashMap<String, Integer> weekdayCountforCurrentMonth() {
		HashMap<String, Integer> dayCountMap = new HashMap<String, Integer>();
		try {

			dayCountMap.put("SUNDAY", 0);
			dayCountMap.put("MONDAY", 0);
			dayCountMap.put("TUESDAY", 0);
			dayCountMap.put("WEDNESDAY", 0);
			dayCountMap.put("THURSDAY", 0);
			dayCountMap.put("FRIDAY", 0);
			dayCountMap.put("SATURDAY", 0);
			Date Firstdate = getFirstDateofMonth();
			Date Lastdate = getLastDateofMonth();

			Calendar startDate = Calendar.getInstance();
			startDate.setTime(Firstdate);

			Calendar endDate = Calendar.getInstance();
			endDate.setTime(Lastdate);

			while (!startDate.after(endDate)) {

				if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
					dayCountMap.put("MONDAY", dayCountMap.get("MONDAY") + 1);
				}
				if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
					dayCountMap.put("TUESDAY", dayCountMap.get("TUESDAY") + 1);
				}
				if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
					dayCountMap.put("WEDNESDAY", dayCountMap.get("WEDNESDAY") + 1);
				}
				if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
					dayCountMap.put("THURSDAY", dayCountMap.get("THURSDAY") + 1);
				}
				if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
					dayCountMap.put("FRIDAY", dayCountMap.get("FRIDAY") + 1);
				}
				if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					dayCountMap.put("SATURDAY", dayCountMap.get("SATURDAY") + 1);
				}
				if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					dayCountMap.put("SUNDAY", dayCountMap.get("SUNDAY") + 1);
				}
				startDate.add(Calendar.DATE, 1);
			}

		}

		catch (Exception e) {
			e.printStackTrace();

		}
		return dayCountMap;
	}

	public HashMap<String, Float> getSubscriptionPrice(String ListofNewsaper) {
		HashMap<String, Float> subcriptionList = new HashMap<String, Float>();
	try {	if (!ListofNewsaper.isEmpty()) {
			
			String[] list = ListofNewsaper.split(",");
			for (int i = 0; i < list.length; i++) {
				if (list[i].equalsIgnoreCase("TOI")) {
					float TOISum = (toiBuilder.calculateMonthlyBill(weekdayCountforCurrentMonth()));
					subcriptionList.put(list[i], TOISum);
				}
				
				if (list[i].equalsIgnoreCase("HINDU")) {
					float hinduSum = (hinduBuilder.calculateMonthlyBill(weekdayCountforCurrentMonth()));
					subcriptionList.put(list[i], hinduSum);
				}
				if (list[i].equalsIgnoreCase("ET")) {
					float etSum = (etBuilder.calculateMonthlyBill(weekdayCountforCurrentMonth()));
					subcriptionList.put(list[i], etSum);
				}


			}
	}}
	catch(Exception e) {e.printStackTrace();
	}
		return subcriptionList;}
}

