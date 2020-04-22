// Alley Hernandez
// May 2019
// Period 1B
// THIS IS A SNAKE GAME MADE FOR THE PURPOSE OF ENTERTAINING HUMANITY
// I WATCHED MANY YOUTUBE TUTORIALS TO LEARN HOW TO MAKE THIS GAME
// YOUTUBE TUTORIALS: 
//						https://youtu.be/91a7ceECNTc
//						https://youtu.be/S_n3lryyGZM
//						https://youtu.be/xGmXxplj6vs

// SPECIAL SHOUTOUT TO: (THANK YOU FOR HELPING ME DEBUG)
//						Mr. Christopher Warrior
//						The man from Blizzard
//						Everett Craw
//						Jose Salazar
//						Mrs. Diane Lissner
//						Luis Aguilar
//						Danny Jacome-Avila
//						Jacob Rodriguez

// THIS LIBRARY IMPORTS THE JFrame AND ALLOWS US TO CREATE AN OUTER FRAME FOR OUR PROJECT
import javax.swing.JFrame;

// THIS IS THE MAIN ENTRY POINT OF THE PROGRAM
public class Main 
{
	public Main ()
	{
		// THIS SETS UP THE OUTER FRAME FOR OUR PROGRAM
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();
		
		frame.add(gamepanel);
		// THIS ALLOWS US TO CLOSE OUR APPLICATION
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// THIS SETS THE TITLE OF OUR PROGRAM
		frame.setTitle("SNAKE");
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public static void main(String args[])
	{
		new Main();
	}
}
