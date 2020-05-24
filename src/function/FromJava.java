package function;

import kotlin.jvm.JvmName;

public class FromJava {

  public static void main(String[] args) {
    int sum = FromKtKt.sum(10, 20);
    System.out.println(sum);
    Message.say("Namaste");
  }

}
