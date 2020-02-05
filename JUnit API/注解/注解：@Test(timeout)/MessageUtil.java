/*
   创建一个叫做 MessageUtil.java 的 java 类来测试
   在 printMessage() 方法内添加一个无限 while 循环
*/
public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message; 
   }

   // prints the message
   public void printMessage(){
      System.out.println(message);
      while(true);
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
} 