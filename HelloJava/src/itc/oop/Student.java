package itc.oop;

public class Student {
	private String name;
	private Course[] courses;
	private int rumber;
	private int[] grades;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public int getRumber() {
		return rumber;
	}
	public void setRumber(int rumber) {
		this.rumber = rumber;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
}
