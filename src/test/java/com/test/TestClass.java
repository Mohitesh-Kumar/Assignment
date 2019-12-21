package com.test;
import org.testng.annotations.*;

import com.test.toi.ToiBuilder;
import com.test.utils.NewspaperBillInterface;
import com.test.utils.TestUtils;
public class TestClass extends TestUtils {
	NewspaperBillInterface toiReference= new ToiBuilder();
	
	@BeforeSuite
	public void setup()
	{
		toiReference.setPrices(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
	}
	@Test
	public void Test()
	{
		System.out.println((toiReference.calculateMonthlyBill(weekdayCountforCurrentMonth())));
		
	}

}
