package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
		public static String RandomSelectMethod(Random random){
				String[] methodArray = new String[] {"deleteAppt","getApptRange"};// The list of the of methods to be tested in the Appt class

			int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

				return methodArray[n] ; // return the method name
				}
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
		public static int RandomSelectRecur(Random random){
				int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

			int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
				return RecurArray[n] ; // return the value of the  appointments to recur
				}
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
		public static int RandomSelectRecurForEverNever(Random random){
				int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

			int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
				return RecurArray[n] ; // return appointments to recur forever or Never recur
				}

    /**
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
			long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


			System.out.println("Start testing...");

		 try{
			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =System.currentTimeMillis(); //10
	 //			System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);

				 DataHandler dh;
				 dh = new DataHandler();

					int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					int startYear=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
					String title="Birthday Party";
					String description="This is my birthday party.";
					String emailAddress="xyz@gmail.com";

					//Construct a new Appointment object with the initial data
					//Construct a new Appointment object with the initial data
							Appt appt = new Appt(startHour,
											 startMinute ,
											 startDay ,
											 startMonth ,
											 startYear ,
											 title,
											description,
											emailAddress);


				 int startHour0=ValuesGenerator.getRandomIntBetween(random, -10, 11);
				 int startMinute0=ValuesGenerator.getRandomIntBetween(random, -10, 11);
				 int startDay0=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startMonth0=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear0=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
				 String title0="Birthday Party";
				 String description0="This is my birthday party.";
				 String emailAddress0="xyz@gmail.com";

				 Appt appt0 = new Appt(startHour0,
								 startMinute0 ,
								 startDay0 ,
								 startMonth0 ,
								 startYear0 ,
								 title0,
								description0,
								emailAddress0);
				 appt.setValid();
				 appt0.setValid();

         dh.saveAppt(appt);
				 dh.saveAppt(appt0);

				 GregorianCalendar x = new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, -2018, 2018),ValuesGenerator.getRandomIntBetween(random, -10, 28),ValuesGenerator.getRandomIntBetween(random, -10, 11));
				 GregorianCalendar a = new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 2018, 2018),ValuesGenerator.getRandomIntBetween(random, 1, 10),ValuesGenerator.getRandomIntBetween(random, 1, 11));
				 GregorianCalendar b = new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 2018, 2018),ValuesGenerator.getRandomIntBetween(random, 11, 28),ValuesGenerator.getRandomIntBetween(random, 1, 11));
				 CalDay xx = new CalDay(x);
				if(!appt.getValid())continue;

			// dh.getApptRange(a,b);

			 //dh.deleteAppt(appt);
			 //dh.deleteAppt(appt0);
	 		for (int i = 0; i < NUM_TESTS; i++) {
		 			String methodName = ApptRandomTest.RandomSelectMethod(random);
			 		   if (methodName.equals("getApptRange")){
							 dh.getApptRange(a,b);


				 		}
				     else if(methodName.equals("deleteAppt")){
							 dh.deleteAppt(appt);
							dh.deleteAppt(appt0);
						 }

				 }


					elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
							 if((iteration%10000)==0 && iteration!=0 )
										 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			 }
		 }catch(NullPointerException e){

		 }

			System.out.println("Done testing...");



	 }



}
