package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setRecurrence","setValid","isOn"};// The list of the of methods to be tested in the Appt class

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
     * Generate Random Tests that tests Appt Class.
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

			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);//(ValuesGenerator.getRandomIntBetween(random, 0, sizeArray)));
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);

							 sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   recurDays=null;//ValuesGenerator.generateRandomArray(random, sizeArray);//(ValuesGenerator.getRandomIntBetween(random, 0, sizeArray)));
						   recur=ApptRandomTest.RandomSelectRecur(random);
						   recurIncrement = ValuesGenerator.RandInt(random);
						   recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
							 appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						}
						else if (methodName.equals("setValid")){
							appt.setValid();
						}
						else if (methodName.equals("isOn")){
							appt.isOn(ValuesGenerator.getRandomIntBetween(random, -10, 40),ValuesGenerator.getRandomIntBetween(random, -10, 20),ValuesGenerator.getRandomIntBetween(random, -1000, 2018));
						}
				}
//////////////////////////////////
		//	appt.setValid();
			//assertTrue(appt.getValid());//me


/////////////////////////////////////////

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			}
		}catch(NullPointerException e){

		}

		 System.out.println("Done testing...");
	 }




	 @Test
	  public void radnomtest01()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");

		try{
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);

				 int startHour0=ValuesGenerator.getRandomIntBetween(random, -12, 40);
				 int startMinute0=ValuesGenerator.getRandomIntBetween(random, -20, 90);
				 int startDay0=ValuesGenerator.getRandomIntBetween(random, -20, 60);
				 int startMonth0=ValuesGenerator.getRandomIntBetween(random, -12, 40);
				 int startYear0=ValuesGenerator.getRandomIntBetween(random, -2018, 2018);
				 String title0="Birthday Party";
				 String description0="This is my birthday party.";
				 String emailAddress0="xyz@gmail.com";

				 //Construct a new Appointment object with the initial data
				 //Construct a new Appointment object with the initial data
		         Appt appt0 = new Appt(startHour0,
		                  startMinute0 ,
		                  startDay0 ,
		                  startMonth0 ,
		                  startYear0 ,
		                  title0,
		                 description0,
		                 emailAddress0);

			 if(!appt0.getValid())continue;
	/*		for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						}
				}*/
//////////////////////////////////
        appt0.setValid();
			//	assertFalse(appt.getValid());//me

				int startHour1=ValuesGenerator.getRandomIntBetween(random, -110, 101);
				int startMinute1=ValuesGenerator.getRandomIntBetween(random, -101, 101);
				int startDay1=ValuesGenerator.getRandomIntBetween(random, -100, 109);
				int startMonth1=ValuesGenerator.getRandomIntBetween(random, -101, 101);
				int startYear1=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
				String title1="Birthday Party";
				String description1="This is my birthday party.";
				String emailAddress1="xyz@gmail.com";

				//Construct a new Appointment object with the initial data
				//Construct a new Appointment object with the initial data
						Appt appt1 = new Appt(startHour1,
										 startMinute1 ,
										 startDay1 ,
										 startMonth1 ,
										 startYear1 ,
										 title1,
										description1,
										emailAddress1);

					appt1.setValid();
/////////////////////////////////////////


int startHour2=1;
int startMinute2=10;
int startDay2=50; // ValuesGenerator.getRandomIntBetween(random, 40, 50);
int startMonth2=1;
int startYear2=2018;
String title2="Birthday Party";
String description2="This is my birthday party.";
String emailAddress2="xyz@gmail.com";

//Construct a new Appointment object with the initial data
//Construct a new Appointment object with the initial data
		Appt appt2 = new Appt(startHour2,
						 startMinute2 ,
						 startDay2 ,
						 startMonth2 ,
						 startYear2 ,
						 title2,
						description2,
						emailAddress2);

	appt2.setValid();


				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			}
		}catch(NullPointerException e){

		}

		 System.out.println("Done testing...");
	 }
	 }
