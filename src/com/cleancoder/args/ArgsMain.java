package com.cleancoder.args;

public class ArgsMain {

private static void settingArgs(String[] args) throws ArgsException{
  Args arg = new Args("l,p#,d*", args);
  boolean logging = arg.getBoolean('l');
  int port = arg.getInt('p');
  String directory = arg.getString('d');
//  Double average = arg.getDouble( 'f');
  executeApplication(logging, port, directory);
}
  public static void main(String[] args) {
    try {
      settingArgs(args);
    } catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.errorMessage());
    }
  }

  private static void executeApplication(boolean logging, int port, String directory) {
    System.out.printf("logging is %s, port:%d, directory:%s\n",logging, port, directory);
  }
}