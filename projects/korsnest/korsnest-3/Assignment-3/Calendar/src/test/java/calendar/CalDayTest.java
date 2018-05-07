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
    //DataHandler dh;
    //dh = new DataHandler();
    Appt appt1 = new Appt(15, 30, 10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    //LinkedList<CalDay> calLL = new LinkedList<CalDay>();
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    //GregorianCalendar y = new GregorianCalendar(2018,11,11);
    //calLL = (LinkedList<CalDay>) dh.getApptRange(x,y);
    //System.out.print(calLL);

    CalDay z = new CalDay(x);
    z.addAppt(appt1);
    System.out.print("///////////////");
    System.out.print(z.toString());
    System.out.print("///////////////");
   //System.out.print(z.toString());
  assertTrue(z.toString().contains("12/10/2018 at 3:30pm ,Birthday Party, This is my birthday party"));
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
    assertTrue(z.toString().contains("12/10/2018 at 12:4am ,Birthday Party, This is my birthday party"));

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
  @Test(timeout = 4000)
  public void test04() throws Throwable{
    Appt appt1 = new Appt(1, 1, 10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    CalDay z = new CalDay(x);
    z.addAppt(appt1);
  //  System.out.print("////////////////");
    //System.out.print(z.getSizeAppts());
    //System.out.print("////////////////");
    assertEquals(12,z.getMonth());
    assertEquals(2018,z.getYear());
    assertEquals(10,z.getDay());
    assertEquals(1,z.getSizeAppts());
    //z.addAppt(appt1);

  }
  @Test(timeout = 4000)
  public void test05() throws Throwable{
    Appt appt1 = new Appt(2, 2, 10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt2 = new Appt(2, 2, 10, 12, 2018, "Birthday1 Party", "This is my birthday party", "xyz@gmail.com");
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    CalDay z = new CalDay(x);
    z.addAppt(appt1);
    z.addAppt(appt2);
    /*System.out.print("\n//////X///");
    System.out.print(z.toString());
    System.out.print("XXXXXXXXXXXXXXX\n");
    System.out.print("\t12/10/2018 at 1:1am ,Birthday1 Party, This is my birthday party\n\t12/10/2018 at 2:2am ,Birthday Party, This is my birthday party");
    System.out.print("//////X///");*/
  //  assertTrue(z.toString().contains("\t12/10/2018 at 1:1am ,Birthday1 Party, This is my birthday party\n\t12/10/2018 at 2:2am ,Birthday Party, This is my birthday party") );
    assertTrue(z.toString().contains("\n\t12/10/2018 at 2:2am ,Birthday Party, This is my birthday party\n \t12/10/2018 at 2:2am"));
  }
  @Test(timeout = 4000)
  public void test06() throws Throwable{
    Appt appt1 = new Appt(2, 2, 10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt2 = new Appt(1, 1, 10, 12, 2018, "Birthday1 Party", "This is my birthday party", "xyz@gmail.com");
    GregorianCalendar x = new GregorianCalendar(2018,11,10);
    CalDay z = new CalDay(x);
    z.addAppt(appt1);
    z.addAppt(appt2);
    /*System.out.print("\n//////X///");
    System.out.print(z.toString());
    System.out.print("XXXXXXXXXXXXXXX\n");
    System.out.print("\t12/10/2018 at 1:1am ,Birthday1 Party, This is my birthday party\n\t12/10/2018 at 2:2am ,Birthday Party, This is my birthday party");
    System.out.print("//////X///");*/
  //  assertTrue(z.toString().contains("\t12/10/2018 at 1:1am ,Birthday1 Party, This is my birthday party\n\t12/10/2018 at 2:2am ,Birthday Party, This is my birthday party") );
    assertTrue(z.toString().contains("\n\t12/10/2018 at 1:1am ,Birthday1 Party, This is my birthday party\n \t12/10/2018 at 2:2am"));
  }
 @Test(timeout = 4000)
 public void test07() throws Throwable{
  //Appt appt1 = new Appt(2, 2, 10, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  GregorianCalendar x = new GregorianCalendar(2018,11,10);
  CalDay z = new CalDay(x);
  //z.addAppt(appt1);
  assertTrue(z.toString().contains("13/10/2018"));
  assertEquals(z.getSizeAppts(),0);
 }
 @Test(timeout = 4000)
 public void test08() throws Throwable{
  Appt appt1 = new Appt(12, 10, 12, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  GregorianCalendar x = new GregorianCalendar(2018,11,10);
  CalDay z = new CalDay(x);
  z.addAppt(appt1);
  //System.out.print("ZZZZZZZZ");
  //System.out.print(z.getFullInfomrationApp(z));
  //System.out.print("ZZZZZZZZ");
  assertTrue(z.getFullInfomrationApp(z).contains("0:10AM"));
 }
}
