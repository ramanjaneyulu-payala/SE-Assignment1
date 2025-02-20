package com.cleancoder.args;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import static com.cleancoder.args.ArgsException.ErrorCode.*;

public class MapArgumentMarshaler implements ArgumentMarshaler {
  private Map<String, String> map = new HashMap<>();

  public void set(String currentArgument) throws ArgsException {
      try {
        String[] mapEntries = currentArgument.split(",");
        for (String entry : mapEntries) {
          String[] entryComponents = entry.split(":");
          if (entryComponents.length != 2)
            throw new ArgsException(MALFORMED_MAP);
          map.put(entryComponents[0], entryComponents[1]);
        }
      } catch (NoSuchElementException e) {
        throw new ArgsException(MISSING_MAP);
      }
    }


  public static Map<String, String> getValue(ArgumentMarshaler argumentMarshaler) throws ArgsException{
    if (argumentMarshaler != null && argumentMarshaler instanceof MapArgumentMarshaler)
      return ((MapArgumentMarshaler) argumentMarshaler).map;
    else
      throw new ArgsException(INVALID_MAPARGS_EXPECTED);
  }
}
