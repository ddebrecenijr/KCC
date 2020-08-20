public class Example1 {
    // A Java program begins with a call to main().
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}

/* Program break down

To run this, at the menu bar click on Run -> Run
Notice that the program "Builds" before it is executed. This is known as compiling or building. This will create
an executable file that the Java Runtime is capable of reading and running.

class Example1 { ->
- The keyword class is used to declare a new class. A class is a basic unit of encapsulation.
- The name of the class is called Example1, typically classes begin with a capital letter. Things are encapsulated in
  between the two curly braces {}. We'll discuss more about classes in a later chapter.

// A Java program begins with a call to main()
- This is known as a single-line comment that is used to give a bit of information for the people reading your code.
- Note: Code should always be self-documenting. This means that you shouldn't need a comment to tell what your code is
  doing or what a variable means. If you find yourself doing this, try cleaning your code up a bit.
  The exception here is docstrings which will be covered in a different class.

public static void main (String args[]) {
- This line begins the main() method. A method is also called a subroutine. A Java application begins by calling main().
- We'll ignore most of the details of this line for now, but know that a program must contain this method.

System.out.println("Hello World");
- This essentially tells the compiler that I want to print "Hello World" out to the standard output as a line.
- System is a predefined class available in the JDK.
- .out is an object that encapsulates the standard output of the console.
- .println() is a method that is used to display a string passed to it. It then moves the pointer to the next line.
 */
