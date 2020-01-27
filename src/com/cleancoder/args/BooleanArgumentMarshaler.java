package com.cleancoder.args;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
  private boolean booleanValue = false;

  public void set(String currentArgument) throws ArgsException {
    booleanValue = true;
  }

  public static boolean getValue(ArgumentMarshaler argumentMarshaler) throws  ArgsException{
    if (argumentMarshaler instanceof BooleanArgumentMarshaler)
      return ((BooleanArgumentMarshaler) argumentMarshaler).booleanValue;
    else
    throw new ArgsException(ArgsException.ErrorCode.INVALID_BOOLEAN_EXPECTED);
  }
}
