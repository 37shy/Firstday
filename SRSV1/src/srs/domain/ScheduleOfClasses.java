package srs.domain;

import java.util.HashMap;

public class ScheduleOfClasses {
	private String semester;
	private HashMap<String, Section> sectionsOffered;
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public HashMap<String, Section> getSectionsOffered() {
		return sectionsOffered;
	}
	
	public void setSectionsOffered(HashMap<String, Section> sectionsOffered) {
		this.sectionsOffered = sectionsOffered;
	}
	
}
