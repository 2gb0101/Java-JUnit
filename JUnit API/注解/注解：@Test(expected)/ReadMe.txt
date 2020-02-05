创建一个MessageUtil测试类
在 printMessage()方法中添加一个错误条件

创建TestJunit测试类
给 testPrintMessage() 测试用例添加需要的异常 ArithmeticException

执行测试样例TestRunner类：
用 javac 编译 MessageUtil，Test case 和 Test Runner 类。
javac -encoding UTF-8 MessageUtil.java TestJunit.java TestRunner.java

现在运行 Test Runner，它将运行由提供的 Test Case 类中所定义的测试用例。
java TestRunner
