package exception;

import java.io.IOException;

public class JavaChecked {

  public static void main(String[] args) {
    try {
      TryKt.checked(140);
      //Checked exception, try catch required
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
