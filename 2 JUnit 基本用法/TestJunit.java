import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {

   String message = "Hello World";  
   MessageUtil messageUtil = new MessageUtil(message);

   //向方法中添加 Annotaion @Test
   @Test
   public void testPrintMessage() {
   	  //应用 Junit 的 assertEquals API 来检查
   	  message = "New Word";
      assertEquals(message,messageUtil.printMessage());
   }
}