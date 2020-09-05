package itc.oop.schoolmgmt;

public class Schedule {
	private String[] days;
	private int[] time;
	private int[] duration;
	
	public Schedule() {
		// Monday Wednesday 
		// 10AM, 10AM
		// 2 hrs, 1hr
		
		this.days = new String[2];
		this.days[0] = "Monday";
		this.days[1] = "Wednesday";
		
		this.time = new int[2];
		this.time[0] = 10;
		this.time[1] = 10;

		this.duration = new int[2];
		this.duration[0] = 2;
		this.duration[1] = 1;
	}
	public Schedule(String[] days, int[] time, int[] duration) {
		this.days = days;
		this.time = time;
		this.duration = duration;
	}
	// Monday at 10 for 2 hrs
	// Wednesday at 10 for 1 hrs
	public String getSchedule() {
		String schedule = "";
		for (int i =0; i < this.days.length; i++) {
			schedule = schedule.concat(this.days[i] + " at " + this.time[i] + 
					" for " + this.duration[i] + " hrs\n");
		}
		return schedule;
	}
	
	public static void main(String[] args) {
		Schedule schedule = new Schedule();
		System.out.println(schedule.getSchedule());
	}
}
