
/** A JUnit test class to test the class DataHandler. */


package calendar;
import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    DataHandler dh;
    dh = new DataHandler();
    Appt appt1 = new Appt(15, 30, 10, 11, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    assertTrue(dh.saveAppt(appt1));
    LinkedList<CalDay> calDays = new LinkedList<CalDay>();
    GregorianCalendar x = new GregorianCalendar(2018,10,10);
    GregorianCalendar y = new GregorianCalendar(2018,12,11);

    calDays = (LinkedList<CalDay>) dh.getApptRange(x,y);
    //assertEquals(calDays,"12/10/2018 at 3:30pm ,Birthday Party, This is my birthday party");
    //System.out.print(calDays);
    assertTrue(dh.deleteAppt(appt1));
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    LinkedList<CalDay> calDays = new LinkedList<CalDay>();
    GregorianCalendar x = new GregorianCalendar(2018,10,10);
    GregorianCalendar y = new GregorianCalendar(2018,12,11);
    Appt appt2 = new Appt(150, 300, 100, 101, 20108, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    //DataHandler dh2;
    //dh2 = new DataHandler("....",false);
    //assertEquals(null,(LinkedList<CalDay>) dh2.getApptRange(x,y));
    DataHandler dh1;
    dh1 = new DataHandler();
    //appt2.setRecurrence([1,3],1,1,1);
    appt2.setValid();
    assertFalse(dh1.saveAppt(appt2));

  }
  @Test(timeout = 4000)
  public void test02() throws Throwable{
    GregorianCalendar x = new GregorianCalendar(2018,10,10);
    GregorianCalendar y = new GregorianCalendar(2018,12,11);
    Appt appt2 = new Appt(15, 3, 10, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt3 = new Appt(15, 3, 10, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    DataHandler dh2;
    dh2 = new DataHandler();
    appt2.setValid();
    appt3.setValid();
    dh2.saveAppt(appt2);
    dh2.saveAppt(appt3);
    boolean xx = false;
    try{
      dh2.getApptRange(y,x);
    } catch(DateOutOfRangeException e){
      xx = true;
    }
    assertTrue(xx);
    int[] v;
    v = new int[1];
    v[0] = 1;
    //v[1] = 3;
    appt2.setRecurrence(v,2,2,2);
    System.out.print(dh2.getApptRange(x,y));
    //assertTrue(dh2.getApptRange(x,y).contains( "--- 11/10/2018 ---"));
  }
}
