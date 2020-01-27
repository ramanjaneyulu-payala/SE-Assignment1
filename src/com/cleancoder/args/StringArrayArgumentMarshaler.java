package com.cleancoder.args;

import static com.cleancoder.args.ArgsException.ErrorCode.*;

import java.util.*;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
  private List<String> stringsArray = new ArrayList<String>();

  public void set(String currentArgument) throws ArgsException {
      try {
        stringsArray.add(currentArgument);
      } catch (NoSuchElementException e) {
        throw new ArgsException(MISSING_STRING);
      }
    }

  public static String[] getValue(ArgumentMarshaler argumentMarshaler) throws ArgsException{
    if (argumentMarshaler != null && argumentMarshaler instanceof StringArrayArgumentMarshaler)
      return ((StringArrayArgumentMarshaler) argumentMarshaler).stringsArray.toArray(new String[0]);
    else
      throw new ArgsException(INVALID_ARGUMENT_NAME);
  }
}
