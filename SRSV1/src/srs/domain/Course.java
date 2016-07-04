package srs.domain;

import java.util.ArrayList;

public class Course {

	private String courseName;
	private String courseNo;
	private double credits;
	private ArrayList<Section> offeredAsSection;
	private ArrayList<Course> prerequisites; 
	
	public Course(String courseName, String courseNo, double credits) {
		this.setCourseName(courseName);
		this.setCourseNo(courseNo);
		this.setCredits(credits);
		offeredAsSection = new ArrayList<Section>();
		prerequisites = new ArrayList<Course>();
	}
	
	public Course() {
		
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public ArrayList<Section> getOfferedAsSection() {
		return offeredAsSection;
	}
	public void setOfferedAsSection(ArrayList<Section> offeredAsSection) {
		this.offeredAsSection = offeredAsSection;
	}
	public ArrayList<Course> getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(ArrayList<Course> prerequisites) {
		
		this.prerequisites = prerequisites;
	}

}
