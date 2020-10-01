package chapter_1;

public class L16_WelcomeInMessageDialogBox {
	public static void main (String [] args) {
		javax.swing.JOptionPane.showMessageDialog(null, "Welcome to Java!");
	}

}

//NOTES 

/* In line 5 - we type the javax.swing.JOptionPane in full.
 * So we don't need to import JOptionPane from javax.swing package.
 */

/* There are two types of import statements: specific import and wildcard import. 
 * The specific import specifies a single class in the import statement. 
 * For example, the following statement imports JOptionPane from package javax.swing.
 * 
 * import javax.swing.JOptionPane;
 * 
 * The wildcard import imports all the classes in a package. 
 * For example, the following statement imports all classes from package javax.swing.
 * 
 * import javax.swing.*;
 * 
 * The information for the classes in an imported package is not read in at compile time or runtime 
 * unless the class is used in the program. 
 * The import statement simply tells the compiler where to locate the classes. 
 * There is no performance difference between a specific import and a wildcard import declaration.
 * Recall that you have used the System class in the statement System.out.println(”Welcome to Java”); in L11_Welcome.java 
 * The System class is not imported because it is in the java.lang package. 
 * All the classes in the java.lang package are implicitly imported in every Java program.
 */