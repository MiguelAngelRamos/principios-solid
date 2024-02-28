package com.kibernumacademy;

public class Main {
  public static void main(String[] args) {
   T t = new S1();
   System.out.println(t.getName());
   t = new S2();
   System.out.println(t.getName());
  }
}

abstract class T {
  public abstract String getName();
}

class S1 extends T {

  @Override
  public String getName() {
    return "S1";
  }
}

class S2 extends T {

  @Override
  public String getName() {
    return "S2";
  }

}