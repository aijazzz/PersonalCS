package itc.oop.schoolmgmt;

public class School {

	// name of the school
	private static String name = "The Java School";
	
	// List of students in school and their count
	private static Student[] students = new Student[50];
	private static int studentCount = 0;
	
	// List of courses in school and their count
	private static Course[] courses = new Course[5];
	private static int courseCount = 0;
	
	// List of teachers in school and their count
	private static Teacher[] teachers = new Teacher[5];
	private static int teacherCount = 0;
	

	public static void printStudentList() {
		for (int i = 0; i < studentCount; i++) {
			System.out.println(students[i].getStudentInfo());
		}
	}
	public static void printCourseList() {
		for (int i = 0; i < courseCount; i++) {
			System.out.println(courses[i].getCourseInfo());
		}
	}
	public static void printTeacherList() {
		for (int i = 0; i < teacherCount; i++) {
			System.out.println(teachers[i].getTeacherInfo());
		}
	}
	
	/**
	 * Finds course based on the name of the course
	 * @param name
	 * @return
	 */
	public static Course findCourse(String name) {
		Course result = null;
		if (name != null && !name.equals("")) {
			for (int i = 0; i < courseCount; i++) {
				Course currentCourse = courses[i]; 
				if (name.equals(currentCourse.getName())) {
					result = currentCourse;
				}
			}
		}
		return result;
	}
	
	/**
	 * Add a new student to school
	 * @param student
	 */
	public static void admitStudent(Student student) {
		if (studentCount < 50) {
			students[studentCount++] = student;
		} else {
			System.out.println("Error: Max 50 students allowed.");
		}
	}
	/**
	 * Add a course to school
	 * @param course
	 */
	public static void addCourse(Course course) {
		if (courseCount < 5) {
			courses[courseCount++] = course;
		} else {
			System.out.println("Error: Max 5 courses allowed.");
		}
	}

	public static void addTeacher(Teacher teacher) {
		if (teacherCount < 5) {
			teachers[teacherCount++] = teacher;
		} else {
			System.out.println("Error: Max 5 teachers allowed.");
		}
	}

	/**
	 * Assign a new course to student
	 * @param student
	 * @param course
	 */
	public static void enrollCourse(Student student, Course course) {
		if (student != null && course != null) {
			// BUGFIXED
			if (student.getCourseEnrolled() < 5) {
				student.addCourse(course);
				course.addStudent(student);
			}
		} else {
			System.out.println("Error: Student or Course cannot be NULL.");
		}
	}
}
