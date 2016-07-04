package srs.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import srs.dao.SRSDao;
import srs.domain.Course;
import srs.domain.DBUtil;
import srs.domain.Section;
import srs.domain.Student;
import srs.domain.Transcript;

public class SRSMysqlDaoImpl implements SRSDao{

	@Override
	public boolean addCourse(Course c) {
		int i = 0;
		Connection conn = DBUtil.getMySqlConn();
		String sql = "Insert into course values(?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(0, c.getCourseNo());
			pstmt.setString(1, c.getCourseName());
			pstmt.setDouble(2, c.getCredits());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i > 0;
	}

	@Override
	public boolean updateCourse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCourse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Course> getAllCourse() {
		ArrayList<Course> courses = new ArrayList<Course>();
		Connection conn = DBUtil.getMySqlConn();
		String sql = "Select * from Course";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String courseNo = rs.getString("courseNo");
				String courseName = rs.getString("courseName");
				double credits = rs.getDouble("credits");			
				Course course = new Course(courseName, courseNo, credits);	
				courses.add(course);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courses;
	}

	@Override
	public ArrayList<Section> getAllSection() {
		// TODO Auto-generated method stub
		ArrayList<Section> sections = new ArrayList<Section>();
		ArrayList<Course> courses = new ArrayList<Course>();
		courses = getAllCourse();
		Connection conn= DBUtil.getMySqlConn();
		String sql = "Select * from section";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int sectionNo = rs.getInt("sectionNo");
				char dayOfWeek = rs.getString("dayOfWeek").charAt(0);
				String timeOfDay = rs.getString("timeOfDay");
				String room = rs.getString("room");
				int seatingCapacity = rs.getInt("seatingCapacity");
				int seatingRemained = rs.getInt("seatingRemained");
				int id = rs.getInt("id");
				String representedCourse = rs.getString("representedCourse");
				Course c = new Course();
				if(courses.size() != 0) {
					for(Course course: courses) {
						if(course.getCourseNo().equals(representedCourse)) {
							c = course;
							break;
						}
					}
				}else {
					c = null;
				}
				Section sec = new Section(sectionNo, dayOfWeek, timeOfDay, c, room, seatingCapacity, seatingRemained, id);
				sections.add(sec);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sections;
	}

	@Override
	public Transcript getTranscript(Student s) {
		Transcript transcript = new Transcript(s);
		return null;
	}


}
