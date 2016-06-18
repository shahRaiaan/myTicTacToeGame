/*This program was developed by 
 * SHAH RAIAAN
 * ID - 11038805
 * 
 * 
 * */


//imports
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class listener implements ActionListener {
	//data members
	private String letter = " ";
	private int count = 0;
	private boolean win = false;
	private String p1= UserInterfaceFrame.player1;//player 1 (p1) plays with X
	private String p2= UserInterfaceFrame.player2;//player 2 (p2) plays with O

	public void actionPerformed(ActionEvent e) {

		//setting up player's turn (player1/player2)

		count++;//counter to determine even or odd occurrence of mouseclick

		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9)
		{
			letter = "X";	
		} 
		else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10)
		{
			letter = "O";
		}

		//displaying X / O on the button

		if(e.getSource() == UserInterfaceFrame.button1 )

		{
			UserInterfaceFrame.button1.setText(letter);
			UserInterfaceFrame.button1.setEnabled(false);//prevents user from clicking the same button twice
		} 
		else if(e.getSource() == UserInterfaceFrame.button2)
		{
			UserInterfaceFrame.button2.setText(letter);
			UserInterfaceFrame.button2.setEnabled(false);
		} 
		else if(e.getSource() == UserInterfaceFrame.button3)
		{
			UserInterfaceFrame.button3.setText(letter);
			UserInterfaceFrame.button3.setEnabled(false);
		} 
		else if(e.getSource() == UserInterfaceFrame.button4)
		{
			UserInterfaceFrame.button4.setText(letter);
			UserInterfaceFrame.button4.setEnabled(false);
		} 
		else if(e.getSource() == UserInterfaceFrame.button5)
		{
			UserInterfaceFrame.button5.setText(letter);
			UserInterfaceFrame.button5.setEnabled(false);
		} 
		else if(e.getSource() == UserInterfaceFrame.button6)
		{
			UserInterfaceFrame.button6.setText(letter);
			UserInterfaceFrame.button6.setEnabled(false);
		} 
		else if(e.getSource() == UserInterfaceFrame.button7)
		{
			UserInterfaceFrame.button7.setText(letter);
			UserInterfaceFrame.button7.setEnabled(false);
		} 
		else if(e.getSource() == UserInterfaceFrame.button8)
		{
			UserInterfaceFrame.button8.setText(letter);
			UserInterfaceFrame.button8.setEnabled(false);
		} 
		else if(e.getSource() == UserInterfaceFrame.button9)
		{
			UserInterfaceFrame.button9.setText(letter);
			UserInterfaceFrame.button9.setEnabled(false);
		}
		//Determine winning combinations

		//horizontal matching
		if( (UserInterfaceFrame.button1.getText() == UserInterfaceFrame.button2.getText() && 
				UserInterfaceFrame.button2.getText() == UserInterfaceFrame.button3.getText() &&
				UserInterfaceFrame.button1.getText() != "") ||

				(UserInterfaceFrame.button4.getText() == UserInterfaceFrame.button5.getText() && 
				UserInterfaceFrame.button5.getText() == UserInterfaceFrame.button6.getText() && 
				UserInterfaceFrame.button4.getText() != "") ||

				(UserInterfaceFrame.button7.getText() == UserInterfaceFrame.button8.getText() && 
				UserInterfaceFrame.button8.getText() == UserInterfaceFrame.button9.getText() &&
				UserInterfaceFrame.button7.getText() != "") ||

				//virticle matching
				(UserInterfaceFrame.button1.getText() == UserInterfaceFrame.button4.getText() && 
				UserInterfaceFrame.button4.getText() == UserInterfaceFrame.button7.getText() &&
				UserInterfaceFrame.button1.getText() != "")||

				(UserInterfaceFrame.button2.getText() == UserInterfaceFrame.button5.getText() && 
				UserInterfaceFrame.button5.getText() == UserInterfaceFrame.button8.getText() && 
				UserInterfaceFrame.button2.getText() != "")||

				(UserInterfaceFrame.button3.getText() == UserInterfaceFrame.button6.getText() && 
				UserInterfaceFrame.button6.getText() == UserInterfaceFrame.button9.getText() && 
				UserInterfaceFrame.button3.getText() != "")||

				(UserInterfaceFrame.button1.getText() == UserInterfaceFrame.button5.getText() && 
				UserInterfaceFrame.button5.getText() == UserInterfaceFrame.button9.getText() && 
				UserInterfaceFrame.button1.getText() != "")||

				//diagonal matching
				(UserInterfaceFrame.button3.getText() == UserInterfaceFrame.button5.getText() && 
				UserInterfaceFrame.button5.getText() == UserInterfaceFrame.button7.getText() && 
				UserInterfaceFrame.button3.getText() != "") )
		{
			win = true;
		}
		else
		{
			win = false;
		}
		
		//displaying dialog box with the winner's name

		if(win == true && letter == "X")
		{
			JOptionPane.showMessageDialog(null, "Congratulations "+p1 + " YOU WON!\n"
					+ "Tough luck "+p2);
		} 
		else if (win == true && letter == "O")
		{
			JOptionPane.showMessageDialog(null, "Congratulations "+p2 + " YOU WON!\n"
					+ "Tough luck "+ p1);
		}
		else if(count == 9 && win == false)
		{
			JOptionPane.showMessageDialog(null, "GAME IS TIED\nWELL DONE BOTH OF YOU");
		}		

		// restart game --- Yes or No

		if (win==true || (count==9&& win==false)){
			int x = JOptionPane.showConfirmDialog(null, "Wanna play again?", "Confirmation",
					JOptionPane.YES_NO_OPTION);

			if (x==JOptionPane.YES_OPTION){
				UserInterfaceFrame.button1.setText("");	
				UserInterfaceFrame.button1.setEnabled(true);
				UserInterfaceFrame.button2.setText("");
				UserInterfaceFrame.button2.setEnabled(true);
				UserInterfaceFrame.button3.setText("");
				UserInterfaceFrame.button3.setEnabled(true);
				UserInterfaceFrame.button4.setText("");
				UserInterfaceFrame.button4.setEnabled(true);
				UserInterfaceFrame.button5.setText("");
				UserInterfaceFrame.button5.setEnabled(true);
				UserInterfaceFrame.button6.setText("");
				UserInterfaceFrame.button6.setEnabled(true);
				UserInterfaceFrame.button7.setText("");
				UserInterfaceFrame.button7.setEnabled(true);
				UserInterfaceFrame.button8.setText("");
				UserInterfaceFrame.button8.setEnabled(true);
				UserInterfaceFrame.button9.setText("");
				UserInterfaceFrame.button9.setEnabled(true);
				count = 0;
			}
			else {
				JOptionPane.showMessageDialog(null, "What? Chickening out??\nAlright.\nClick OK to close");
				System.exit(0);	
			}
		}
	}


}




