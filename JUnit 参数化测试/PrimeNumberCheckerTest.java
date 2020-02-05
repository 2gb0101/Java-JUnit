import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

//用 @RunWith(Parameterized.class) 来注释 test 类
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
   //为每一列测试数据创建一个实例变量
   private Integer inputNumber;
   private Boolean expectedResult;
   private PrimeNumberChecker primeNumberChecker;

   @Before
   public void initialize() {
      primeNumberChecker = new PrimeNumberChecker();
   }

   //创建一个由 @Parameters 注释的公共的静态方法
   //它返回一个对象的集合(数组)来作为测试数据集合
   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, true },
         { 6, false },
         { 19, true },
         { 22, false },
         { 23, true }
      });
   }

  //创建一个公共的构造函数，它接受和一行测试数据相等同的东西
   public PrimeNumberCheckerTest(Integer inputNumber, 
      Boolean expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }


   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
   }
}