package b07.labs;

import java.util.ArrayList;

public class Lab5Driver {

  /**
   * Main method.
   * 
   * @param argv N/A
   */
  public static void main(String[] argv) {
    // TODO change x to the Class of interest
    InheritanceInterface x = new InheritanceInterfaceImpl();
    printClassHierarchy(x.getClass());
  }

  private static void printClassHierarchy(Class<?> c) {
    // Create a new ArrayList of Classes of currently unknown type
    ArrayList<Class<?>> list = new ArrayList<Class<?>>();
    // Loop through the hierarchy until you've run out of super classes

    while (c != null) {
      // Add to the beginning of the list, so that java.lang.Object will print
      // first
      list.add(0, c);
      // make c the superclass of the current class stored in it
      c = c.getSuperclass();
    }

    // Loop through the list so we can print the superClasses
    String spacing = "";

    for (Class<?> superClass : list) {
      // getName gets a string representation of the name of the class
      System.out.println(spacing + superClass.getName());
      // Add a tab to indent the next class
      spacing += "\t";
    }
  }
}
