/*
   创建一个MessageUtil测试类
   在 printMessage()方法中添加一个错误条件
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
      int a =0;
      int b = 1/a;
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
}  