package com.shweta.assignment.inheritance;

public class OperatingSystem {
	
	private Version version;
	private String name;
	private String releaseName;
	
	public OperatingSystem(String name, Version version) {
		this.name = name;
		this.version = version;
	}

	public Version getVersion() {
		return version;
	}

	public String getName() {
		return name;
	}

	public String getReleaseName() {
		return releaseName;
	}
	
	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}
	
	public String getReleaseNameAsString() {
		return releaseName;
	}
	
	public void run() {
		System.out.println("Running Operating System..");
	}
	
	public String toString() {
		return "Name : " + name + ", ReleaseName = " + releaseName + ", Version = " + version.getVersionAsString(); 
	}
	
}





























//public Version getVersion() {
//	return version;
//}
//
//public String getName() {
//	return name;
//}
//
//public String getReleaseName() {
//	return releaseName;
//}
//
//public void setReleaseName(String releaseName) {
//	this.releaseName = releaseName;
//}
//
//public String toString() {
//	return "Name = "  + name + ", release = " + releaseName + ", version = " + version.getVersionAsString();
//}