import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//在类中附上 @RunWith(Suite.class) 注释
//使用 @Suite.SuiteClasses 注释给 JUnit 测试类加上引用
@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestJunit1.class,
   TestJunit2.class
})
public class TestSuite {   
}  