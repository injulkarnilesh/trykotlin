package oo;

import oo.Mobile.Type;

public class FromJava {

  public static void main(String[] args) {
    Logger.INSTANCE.message("Hi");

    Pet pet = Pet.Companion.create();

    Animal.staticOne();

    boolean valid = Type.valid;
    String value = Type.value;
  }

}
