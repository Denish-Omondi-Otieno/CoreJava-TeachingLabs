package chapter_1;

public class L13_ComputeExpression {                                   // class name
	public static void main(String[] args) {                          // main method
		System.out.println(((10.5 + 2 * 3) / (45 - 3.5)));           // compute expression
	}
}

//NOTES

/* Further, you can perform mathematical computations and display the result to the console.
 * L13_ComputeExpression gives an example of evaluating ((10.5 + 2 * 3) / (45 - 3.5)).
 * The multiplication operator in Java is *. 
 * As you see, it is a straightforward process to translate an arithmetic expression to a Java expression.
 */

// CREATING, COMPILING and EXECUTING a JAVA PROGRAM

/* You have to create your program and compile it before it can be executed. 
 * This process is repetitive, as shown in Figure 1.9. (Introduction to Java 8th Edition Y. Daniel Liang). 
 * If your program has compilation errors, you have to modify the program to fix them, then recompile it.
 * If your program has runtime errors or does not produce the correct result.
 * you have to modify the program, recompile it, and execute it again.
 */

// TEXT EDITOR

/* You can use any text editor or IDE to create and edit a Java source-code file, eg Eclipse, NetBeans, or TextPad. 
 * The source file must end with the extension .java and must have exactly the same name as the public class name. 
 * For example, the file for the source code in Listing 1.1 should be named L11_Welcome.java, 
 * since the public class name is L11_Welcome.
 */

/* A Java compiler translates a Java source file into a Java bytecode file. 
 * The following command compiles L11_Welcome.java: javac L11_Welcome.java.
 */

/* A Java source code is translated into bytecode.
 * Java bytecode can be executed on any computer with a Java Virtual Machine.
 */
 
