import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
/*
   创建TestJunit测试类
   给 testPrintMessage() 测试用例添加需要的异常 ArithmeticException
*/
public class TestJunit {

   String message = "Robert";   
   MessageUtil messageUtil = new MessageUtil(message);

   @Test(expected = ArithmeticException.class)
   public void testPrintMessage() { 
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}