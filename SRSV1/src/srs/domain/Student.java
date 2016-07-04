package srs.domain;

import java.util.ArrayList;

public class Student extends Person {

	private String major;
	private String degree;
	private String gender;
	private Transcript transcript;
	private ArrayList<Section> attends;

	public Student(String accountNo, String pwd, Type type) {
		super(accountNo, pwd, type);
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

}
