package srs.domain;

import java.util.ArrayList;

public class Professor extends Person {
	
	private String title;
	private String deparment;
	private ArrayList<Section> teaches; 
	
	public Professor(){
		
	}
	
	public Professor(String accountNo, String pwd, Type type) {
		super(accountNo, pwd, type);
	}

	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
