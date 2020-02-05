import org.junit.Test;
import static org.junit.Assert.*;

//测试Assert类的API
public class TestAssertions {

   @Test
   public void testAssertions() {
      //test data
      String str1 = new String ("abc");
      String str2 = new String ("abc");
      String str3 = null;
      String str4 = "abc";
      String str5 = "abc";
      int val1 = 5;
      int val2 = 6;
      String[] expectedArray = {"one", "two", "three"};
      String[] resultArray =  {"one", "two", "three"};

      //检查两个变量或者等式是否相等
      assertEquals(str1, str2);

      //检查条件为真
      assertTrue (val1 < val2);

      //检查条件是假的
      assertFalse(val1 > val2);

      //检查对象不是空的
      assertNotNull(str1);

      //检查对象是空的
      assertNull(str3);

      //Check if two object references point to the same object
      assertSame(str4,str5);

      //Check if two object references not point to the same object
      assertNotSame(str1,str3);

      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }
}