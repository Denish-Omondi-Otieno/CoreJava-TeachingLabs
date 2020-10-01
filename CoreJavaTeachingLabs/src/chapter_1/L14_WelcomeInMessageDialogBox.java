package chapter_1;

import javax.swing.JOptionPane;

public class L14_WelcomeInMessageDialogBox {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to java!");
	}

}

// NOTES

/* This application program displays Welcome to Java! 
 * in a message dialog box.
 */

/* This program uses a Java class JOptionPane (line 7). 
 * Java’s predefined classes are grouped into packages. 
 * JOptionPane is in the javax.swing package. 
 * JOptionPane is imported to the program using the import statement in line 3
 * So that the compiler can locate the class without the full name javax.swing.JOptionPane.
*/

/* If you replace JOptionPane on line 7 with javax.swing.JOptionPane
 * You don’t need to import it in line 3.
 * javax.swing.JOptionPane is the full name for the JOptionPane class.
*/

/* The showMessageDialog method is a static method. 
 * Such a method should be invoked by using the class name, followed by a dot operator (.) and the method name with arguments.
 * The showMessageDialog method can be invoked with two arguments, as shown below.
 * JOptionPane.showMessageDialog(null,"Welcome to Java!");
 * The first argument can always be null, null is a Java keyword
*/

/* There are several ways to use the showMessageDialog method. 
 * For the time being, you need to know only two ways. 
 * One is to use a statement, as shown in the example: JOptionPane.showMessageDialog(null, x);
 * where x is a string for the text to be displayed.
 * The other is to use a statement like this one: 
 * JOptionPane.showMessageDialog(null, x, y, JOptionPane.INFORMATION_MESSAGE);
 * where x is a string for the text to be displayed, and y is a string for the title of the message box. 
 * The fourth argument can be JOptionPane.INFORMATION_MESSAGE 
 * which causes the icon ( ) to be displayed in the message box, as shown in pg 17
 * code example is L15WelcomeInMessageDialogBox
 */







