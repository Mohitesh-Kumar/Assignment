package com.test.toi;

public class ToiParam {

	float mondayPrice;
	float tuesdayPrice;
	float wednesdayPrice;
	float thursdayPrice;
	float FridayPrice;
	float saturdayPrice;
	float sundayPrice;
	
	public float getMondayPrice() {
		return mondayPrice;
	}
	public void setMondayPrice(float mondayPrice) {
		this.mondayPrice = mondayPrice;
	}
	public float getTuesdayPrice() {
		return tuesdayPrice;
	}
	public void setTuesdayPrice(float tuesdayPrice) {
		this.tuesdayPrice = tuesdayPrice;
	}
	public float getWednesdayPrice() {
		return wednesdayPrice;
	}
	public void setWednesdayPrice(float wednesdayPrice) {
		this.wednesdayPrice = wednesdayPrice;
	}
	public float getThursdayPrice() {
		return thursdayPrice;
	}
	public void setThursdayPrice(float thursdayPrice) {
		this.thursdayPrice = thursdayPrice;
	}
	public float getFridayPrice() {
		return FridayPrice;
	}
	public void setFridayPrice(float fridayPrice) {
		FridayPrice = fridayPrice;
	}
	public float getSaturdayPrice() {
		return saturdayPrice;
	}
	public void setSaturdayPrice(float saturdayPrice) {
		this.saturdayPrice = saturdayPrice;
	}
	public float getSundayPrice() {
		return sundayPrice;
	}
	public void setSundayPrice(float sundayPrice) {
		this.sundayPrice = sundayPrice;
	}
	
	@Override
	public String toString() {
		return "ToiParam [mondayPrice=" + mondayPrice + ", tuesdayPrice=" + tuesdayPrice + ", wednesdayPrice="
				+ wednesdayPrice + ", thursdayPrice=" + thursdayPrice + ", FridayPrice=" + FridayPrice
				+ ", saturdayPrice=" + saturdayPrice + ", sundayPrice=" + sundayPrice + "]";
	}

}
