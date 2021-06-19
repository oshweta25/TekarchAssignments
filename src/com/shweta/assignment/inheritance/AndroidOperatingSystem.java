package com.shweta.assignment.inheritance;

public class AndroidOperatingSystem extends MobileOperatingSystem {
	
	public static final String NAME = "Android";
	
	public AndroidOperatingSystem(Version version) {
		super(NAME, version);
	}
	
	public void run() {
		System.out.println("Android Operating System running");
	}
	
	public static void main (String[] args) {
		
		Version version = new Version(11,11,11);
		OperatingSystem os1 = new AndroidOperatingSystem(version);
		OperatingSystem os2 = new IOSOperatingSystem(version);
		os1.run();
		os2.run();
		
	}

}
