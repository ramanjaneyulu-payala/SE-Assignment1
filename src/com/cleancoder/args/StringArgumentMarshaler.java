package com.cleancoder.args;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.cleancoder.args.ArgsException.ErrorCode.*;

public class StringArgumentMarshaler implements ArgumentMarshaler {
  private String stringValue = "";

  public void set(String currentArgument) throws ArgsException {
      try {
        stringValue = currentArgument;
      } catch (NoSuchElementException e) {
        throw new ArgsException(MISSING_STRING);
      }
    }


  public static String getValue(ArgumentMarshaler argumentMarshaler) throws ArgsException{
    if (argumentMarshaler != null && argumentMarshaler instanceof StringArgumentMarshaler)
      return ((StringArgumentMarshaler) argumentMarshaler).stringValue;
    else
      throw new ArgsException(INVALID_STRING_EXPECTED);
  }
}
