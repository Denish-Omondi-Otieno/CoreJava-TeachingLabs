package chapter_1;

// Let us begin with a simple Java program that displays the message “Welcome to Java!” on the console. 
// Console refers to text entry and display device of a computer.

public class L11_Welcome {
	public static void main(String[] args) {
		// Display message Welcome to Java! to the console
		System.out.println("Welcome to java");
	}
}

// NOTES

//Line 1 - defines a package -   

/* Line 3, 4 and 10 are comments that documents what the program is and how it is constructed.
 * Comments help programmers to communicate and understand the program. 
 * They are not programming statements and thus are ignored by the compiler. 
 * In Java, comments are preceded by two slashes (//) on a line ( line comment,) or enclosed between (/*) (block comment).
 * When the compiler sees //, it ignores all text after // on the same line. 
 * When it sees /*, it scans for the next */ //and ignores any text between /* and */. 

/* Line 6 - defines a class. Every Java program must have at least one class.
 * Each class has a name. By convention, class names start with an uppercase letter. 
 * In this example, the class name is L11_Welcome.
 */ 

/* Line 8 - defines the main method.
 * In order to run a class, the class must contain a method named main. 
 * The program is executed from the main method.
 * A method is a construct that contains statements. 
 * The main method in this program contains the System.out.println statement. 
 * This statement prints a message "Welcome to Java!" to the console
 */  

// Line 11 - Every statement in Java ends with a semicolon (;), known as the statement terminator.

/* Reserved words, or keywords, have a specific meaning to the compiler and cannot be used for other purposes in the program.
 * For example, when the compiler sees the word class, it understands that the word after class is the name for the class. 
 * Other reserved words in this program are public, static, and void.
 */ 

/* A pair of braces in a program forms a block that groups the program’s components.
 * In Java,each block begins with an opening brace { and ends with a closing brace }. 
 * Every class has a class block that groups the data and methods of the class example line 6 to line 14.
 * Every method has a method block that groups the statements in the method. 
 * Blocks can be nested, meaning that one block can be placed within another.
 * Example the method block line 8 to 12 is inside the block from line 6 to 14.
 */


/* Java source programs are case sensitive.
 * It would be wrong, for example, to replace main in the program with Main.
 */

/* Like any programming language, Java has its own syntax, and you need to write code that obeys the syntax rules.
 * If your program violates the rules eg the semicolon is missing, a brace is missing, a quotation mark is missing, 
 * or String is misspelled. The Java compiler will report syntax errors.
 */


