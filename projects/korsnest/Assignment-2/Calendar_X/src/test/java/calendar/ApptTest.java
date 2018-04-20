/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      //assertFalse(appt0.isRecurring());
      //assertEquals("\t11/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();


  }
@Test(timeout = 4000)
 public void test01()  throws Throwable  {
   Appt appt1 = new Appt(15, 30, 10, 11, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt1.setValid();
   assertTrue(appt1.getValid());
   //assertEquals(appt1.isOn(10,11,2018), true);
}
@Test(timeout = 4000)
 public void test02()  throws Throwable  {
   Appt appt2 = new Appt(10, 10, 13, 13, -1, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt2.setValid();
   assertFalse(appt2.getValid());
   //assertEquals(appt2.isOn(9,11,2018), true);
}
@Test(timeout = 4000)
 public void test03()  throws Throwable  {
   Appt appt2 = new Appt(20, 400, 140, 10, -1, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt2.setValid();
   assertFalse(appt2.getValid());
   //assertEquals(appt2.isOn(9,11,2018), true);
}
@Test(timeout = 4000)
 public void test04()  throws Throwable  {
   Appt appt2 = new Appt(2, 40, 14, -1, 2000, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt2.setValid();
   assertFalse(appt2.getValid());
   //assertEquals(appt2.isOn(9,11,2018), true);
}
@Test(timeout = 4000)
 public void test05()  throws Throwable  {
   Appt appt2 = new Appt(25, 40, 14, 2, 2000, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt2.setValid();
   assertFalse(appt2.getValid());
   //assertEquals(appt2.isOn(9,11,2018), true);
}
@Test(timeout = 4000)
 public void test06()  throws Throwable  {
   Appt appt2 = new Appt(2, 40, 14, 2, 0, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt2.setValid();
   assertFalse(appt2.getValid());
   //assertEquals(appt2.isOn(9,11,2018), true);
}
@Test(timeout = 4000)
 public void test07()  throws Throwable  {
   Appt appt3 = new Appt(-4, 40, 14, 1, 2000, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt3.setValid();
   assertFalse(appt3.getValid());
   //assertEquals(appt2.isOn(9,11,2018), true);
}
@Test(timeout = 4000)
 public void test08()  throws Throwable  {
   Appt appt2 = new Appt(2, 30, 14, 1, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt2.setValid();
   assertFalse(appt2.isOn(1,5,2018));
   assertFalse(appt2.isOn(14,6,2018));
   assertFalse(appt2.isOn(14,2,208));
   assertFalse(appt2.isOn(1,6,208));
   assertTrue(appt2.isOn(appt2.getStartDay(),appt2.getStartMonth(),appt2.getStartYear()));
   assertFalse(appt2.isOn(appt2.getStartDay(),appt2.getStartMonth(),0));
}
@Test(timeout = 4000)
 public void test09()  throws Throwable  {
   Appt appt2 = new Appt(2, 40, 14, -1, 2000, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
   appt2.setValid();
   assertFalse(appt2.getValid());
   //assertEquals(appt2.isOn(9,11,2018), true);
}
}
