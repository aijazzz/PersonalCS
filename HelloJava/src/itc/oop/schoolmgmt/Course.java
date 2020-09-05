package itc.oop.schoolmgmt;

public class Course {
	private String name;
	private float creditHours;
	private Schedule schedule; 
	
	private Student[] students = new Student[50];
	private int studentCount = 0;
	
	private Teacher teacher;
	
	public Course(String name, float creditHours) {
		this.name = name;
		this.creditHours = creditHours;
	}

	public Course(String name, float creditHours, Schedule schedule) {
		this(name, creditHours);
		this.schedule = schedule;
	}

	/**
	 * Add student to this course
	 * @param student
	 */
	public void addStudent(Student student) {
		this.students[this.studentCount++] = student;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(float creditHours) {
		this.creditHours = creditHours;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
