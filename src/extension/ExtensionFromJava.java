package extension;

public class ExtensionFromJava {

  public static void main(String[] args) {
    String camElCaSe = StringExtensionKt.camelCase("You aRe CamEl caSe");
    System.out.println(camElCaSe);
    boolean ani = InfixExtensionKt.ani(true, false);
    System.out.println(ani);
  }

}
