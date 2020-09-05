package itc.oop;

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
