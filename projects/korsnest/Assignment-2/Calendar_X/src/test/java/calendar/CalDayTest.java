/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;
import java.util.LinkedList;
public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    DataHandler dh;
    dh = new DataHandler();
    Appt appt1 = new Appt(15, 30, 10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    LinkedList<CalDay> calLL = new LinkedList<CalDay>();
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    GregorianCalendar y = new GregorianCalendar(2018,11,11);
    calLL = (LinkedList<CalDay>) dh.getApptRange(x,y);
    //System.out.print(calLL);

    CalDay z = new CalDay(x);
    z.addAppt(appt1);
   //System.out.print(z.toString());
    assertTrue(z.toString().contains("12/12/2018 at 3:30pm ,Birthday Party, This is my birthday party"));
  //  LinkedList<Appt> apptLL = new LinkedList<Appt>();
    //apptLL.add(appt1);
  //  x.setAppts(apptLL);

    //System.out.print(z.getFullInfomrationApp(z));
    assertTrue(z.getFullInfomrationApp(z).contains("3:30PM Birthday Party This is my birthday party"));




  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    DataHandler dh;
    dh = new DataHandler();
    Appt appt1 = new Appt(0, 4, 10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    LinkedList<CalDay> calLL = new LinkedList<CalDay>();
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    GregorianCalendar y = new GregorianCalendar(2018,11,11);
    calLL = (LinkedList<CalDay>) dh.getApptRange(x,y);
    //System.out.print(calLL);

    CalDay z = new CalDay(x);
    z.addAppt(appt1);
    //System.out.print(z.toString());
    assertTrue(z.toString().contains("12/12/2018 at 12:4am ,Birthday Party, This is my birthday party"));

    //System.out.print(z.getFullInfomrationApp(z));
    assertTrue(z.getFullInfomrationApp(z).contains("12:04AM Birthday Party This is my birthday party"));
  }

  @Test(timeout = 4000)
  public void test02() throws Throwable{
    DataHandler dh;
    dh = new DataHandler();
    Appt appt1 = new Appt(10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    LinkedList<CalDay> calLL = new LinkedList<CalDay>();
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    GregorianCalendar y = new GregorianCalendar(2018,11,11);
    calLL = (LinkedList<CalDay>) dh.getApptRange(x,y);
    //System.out.print(calLL);

    CalDay z = new CalDay(x);
    z.addAppt(appt1);

    System.out.print(z.getFullInfomrationApp(z));

  }

  @Test(timeout = 4000)
  public void test03() throws Throwable{
    DataHandler dh;
    dh = new DataHandler();
    Appt appt1 = new Appt(10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    LinkedList<CalDay> calLL = new LinkedList<CalDay>();
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    GregorianCalendar y = new GregorianCalendar(2018,11,11);
    //calLL = (LinkedList<CalDay>) dh.getApptRange(x,y);
    //System.out.print(calLL);

    CalDay z = new CalDay();
    //z.addAppt(appt1);
    z.toString();
    z.iterator();
    //System.out.print(z.getFullInfomrationApp(z));
  }
}
