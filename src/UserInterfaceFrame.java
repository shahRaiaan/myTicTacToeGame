/*This program was developed by 
 * SHAH RAIAAN
 * ID - 11038805
 * 
 * 
 * */


//imports
import javax.swing.*;

import java.awt.*;


public class UserInterfaceFrame extends JFrame {
	
//data members
public static String player1 = JOptionPane.showInputDialog(null, // takes player1's name from input
"Player 1\nEnter your Name Please\nYou're Playing with X",
"WELCOME ...Hope you are fine", 1);

public static String player2 = JOptionPane.showInputDialog(null, // takes player2's name from input
"Player 2\nEnter your Name Please\nYou're Playing with O", 
"WELCOME ...Hope you are fine", 1);

//all 9 buttons..numbered 1 through 9
public static JButton button1 =  new JButton();
public static JButton button2 =  new JButton();
public static JButton button3 =  new JButton();
public static JButton button4 =  new JButton();
public static JButton button5 =  new JButton();
public static JButton button6 =  new JButton();
public static JButton button7 =  new JButton();
public static JButton button8 =  new JButton();
public static JButton button9 =  new JButton();
//instance of the listener
public static listener myListener = new listener();


//constructor
public UserInterfaceFrame () {
	
this.setSize(300, 300);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setTitle("Tic Tac Toe   " + player1 +" vs "+ player2 );//displays player's names in the title


//container and layout
Container container = getContentPane();	
container.setLayout(new GridLayout(3,3));

//adding the buttons

container.add(button1);
button1 = editButton(button1);

container.add(button2);
button2 = editButton(button2);

container.add(button3);
button3 = editButton(button3);

container.add(button4);
button4 = editButton(button4);

container.add(button5);
button5 = editButton(button5);

container.add(button6);
button6 = editButton(button6);

container.add(button7);
button7 = editButton(button7);

container.add(button8);
button8 = editButton(button8);

container.add(button9);
button9 = editButton(button9);

}

// method for setting all button properties
public JButton editButton(JButton button ){	
	button.addActionListener(myListener);
	button.setBackground(Color.gray);
	button.setOpaque(true);
	button.setFont(new Font("Serif", Font.BOLD, 65));
	return button;
	
}

}