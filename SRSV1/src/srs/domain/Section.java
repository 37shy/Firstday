package srs.domain;

public class Section {
	private int sectionNo;
	private char dayOfWeek;
	private String timeOfDay;
	private String room;
	private int seatingCapacity;
	private int seatingRemained;
	private int id;
	private Course representedCourse;
	private ScheduleOfClasses offeredIn;
	private Professor instructor;
	
	public Section(int sectionNo, char dayOfWeek, String timeOfDay,
			Course c, String room, int seatingCapacity, int seatingRemained, int id) {
		this.setSectionNo(sectionNo);
		this.setDayOfWeek(dayOfWeek);
		this.setTimeOfDay(timeOfDay);
		this.setRoom(room);
		this.setRepresentedCourse(c);
		this.setSeatingCapacity(seatingCapacity);
		this.setSeatingRemained(seatingRemained);
		this.setId(id);
		this.instructor = new Professor();
	}
	
	public Section() {
		
	}

	public int getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}
	public char getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(char dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Course getRepresentedCourse() {
		return representedCourse;
	}
	public void setRepresentedCourse(Course representedCourse) {
		this.representedCourse = representedCourse;
	}
	public ScheduleOfClasses getOfferedIn() {
		return offeredIn;
	}
	public void setOfferedIn(ScheduleOfClasses offeredIn) {
		this.offeredIn = offeredIn;
	}
	
	public int getSeatingRemained() {
		return seatingRemained;
	}
	public void setSeatingRemained(int seatingRemained) {
		this.seatingRemained = seatingRemained;
	}

	public Professor getInstructor() {
		return instructor;
	}

	public void setInstructor(Professor instructor) {
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
