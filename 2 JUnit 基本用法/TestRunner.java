import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
   	  //运用 JUnit 的 JUnitCore 类的 runClasses 方法来运行测试案例
   	  //获取在 Result Object 中运行的测试案例的结果
      Result result = JUnitCore.runClasses(TestJunit.class);
      //获取 Result Object 的 getFailures() 方法中的失败结果
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      //wasSuccessful() 判断是否执行成功
      System.out.println(result.wasSuccessful());
   }
}   