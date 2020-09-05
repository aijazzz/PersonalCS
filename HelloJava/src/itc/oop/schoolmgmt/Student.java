package itc.oop.schoolmgmt;

public class Student {
	private String name;
	private Course[] courses = new Course[5];
	private int courseEnrolled = 0;
	private int number;
	private int[] grades;
	
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public Student(String name, int number, Course[] courses) {
		this(name, number);
		if (courses != null && courses.length != 0 && courses.length < 5) {
			for (int i = 0; i < courses.length; i++ ) {
				this.courses[i] = courses[i];
			}
			this.courseEnrolled = courses.length;
		}
	}
	
	/**
	 * Register student to a new course
	 * @return
	 */
	public void addCourse(Course course) {
		if (courses == null || courses.length == 0) {
			System.out.println("Error: Courses array is NULL.");
		} else {
			if (this.courseEnrolled < 5) {
				this.courses[this.courseEnrolled] = course;
				this.courseEnrolled++;
			} else {
				System.out.println("Error: A student can only "
						+ "register to max 5 courses.");
			}			
		}
	}
	

	/*
	 * Update implementation
	 */
	public String getStudentInfo() {
		String sInfo = "";
		sInfo = sInfo + "Name: " + this.name + "\t"; 
		sInfo = sInfo + "Roll Number: " + this.number + "\n";
		
		for (int i =0; i < this.courseEnrolled ; i++) {
			sInfo = sInfo + "Course " + (i+1) + ": " + this.courses[i].getName() + "\n";
		}
		sInfo = sInfo + "------------------";
		return sInfo;
	}
	
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	public int getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(int courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	
}