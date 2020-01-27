package com.cleancoder.args;

import java.util.Iterator;

public interface ArgumentMarshaler {
  void set(String currentArgument) throws ArgsException;
}
