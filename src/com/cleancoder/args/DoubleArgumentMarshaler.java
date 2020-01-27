package com.cleancoder.args;

import static com.cleancoder.args.ArgsException.ErrorCode.*;

import java.util.*;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {
  private double doubleValue = 0;

  public void set(String currentArgument) throws ArgsException {
    if(currentArgument!="NO_VALUE") {
      String parameter = null;
      try {
        parameter = currentArgument;
        doubleValue = Double.parseDouble(parameter);
      } catch (NumberFormatException e) {
        throw new ArgsException(INVALID_DOUBLE, parameter);
      }
    }
    else{
      throw new ArgsException(MISSING_DOUBLE);
    }
  }

  public static double getValue(ArgumentMarshaler argumentMarshaler) throws ArgsException{
    if (argumentMarshaler != null && argumentMarshaler instanceof DoubleArgumentMarshaler)
      return ((DoubleArgumentMarshaler) argumentMarshaler).doubleValue;
    else
      throw new ArgsException(INVALID_DOUBLE_EXPECTED);
  }
}
