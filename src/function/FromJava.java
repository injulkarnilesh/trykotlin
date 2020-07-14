package function;


public class FromJava {

  public static void main(String[] args) {
    int sum = FromKtKt.sum(10, 20);
    System.out.println(sum);

    //Due to @file:JvmName("Message")
    Message.say("Namaste");
  }

}
