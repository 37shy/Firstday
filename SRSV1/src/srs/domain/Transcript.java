package srs.domain;

import java.util.ArrayList;

public class Transcript {
	private ArrayList<TranscriptEntry> transcriptEntries;
	private Student studentOwner;	

	public Transcript(Student s) {
		setStudentOwner(s);
		setTranscriptEntries(new ArrayList<TranscriptEntry>());
	}
	
	public void setStudentOwner(Student s) {
		studentOwner = s;
	}

	public Student getStudentOwner() {
		return studentOwner;
	}

	public ArrayList<TranscriptEntry> getTranscriptEntries() {
		return transcriptEntries;
	}

	public void setTranscriptEntries(ArrayList<TranscriptEntry> transcriptEntries) {
		this.transcriptEntries = transcriptEntries;
	}

	public boolean verifyCompletion(Course c) {
		boolean outcome = false;
		for(TranscriptEntry te: transcriptEntries) {
			
		}
		return false;
	}
}
