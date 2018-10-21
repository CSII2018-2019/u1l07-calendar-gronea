//Abby Grone's u1L07 Calendar
import javax.swing.JOptionPane;
public class U1L07Calendar {

	public static void main(String[] args) {
		//What are Arrays:
			//int [] temp = new int [365]; //a temp array with 365 spots
			//String [] names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet"}
		//--------------------------------------------------
		//Variables:
		int numDay = 0; //input
		int numberDay = 0; //weekday remainder
		String dayInWeek = "";
		String[] daysOfWeek = {"Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur", "Sun"};
		int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i = 0;
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		//Input From User
		do{
			String input = JOptionPane.showInputDialog("Enter Number of Days (1-365): ");
			numDay = Integer.parseInt(input);
		} while (numDay < 0 || numDay > 366);
		System.out.println("The " + numDay + " day after the new year is:");
		//Find Day of the Week
		numberDay = numDay % 7;
		dayInWeek = daysOfWeek[numberDay];
		
		//Find Month/Day
		while (numDay > daysInMonth[i]){
			numDay -= daysInMonth[i];
			i++;
			};
		String month = months[i];
		
		System.out.println(dayInWeek + "day, " + month + " " + numDay + ", 2019");
	}

}
