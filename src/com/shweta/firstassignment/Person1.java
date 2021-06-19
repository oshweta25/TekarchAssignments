package com.shweta.firstassignment;

public class Person1{
	/* create SYSO statement to print at-least 20 line of anything about yourself, no copy paste 
	 * instead of hard coding all names, age, address, phone etc.. use variables 
	 */	
	private String firstName;
	private String lastName;
	private int birthDay;
	private String phone;
	private boolean married;
	private boolean adult;
		
	// Use if else condition for isMarried variables. Age as adult or not. 
	public boolean isAdult() {
		return adult;
	}
 
	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public boolean isMarried() {
		return married;
	} 

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	//	Write a program to analyze the healthy persons height and weight 
	//	height is above 3 - 4 : Weight should be 15 - 30 
	//	height is above 4 - 5 : Weight should be 50 - 60 
	//	5 - 6 : 60 - 75 
	//	6 - 8 : 75 - 120

	public static String analyse (double height) {
		String weight;
		if(3 <= height && height <4) {
			weight = "15 - 50kgs";
			return weight;
		} else if (4 <= height && height <5) {
			weight = "50-60kgs";
			return weight;
		}else if(5 <= height && height <=6) {
			weight = "60 - 75kgs";
			return weight;
		}else if(6 < height && height <=8) {
			weight = "75 - 120kgs";
			return weight;
		}else {
			return ("Please enter height correctly.");
		}
	}

	public static void main(String[] args) {
		Person1 me = new Person1();
		
		me.setFirstName("Shweta");
		me.setLastName("Ojha");
		me.setBirthDay(10);
		me.setMarried(true);
		me.setAdult(true);
		
		if(me.isMarried()){
			System.out.println(me.getFirstName()+" "+me.getLastName()+" is married.");
		}else { 
			System.out.println(me.getFirstName()+" "+me.getLastName()+" is not married.");
		}
		System.out.println( "First Name = " + me.getFirstName() + ",\nLast Name = " + me.getLastName() + "\nBirthday = " + me.getBirthDay() + "\nMarried = " + me.isMarried() +"\nAdult = " + me.isAdult());
		System.out.println("Your weight should be between "+ 
		analyse(4.5)+"." );
	}
}	

