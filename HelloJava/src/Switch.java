
public class Switch {

public static String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
     String typeOfDay;
     switch (dayOfWeekArg) {
         case "Monday":
             typeOfDay = "start of work week";
             break;
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
             typeOfDay = "midweek";
             break;
         case "Friday":
             typeOfDay = "end of work week";
             break;
         case "Saturday":
         case "Sunday":
             typeOfDay = "weekend";
             break;
         default:
             typeOfDay = "none";
     }
     return typeOfDay;
}
	
public static void main(String[] args) {
	String day = "Wednesday";
	System.out.print(day + " is ");
	System.out.println(getTypeOfDayWithSwitchStatement("Wednesday") + " day");
	System.out.println("Exit.");
}


//	public static void main(String[] args) {
//		printFutureMonths();
//		int month = 200;
//		
//		switch (month/60) {
//		  case 1: 
//		  case 3:
//		  case 5:
//		  case 7:
//		  case 8:
//		  case 10:
//		  case 12:
//		    System.out.println("This month has 31 days.");
//		    break;
//		  case 4:
//		  case 6:
//		  case 9:
//		  case 11:
//		    System.out.println("This month has 30 days.");
//		    break;
//		  case 2:
//			    System.out.println("This month has 28 days.");
//			    break;
//		  default:
//		    System.out.println("Sorry, I dont understand this month.");
//		}
//	}

}
