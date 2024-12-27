import java.util.*;

public class Main {
    public static void main(String[] args) {
      StringJoiner joining= new StringJoiner(";" ,"{" , "}");
      joining.add("rhema");
      joining.add("riya");
      System.out.println(joining);
  }
}