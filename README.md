# Clean code Assignment:

### Ramanjaneyulu Payala
### 2019201080
## Objective:
By cleaning the code it should be readable, understandable and optimize the purpose of methods and classes.

### Implemented Features:
1. The code parses the string with different notations and like 'l': boolean, 'p#': integer, 'd*': string.
   Tried with modifying the values like "f##": double.
2. Added extra function to handle try-catch better, the set of executable statements in try kept in separate 
   function for more readability and modularity.
3. For 'set()' in most of the methods here supplied a String List, but it can be handled using only one 
   string at a time,  
   so modified the parameter passing a String at a time instead of List, that we can
   ensure the list is not modified by any other class object.
4. Added test cases that will ensures the functionality of the code behaves as expected and avoids unhandled exceptions.
   
### Requirements and Execution of Test cases:
#### commands:
* run 'ant compile'
* run 'ant jar'
* run 'java -cp build/jar/args.jar com.cleancoder.args.ArgsMain'         
* java -cp "lib/junit-4.13.jar:lib/hamcrest-core-1.3.jar:build/jar/args.jar" ./test/com/cleancoder/args/ArgsTest.java testCreateWithNoSchemaOrArguments

### Clean code:
1. This code is modified in such away that it is more modular and readable.
2. The code is self explanatory and no comments are required, naming convention is followed the names itself depicts
   the purpose of variables, methods, classes.
3. Created new methods to meet the criteria that ensures methods should do one task and length should not be more 
   than 8 lines.
4. Added more test cases to ensure the proper functioning of the code.
5. Proper exception handling is done in this code.
6. In this ensured minimum dependencies among the classes and methods.
7. Ensured that no other class objects modify the Lists and other data.  