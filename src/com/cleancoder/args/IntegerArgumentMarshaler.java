package com.cleancoder.args;

import static com.cleancoder.args.ArgsException.ErrorCode.*;

import java.util.*;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {
  private int intValue = 0;

  public void set(String currentArgument) throws ArgsException {
    if(currentArgument!="NO_VALUE"){
    String parameter = null;
    try {
      parameter = currentArgument;
      intValue = Integer.parseInt(parameter);
    } catch (NumberFormatException e) {
      throw new ArgsException(INVALID_INTEGER, parameter);
    }
    }
    else{
      throw new ArgsException(MISSING_INTEGER);
    }

  }

  public static int getValue(ArgumentMarshaler argumentMarshaler) throws ArgsException{
    if (argumentMarshaler != null && argumentMarshaler instanceof IntegerArgumentMarshaler)
      return ((IntegerArgumentMarshaler) argumentMarshaler).intValue;
    else
      throw new ArgsException(INVALID_INT_EXPECTED);

  }
}
