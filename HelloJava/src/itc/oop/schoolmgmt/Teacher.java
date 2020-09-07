package itc.oop.schoolmgmt;

/*
 * A teacher can teach one course and manages a default schedule
 * Teacher name: Muzammil
 * Course: OOP
 * Office hours: Monday 10 2h, Friday 20 1h
 */
public class Teacher {
	private String name;
	private Course course;
	private Schedule officeHours;
	
	/**
	 * Constructor
	 * @param name
	 * @param course
	 * @param officeHours
	 */
	public Teacher(String name, Course course, Schedule officeHours) {
		this.name = name;
		this.course = course;
		this.officeHours = officeHours;
	}
	
	public String getTeacherInfo() {
		StringBuffer tInfo = new StringBuffer("Teacher Info:");
		tInfo.append("\nName: ");
		tInfo.append(this.name);
		tInfo.append("\tCourse: ");
		tInfo.append(this.course.getName());
		tInfo.append("\n");
		tInfo.append(this.officeHours.getScheduleInfo());
		tInfo.append("-----------------");
		return tInfo.toString();
	}

	/**
	 * Get list of students who are taought by this teacher
	 * @return
	 */
	public Student[] getStudents() {
		Student[] students = null;
		if (course != null) {
			students = course.getStudents();
		}
		return students;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Schedule getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(Schedule officeHours) {
		this.officeHours = officeHours;
	}
}
