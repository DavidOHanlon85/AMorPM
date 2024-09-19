/**
 * 
 */
package labExercises;

import java.util.Calendar;

/**
 * 
 */
public class Exercise08_AMOrPM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		amOrPm();
		amOrPm2();
		
	}

	/**
	 * This method prints a message depending on whether it is AM or PM using Calendar.AM_PM
	 */
	public static void amOrPm() {
		
		Calendar cal = Calendar.getInstance();
		
		int timeOfDay = cal.get(Calendar.AM_PM);
		
		if (timeOfDay == 0) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day.");
		}
		
	}
	
	/**
	 * This method prints a message depending on whether it is AM or PM using Calendar.HOUR_OF_DAY
	 */
public static void amOrPm2() {
		
		Calendar cal = Calendar.getInstance();
		
		int timeOfDay = cal.get(Calendar.HOUR_OF_DAY);
		
		if (timeOfDay > 0 && timeOfDay < 12) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day.");
		}
		
	}
}
