
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }


/*   public void testManualTest00()
   {
//You can use this function to implement your manual testing
    String[] schemes = {"http","https"};
    UrlValidator urlValidator = new UrlValidator(schemes);
	  assertTrue(urlValidator.isValid("http://google.com")); // this throws error and it shouldnt.
   }

   public void testManualTest01()
   {
   //You can use this function to implement your manual testing
    String[] schemes = {"http","https"};
    UrlValidator urlValidator = new UrlValidator(schemes, 0L);
    assertTrue(urlValidator.isValid("https://www.youtube.com")); // this throws error and it shouldnt.
   }

   public void testManualTest02()
   {
   //You can use this function to implement your manual testing
    UrlValidator urlValidator = new UrlValidator();
    assertTrue(urlValidator.isValid("https://www.amazon.com")); // this throws error and it shouldnt.
    assertTrue(urlValidator.isValid("https://www.amazon.com/somethingExtra")); // this throws error and it shouldnt.

   }


   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing
      UrlValidator urlValidator = new UrlValidator();
      assertTrue(urlValidator.isValid("https://www.google.com"));
      assertFalse(urlValidator.isValid(null));
   }

   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing
     UrlValidator urlValidator = new UrlValidator(0L);
     assertFalse(urlValidator.isValid("jhsdfkjgdf"));
     assertFalse(urlValidator.isValid("htps://www.amazon.com/somethingExtra"));
   }
  */  //You need to create more test cases for your Partitions if you need to
   String Scheme_X[] = {"http://","https://","ftp://"};
   String Authority_X[] = {"www.google.com","www.youtube.com","go.com"};
   String Path_X[] = {"/help","/123","/"};
   public void testIsValid()
   {
	   //You can use this function for programming based testing
     UrlValidator urlValidator = new UrlValidator();
     String res;
     for(int x=0; x < 3; x++){
       for(int y=0; y < 3; y++){
         for(int z=0; z < 3; z++){
          res = stringbuilder_X(x,y,z);
          assertTrue(urlValidator.isValid(res));//error for https://youtube.com/
        }
      }
     }
   }

   private String stringbuilder_X(int scheme, int authority, int path){
     String url = Scheme_X[scheme] + Authority_X[authority] + Path_X[path];
     System.out.println(url);
     return url;
   }

}
