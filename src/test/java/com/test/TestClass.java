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
		toiReference.setPrices(3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 5.0f, 6.0f);
	}
	@Test
	public void Test()
	{
		float sum=(toiReference.calculateMonthlyBill(weekdayCountforCurrentMonth()));
		System.out.println(sum);
	}

}
