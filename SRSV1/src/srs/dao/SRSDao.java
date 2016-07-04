package srs.dao;

import java.util.ArrayList;
import srs.domain.Course;
import srs.domain.Section;
import srs.domain.Student;
import srs.domain.Transcript;

public interface SRSDao {
	public abstract boolean addCourse(Course c);
	public abstract boolean updateCourse();
	public abstract boolean deleteCourse();
	public abstract ArrayList<Course> getAllCourse();
	public abstract boolean addSection();
	public abstract boolean updateSection();
	public abstract boolean deleteSection();
	public abstract ArrayList<Section> getAllSection();
	public abstract Transcript getTranscript(Student s);

}
